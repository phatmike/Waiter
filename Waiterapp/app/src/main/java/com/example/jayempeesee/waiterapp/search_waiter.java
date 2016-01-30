package com.example.jayempeesee.waiterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.Object;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class search_waiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_waiter);
    }
    String str = "getMockLocations";
    String urlStr = "https://t1f3ktfmy8.execute-api.us-west-2.amazonaws.com/prod/";
    BufferedReader in = null;



//ned to be in obj or smth
    public void sendData(String str) throws IOException{

        if(!str.equals(null))
        {
            urlStr = urlStr + str;
        }
        URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try{
            InputStream in = new BufferedInputStream(connection.getInputStream());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        }finally {
            connection.disconnect();
        }
    }
}
