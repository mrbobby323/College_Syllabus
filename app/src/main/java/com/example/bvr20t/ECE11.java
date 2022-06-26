package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ECE11 extends AppCompatActivity {
    Button peee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece11);
        peee=findViewById(R.id.PEEE);
       peee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openpeee();
           }
       });
    }

    private void openpeee() {
        Intent intentpeee=new Intent(this,PEEE.class);
        startActivity(intentpeee);
    }
}