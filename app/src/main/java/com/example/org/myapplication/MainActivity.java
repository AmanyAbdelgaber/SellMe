package com.example.org.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameTxt;
    EditText passTxt;
    Button loginBtn;
    AlertDialog alertDialog;
    final String  FILE = "com.example.org.myapplication.myFile";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxt = findViewById(R.id.nameTxt);
        passTxt = findViewById(R.id.passTxt);
        loginBtn = findViewById(R.id.loginBtn);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(nameTxt.getText().toString().isEmpty() || passTxt.getText().toString().isEmpty()){
                    alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Login Failed");
                    alertDialog.setMessage("please, enter user name and password");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

                    alertDialog.show();
                }else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    SharedPreferences sharedPreferences = getSharedPreferences(FILE, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("name", nameTxt.getText().toString());
                    editor.putString("password", passTxt.getText().toString());
                    editor.apply();
                    startActivity(intent);
                }


            }
        });


    }


}
