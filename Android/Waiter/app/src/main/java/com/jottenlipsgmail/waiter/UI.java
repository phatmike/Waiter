package com.jottenlipsgmail.waiter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.widget.ArrayAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import Spot;


import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.obj;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class UI extends AppCompatActivity {

    //Array<Spot> spotArray[];


//    public String decoder(String s)
//    {
//        String jsonString = s;
//        JSONObject jsonObject= new JSONObject(jsonString);
//        jsonObject newJSON = jsonObject.getJSONObject("location");
//        jsonObject = newJSONOBject(newJSON.toString());
//        return ;
//    }

    public ArrayList parse(Reader in) {

        //pretending we have a BufferedReader called in // TODO: 1/30/2016
        JsonReader reader = new JsonReader(in);
        ArrayList spotArray = new ArrayList();

        beginArray();
        while(hasNext()){
            beginObject();
            Spot spot = new Spot();
            while(hasNext()){
                nextName();
                spot.name=nextString();
                nextName();
                spot.visitors=nextString();
                nextName();
                spot.waitTime=nextString();
            }
            spotArray.add(spot);
        }
        return spotArray;
    }


    ArrayList<HashMap<String, String> > list = new ArrayList<HashMap<String, String, String>>()











//    public Array<JSONObject> decoder(String s)
//    {
//        JSONParser parser = new JSONParser();
//        String s = "";
//
//        try{
//            Object obj = parser.parse(s);
//            JSONArray arrar = (JSONArray)obj;
//
//        }catch(ParseException pe){
//
//            System.out.println("position: " +pe.getPosition);
//            System.out.println(pe);
//        }
//
//    }
//
//    public array<Spot> convert(JSONobj array[])
//    {
//        for(int i = 0; i<array.size();i++)
//        {
//            //copy each charachteristic of the array[i]
//
//            //Spot[i]
//        }
//
//    }
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
    }


}
