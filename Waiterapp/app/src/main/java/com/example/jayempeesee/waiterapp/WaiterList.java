package com.example.jayempeesee.waiterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.Object;

public class WaiterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter_list);



        Button goToList = (Button) findViewById(R.id.button);
        goToList.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WaiterList.this, waiter_list2.class);
                startActivity(intent);



            }
        });
    }

}






