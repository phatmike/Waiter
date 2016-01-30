package com.example.jayempeesee.waiterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button mButton;
    String str = "getMockLocations";
    static String urlStr = "https://t1f3ktfmy8.execute-api.us-west-2.amazonaws.com/prod/";
    static BufferedInputStream in = null;
    static ArrayList spotArray = new ArrayList();

    public static void sendData(String str) throws IOException {

        if(!str.equals(null))
        {
            urlStr = urlStr + str;
        }
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try{
            in = new BufferedInputStream(connection.getInputStream());
            connection = (HttpURLConnection) url.openConnection();

        }finally {
            connection.disconnect();
        }
    }

    public static ArrayList parse(BufferedInputStream in) {

        JsonReader reader = new JsonReader(new InputStreamReader(in));

        try {
            reader.beginArray();


            while (reader.hasNext()) {
                reader.beginObject();
                Spot spot = new Spot();
                while (reader.hasNext()) {
                    reader.nextName();
                    spot.name = reader.nextString();
                    reader.nextName();
                    spot.visitors = reader.nextString();
                    reader.nextName();
                    spot.waitTime = reader.nextString();
                }

                spotArray.add(spot);
            }
        }catch(IOException e){
            System.out.println("IOException :)");

        }
        return spotArray;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }


    @Override
    protected void onStart() {
        super.onStart();
        mButton = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.searchView);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.v("EditText", editText.getText().toString());
            }
        });

        Button goToSearch = (Button) findViewById(R.id.button2);
        goToSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view2) {
                Intent intentSearch = new Intent(MainActivity.this, search_waiter.class);
                startActivity(intentSearch);
                String s = editText.getText().toString();
                try{MainActivity.sendData(s);}catch(IOException e){}
                spotArray = MainActivity.parse(in);

                Intent intent = new Intent(MainActivity.this, WaiterList.class );
                intent.putStringArrayListExtra("spotArray", spotArray);
                startActivity(intent);
            }

        });
    }


//        Button goToList = (Button) findViewById(R.id.button);
//        goToList.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent(WaiterList.this, waiter_list2.class);
//                startActivity(intent);
//            }
//           });





//ned to be in obj or smth
//    public void sendData(String str) throws IOException {
//
//
//        if(!str.equals(null))
//        {
//            urlStr = urlStr + str;
//        }
//        URL url = new URL(urlStr);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        try{
//            in = new BufferedInputStream(connection.getInputStream());
//            connection = (HttpURLConnection) url.openConnection();
//
//        }finally {
//            connection.disconnect();
//        }
//    }
//
//    public ArrayList parse(BufferedInputStream in) {
//
//        JsonReader reader = new JsonReader(new InputStreamReader(in));
//        ArrayList spotArray = new ArrayList();
//
//        try {
//            reader.beginArray();
//
//
//            while (reader.hasNext()) {
//                reader.beginObject();
//                Spot spot = new Spot();
//                while (reader.hasNext()) {
//                    reader.nextName();
//                    spot.name = reader.nextString();
//                    reader.nextName();
//                    spot.visitors = reader.nextString();
//                    reader.nextName();
//                    spot.waitTime = reader.nextString();
//                }
//
//                spotArray.add(spot);
//            }
//        }catch(IOException e){
//            System.out.println("IOException :)");
//
//        }
//        return spotArray;
//
//    }


}



