package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstyear extends AppCompatActivity {
    Button firstsem,secondsem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstyear);
        firstsem=findViewById(R.id.firstsem);
        secondsem=findViewById(R.id.secondsem);
        secondsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensecond();
            }
        });
        firstsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstream();
            }
        });


    }

    private void opensecond() {
        Intent intent=new Intent(this,ECE12.class);
        startActivity(intent);
    }

    private void openstream() {
        Intent intentstream=new Intent(this,ECE11.class);
        startActivity(intentstream);
    }


}

    
