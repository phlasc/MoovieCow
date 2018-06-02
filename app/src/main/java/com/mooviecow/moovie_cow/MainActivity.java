package com.mooviecow.moovie_cow;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.mooviecow.moovie_cow.model.MovieList;
import com.mooviecow.moovie_cow.utils.NetworkUtils;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    //declare variables
    private final ArrayList<String> mImageLinks = new ArrayList<>();
    private final ArrayList<String> mMovieTitle = new ArrayList<>();
    private final ArrayList<String> mRelease = new ArrayList<>();
    private final ArrayList<Double> mRating = new ArrayList<>();
    private final ArrayList<String> mPlot = new ArrayList<>();
    private final ArrayList<Integer> mMovieId = new ArrayList<>();
    private int sortCode = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // found out the hard way that you can't reference buttons or initialize them
        //  until setcontentview is done
        //so here that is lol
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // call on method to start all the wheels for our background task
        // to get those wheels turning note to self: where the fudge is my errorlogging so bad
        // ain't nobody got time for that
        MakeMovieDatabaseBackground(sortCode);
    }


    public void MakeMovieDatabaseBackground(int sortCode) {
        String MOVIEDB_BASE_URL = this.getString(R.string.MOVIEDB_BASE_URL);
        String MOVIEDB_API_KEY = this.getString(R.string.MOVIEDB_API_KEY);
        String PARAM_QUERY = this.getString(R.string.PARAM_QUERY);
        URL url = NetworkUtils.buildUrl(sortCode, MOVIEDB_BASE_URL, MOVIEDB_API_KEY, PARAM_QUERY);
        new MovieDatabaseBackground().execute(url);
    }


    //lets do this in the background to json
    //refactored from other project <3
    public class MovieDatabaseBackground extends AsyncTask<URL, Void, String> {
        // this whole thing gives me bad feelings but it works
        // need to check for internet connection here at later time
        @Override
        protected String doInBackground(URL... params) {
            URL searchUrl = params[0];
            String results = null;
            try {
                results = NetworkUtils.getResponseFromHttpUrl(searchUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return results;
        }

        @Override
        protected void onPostExecute(String results) {
            if (results != null && !results.equals("")) {
                Gson gson = new Gson();
                // g
                MovieList movie = gson.fromJson(results, MovieList.class);
                // create movie object
                for (int i = 0; i < movie.getResults().size(); i++) {

                    //cycle through gson object and add the values to the listarray object
                    mMovieTitle.add(movie.getResults().get(i).getTitle());
                    mImageLinks.add(movie.getResults().get(i).getPoster_path());
                    mRelease.add(movie.getResults().get(i).getRelease_date());
                    mRating.add(movie.getResults().get(i).getVote_average());
                    mPlot.add(movie.getResults().get(i).getOverview());
                    mMovieId.add(movie.getResults().get(i).getId());


                }
            } else {
                Toast.makeText(MainActivity.this, "No Network Connection", Toast.LENGTH_LONG).show();
            }
            startRecyclerView().notifyDataSetChanged();

        }
    }


    public RecyclerViewAdapter startRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mImageLinks, mMovieTitle, this, mRelease, mRating, mPlot, mMovieId);
        recyclerView.setAdapter(adapter);

        // make this bad boy into a grid layout because ain't nobody got time for Listview
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        return adapter;

    }

    public void setNewData(int s) {
        mImageLinks.clear();
        mMovieTitle.clear();
        startRecyclerView().notifyDataSetChanged();
        MakeMovieDatabaseBackground(s);
        if (s == 1) {
            sortCode = 1;
        }
        if (s == 2) {
            sortCode = 2;
        } else {
            sortCode = 1;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_toggleSorting).setTitle(this.getString(R.string.mostpopular));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_toggleSorting) {

            switch (sortCode) {
                case 1:

                    item.setTitle(this.getString(R.string.toprated));
                    setNewData(2);
                    // I don't know if this is implemented correctly but
                    // it works and setNewData takes the paramater arg and
                    // puts new data into view while notifying the adapter
                    // that data set has been modified so it doesn't crash while
                    // switching views and scrolling at the same time

                    break;
                case 2:
                    item.setTitle(this.getString(R.string.mostpopular));
                    setNewData(1);


                    break;
                default:
                    break;
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
