package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondActivity extends AppCompatActivity {
    private int imgId;
    private ImageView supermoon;
    private ImageView waterfall;
    private ConstraintLayout setBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        supermoon = findViewById(R.id.supermoon);
        waterfall = findViewById(R.id.waterfall);
        setBackground =findViewById(R.id.setBackground);

        supermoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.supermoon;
                setBackground.setBackgroundResource(imgId);
                finish();
            }
        });
        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                imgId = R.drawable.waterfall;
                setBackground.setBackgroundResource(imgId);
                finish();

            }
        });

    }
    public void finish(){
        Intent myIntent = new Intent();
        myIntent.putExtra("imgId",imgId);
        setResult(RESULT_OK, myIntent);
        super.finish();
    }
}
