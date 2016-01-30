package com.example.jayempeesee.waiterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Object;

public class WaiterList extends AppCompatActivity {


    EditText editText;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter_list);

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
                Intent intentSearch = new Intent(WaiterList.this, search_waiter.class);
                startActivity(intentSearch);
            }
        });


        Button goToList = (Button) findViewById(R.id.button);
        goToList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(WaiterList.this, waiter_list2.class);
                startActivity(intent);


            }
        });

        EditText editText;
        Button mButton;

    }
}







