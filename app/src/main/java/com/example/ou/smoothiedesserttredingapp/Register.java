package com.example.ou.smoothiedesserttredingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Register extends AppCompatActivity {
    ImageButton btRegisterBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btRegisterBack = (ImageButton) findViewById(R.id.registerBack);
        btRegisterBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btRegisterback = new Intent(Register.this,MainActivity.class);
                startActivity(btRegisterback);
            }
        });
    }
}
