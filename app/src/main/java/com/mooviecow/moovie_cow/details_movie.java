package com.mooviecow.moovie_cow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class details_movie extends AppCompatActivity {

    private static final String TAG = "details_movie";
    private String poster_path;
    private String title;
    private Double rating;
    private String release;
    private String plot;

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

            poster_path = getIntent().getStringExtra("poster_path");
            title = getIntent().getStringExtra("title");




            Bundle bDouble = getIntent().getExtras();
            assert bDouble != null;
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



        titleTextView.setText(title);
        plotView.setText(plot);
        releaseView.setText(release);
        ratingView.setText(Double.toString(rating));
        Picasso.get().load(this.getString(R.string.MOVIEDB_BASE_IMGURL) + poster_path).into(posterBigImageView);
        Picasso.get().load(this.getString(R.string.MOVIEDB_BASE_IMGURL) + poster_path).into(posterRegImageView);


    }
}
