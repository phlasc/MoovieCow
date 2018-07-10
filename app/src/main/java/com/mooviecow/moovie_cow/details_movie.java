package com.mooviecow.moovie_cow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.os.AsyncTask;
import android.widget.Toast;

import com.google.gson.Gson;
import com.mooviecow.moovie_cow.model.MovieList;
import com.squareup.picasso.Picasso;
import com.mooviecow.moovie_cow.utils.NetworkUtils;
import com.mooviecow.moovie_cow.R;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;

public class details_movie extends AppCompatActivity {

    private static final String TAG = "details_movie";
    private String poster_path;
    private String title;
    private Double rating;
    private String release;
    private String plot;
    private Integer movieID;

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_movie);
        Log.d(TAG, "onCreate: ");
        getIncomingIntent();
        setDetails();

    }


    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for the intent yo");
        if (getIntent().hasExtra("poster_path") && getIntent().hasExtra("title")) {
            Log.d(TAG, "getIncomingIntent: intent found");

            Bundle bDouble = getIntent().getExtras();
            assert bDouble != null;
            poster_path = getIntent().getStringExtra("poster_path");
            title = getIntent().getStringExtra("title");
            movieID = bDouble.getInt("movieId");


            //lint was saying getDouble could throw a null pointer exeption without assert
            rating = bDouble.getDouble("rating");
            release = getIntent().getStringExtra("release");
            plot = getIntent().getStringExtra("overview");


        }
    }


    private void setDetails() {
        Log.d(TAG, "setDetails: set the details in details_movie activity");
        // TextView title = findViewById(R.id.titleDetails);
        // ImageView poster_path = findViewById(R.id.bigPoster);

        ImageView posterBigImageView = findViewById(R.id.bigPosterBack);
        ImageView posterRegImageView = findViewById(R.id.bigPoster);
        TextView titleTextView = findViewById(R.id.titleDetails);
        TextView plotView = findViewById(R.id.plotTextView);
        TextView releaseView = findViewById(R.id.release_textView);
        TextView ratingView = findViewById(R.id.release_textView2);


        ListView reviewList = findViewById(R.id.reviewList);

        // why can't strings be accessed out fo the main classes context >.>
        String dbUrlBase = getResources(R.string.MOVIEDB_BASE_URL);
        URL url = NetworkUtils.getVideos("260513",);
        new details_movie.MovieDatabaseBackground().execute(url);
        plotView.setText(plot);
        releaseView.setText(release);
        ratingView.setText(Double.toString(rating));
        Picasso.get().load(this.getString(R.string.MOVIEDB_BASE_IMGURL) + poster_path).into(posterBigImageView);
        Picasso.get().load(this.getString(R.string.MOVIEDB_BASE_IMGURL) + poster_path).into(posterRegImageView);


    }

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
}




