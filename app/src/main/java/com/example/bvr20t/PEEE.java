package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PEEE extends AppCompatActivity {
    Button unit1peee,PEEEunit2,PEEEunit3,PEEEunit4,PEEEunit5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peee);
        unit1peee=findViewById(R.id.unit1peee);
        PEEEunit2=findViewById(R.id.PEEEunit2);
        PEEEunit3=findViewById(R.id.PEEEunit3);
        PEEEunit4=findViewById(R.id.PEEEunit4);
        PEEEunit5=findViewById(R.id.PEEEunit5);
        PEEEunit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPEEEunit3();
            }
        });
        PEEEunit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPEEEunit4();
            }
        });
        PEEEunit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPEEEunit5();
            }
        });

        PEEEunit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPEEEunit2();
            }
        });
        unit1peee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openunit1peee();
            }
        });
    }

    private void openPEEEunit5() {
        Intent intentunit5=new Intent(this, com.example.bvr20t.PEEEunit5.class);
        startActivity(intentunit5);
    }

    private void openPEEEunit4() {
        Intent intentunit4=new Intent(this, com.example.bvr20t.PEEEunit4.class);
        startActivity(intentunit4);
    }

    private void openPEEEunit3() {
        Intent intentunit3=new Intent(this, com.example.bvr20t.PEEEunit3.class);
        startActivity(intentunit3);

    }

    private void openPEEEunit2() {
        Intent intentunit2=new Intent(this, com.example.bvr20t.PEEEunit2.class);
        startActivity(intentunit2);
    }

    private void openunit1peee() {
        Intent intentunit1=new Intent(this,PEEEUnit1.class);
        startActivity(intentunit1);
    }
}