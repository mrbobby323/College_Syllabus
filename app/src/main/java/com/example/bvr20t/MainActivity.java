package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button first,second,third,fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(Button) findViewById(R.id.first);
        second=(Button) findViewById(R.id.second);
        third=(Button) findViewById(R.id.third);
        fourth=(Button) findViewById(R.id.fourth);

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
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openthird();
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfourth();
            }
        });


    }

    private void openfourth() {
        Intent intent4=new Intent(this,fourthyear.class);
        startActivity(intent4);
    }

    private void openthird() {
        Intent intent3=new Intent(this,thirdyear.class);
        startActivity(intent3);
    }


    private void opensecond() {
        Intent intent2=new Intent(this,secondyear.class);
        startActivity(intent2);

    }

    private void openfirst() {
        Intent intent=new Intent(this,firstyear.class);
        startActivity(intent);

    }
}