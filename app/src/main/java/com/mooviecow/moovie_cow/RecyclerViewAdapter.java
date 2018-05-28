package com.mooviecow.moovie_cow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public final static String TAG = "RecyclerViewAdapter";
    //variables needed by this class
    //also allows us to pass information over from the gson requests on the mainactivity.java
    private ArrayList<String> mImageLinks;
    private ArrayList<String> mMovieTitle;
    private ArrayList<String> mRelease;
    private ArrayList<Double> mRating;
    private ArrayList<String> mPlot;

    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mImageLinks, ArrayList<String> mMovieTitle, Context mContext, ArrayList<String> mRelease, ArrayList<Double> mRating, ArrayList<String> mPlot) {

        this.mImageLinks = mImageLinks;
        this.mMovieTitle = mMovieTitle;
        this.mContext = mContext;
        this.mRating = mRating;
        this.mRelease = mRelease;
        this.mPlot = mPlot;

        //constructor for variables
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate and initialize View as view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        //passing the view to viewholder so we can return it
        final ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder was called ");
        // this is where we populate the widgets in the recyclerview and list them out for each in the arraylist
        Picasso.get().load(mContext.getString(R.string.MOVIEDB_BASE_IMGURL) + mImageLinks.get(position)).into(holder.viewimage);
        //Picasso.get(this).load(getString(R.string.MOVIEDB_BASE_IMGURL) + movie.getPoster_path()).into(iVreplace);
        holder.viewtext.setText(mMovieTitle.get(position));
        holder.viewimage.setContentDescription(mMovieTitle.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(mContext, details_movie.class);
            Bundle bDouble = new Bundle();
            @Override
            public void onClick(View v) {
                // putting intents variables to pass to details on click


                intent.putExtra("poster_path", mImageLinks.get(position));
                intent.putExtra("title", mMovieTitle.get(position));

                bDouble.putDouble("rating", mRating.get(position));

                intent.putExtras(bDouble);
                intent.putExtra("overview", mPlot.get(position));
                intent.putExtra("release", mRelease.get(position));
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {

        return mMovieTitle.size();
        //returning the size of the arraylist so the recyclerview knows
        //how big the list is
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        //this holds the widgets in memory
        //so declare them here
        ImageView viewimage;
        TextView viewtext;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            // getting our fields ready by initializing them into the viewholder
            viewimage = itemView.findViewById(R.id.imageViewCard);
            viewtext = itemView.findViewById(R.id.textViewCard);
            parentLayout = itemView.findViewById(R.id.parent_view);

        }
    }
}
