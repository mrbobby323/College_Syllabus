package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdyear extends AppCompatActivity {
    Button first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdyear);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfirst();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensecond();
            }
        });
    }

    private void opensecond() {
        Intent intent=new Intent(this,ECE32.class);
        startActivity(intent);
    }

    private void openfirst() {
        Intent intent=new Intent(this,ECE31.class);
        startActivity(intent);
    }
}