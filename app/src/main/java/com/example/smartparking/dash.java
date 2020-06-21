package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dash extends AppCompatActivity {

    public AutoCompleteTextView edit;
    public Button search;
    private static final String[] location = new String[]{
           "KIET Group of Institution","RKG Group of Institution","VVIP Address"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        setupUIviews();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location);
        edit.setAdapter(adapter);
        String input = edit.getText().toString();
        if(input == "KIET Group of Institution"){
            openlocat();
        }
        else if(input == "RKG Group of Institution"){
            Toast.makeText(this, "Parking Not Avaliable", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Parking Not Avaliable", Toast.LENGTH_SHORT).show();
        }
        }
    public void setupUIviews(){
        edit = (AutoCompleteTextView) findViewById(R.id.location);
        search = (Button) findViewById(R.id.btnsearch);
    }
    public void openlocat(){
        Intent i = new Intent(this,park.class);
        startActivity(i);
    }
}