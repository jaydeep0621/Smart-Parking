package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class area extends AppCompatActivity {
    private Button p1;
    private Button p2;
    private Button p3;
    private Button p4;
    private Button p5;
    private Button p6;
    private Button p7;
    private Button p8;
    private Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        setupUIviews();
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p6.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p7.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p8.setBackgroundColor(Color.parseColor("#212121"));
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbook();
            }
        });
    }
    private void setupUIviews(){
        p1=(Button) findViewById(R.id.btnp1);
        p2=(Button) findViewById(R.id.btnp2);
        p3=(Button) findViewById(R.id.btnp3);
        p4=(Button) findViewById(R.id.btnp4);
        p5=(Button) findViewById(R.id.btnp5);
        p6=(Button) findViewById(R.id.btnp6);
        p7=(Button) findViewById(R.id.btnp7);
        p8=(Button) findViewById(R.id.btnp8);
        ok=(Button) findViewById(R.id.btnok);

    }
    private void openbook(){
        Intent i = new Intent(this, book.class);
        startActivity(i);
    }
}