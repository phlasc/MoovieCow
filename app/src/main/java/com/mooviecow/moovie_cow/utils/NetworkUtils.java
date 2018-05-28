package com.mooviecow.moovie_cow.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.widget.Toast;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class NetworkUtils {


    public static URL buildUrl(int sorting, String DBURL, String APIKEY, String PARAM) {
        //this ain't gonna be pretty but it should work
        String sortingselction;
        switch (sorting) {
            case 1:
                sortingselction = "top_rated";
                break;
            case 2:
                sortingselction = "popular";
                break;
            default:
                sortingselction = "popular";
                break;
        }
        Uri builtUri = Uri.parse(DBURL)
                .buildUpon()
                .appendEncodedPath(sortingselction)
                .appendQueryParameter(PARAM, APIKEY)
                .build();
        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();


        }

        //returning formatted url
        return url;
    }


    //return full response from http request
    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                //no http response so no network and we don't crash
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
