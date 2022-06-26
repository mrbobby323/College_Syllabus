package com.example.bvr20t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ece22 extends AppCompatActivity {
    Button EB,LDIC,GS,MCA,MMCV,TLEF

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece22);
        EB=findViewById(R.id.EB);
        LDIC=findViewById(R.id.LDIC);
        GS=findViewById(R.id.GS);
        MCA=findViewById(R.id.MCA);
        MMCV=findViewById(R.id.MMCV);
        TLEF=findViewById(R.id.TLEF);
        EB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendeb();
            }
        });
        LDIC.setOnClickListener();
    }
}