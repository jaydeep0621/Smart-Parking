package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class park extends AppCompatActivity {
    private ImageButton park;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        setupUIviews();
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea();
            }
        });
    }
    private void setupUIviews(){
        park = (ImageButton) findViewById(R.id.imageButton3);
    }
    private void openarea(){
        Intent i = new Intent(this,area.class);
        startActivity(i);
    }
}