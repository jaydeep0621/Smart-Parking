package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class MainActivity extends AppCompatActivity {
    private static int time=1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(signInAccount != null)
                    opendash();
                else
                    openactivity2();
            }
        },time);
    }
    private void opendash(){
        Intent i = new Intent(this, dash.class);
        startActivity(i);
    }
    private void openactivity2(){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}