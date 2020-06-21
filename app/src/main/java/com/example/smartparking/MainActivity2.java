package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupUIviews();
        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity2.this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.MainActivity));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, final int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("Choose A Login Method")) {
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(MainActivity2.this, "Invalid Choice", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else if (adapterView.getItemAtPosition(i).equals("Login As Admin")){
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            openadmin();
                        }
                    });
                }
                else if (adapterView.getItemAtPosition(i).equals("Login As User")){
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            openuser();
                        }
                    });
                }
                }
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, "Login Method", Toast.LENGTH_SHORT).show();
                }
            });
        }
        });
    }
    private void setupUIviews(){
        ok = (Button)findViewById(R.id.btnok);
    }
    private void openadmin(){
        Intent i = new Intent(this,login.class);
        startActivity(i);
    }
    private void openuser(){
        Intent i = new Intent(this,login.class);
        startActivity(i);
    }
}
