package com.example.jayempeesee.waiterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.JsonReader;

import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import Spot;

import java.io.Reader;
import java.lang.obj;
import java.util.ArrayList;

public class WaiterList extends AppCompatActivity {

    ArrayList<String>spotArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waiter_list);
        Intent i = getIntent();

        spotArray = i.getStringArrayListExtra("spotArray");
    }







