package com.example.ou.smoothiedesserttredingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LogIn extends AppCompatActivity {
    ImageButton logInBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        //button logIn back
        logInBack = (ImageButton) findViewById(R.id.LogInback);
        logInBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(LogIn.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}
