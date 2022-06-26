package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondyear extends AppCompatActivity {
    Button first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondyear);
        first=findViewById(R.id.first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfirst();
            }
        });
        second=findViewById(R.id.second);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensecond();
            }
        });
    }

    private void openfirst() {
        Intent intent=new Intent(this,ECE21.class);
        startActivity(intent);
    }

    private void opensecond() {
        Intent intent=new Intent(this,ece22.class);
        startActivity(intent);
    }


}