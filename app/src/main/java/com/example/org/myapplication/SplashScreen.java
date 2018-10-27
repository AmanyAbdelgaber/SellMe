package com.example.org.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    final String  FILE = "com.example.org.myapplication.myFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences(FILE, Context.MODE_PRIVATE);
                String name = sharedPreferences.getString("name", "not available");
                String password = sharedPreferences.getString("password", "not available");
                if(name.equals("not available") || password.equals("not available" )){
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);

                }else{
                    Intent intent = new Intent(SplashScreen.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        }, 3000);



    }
}
