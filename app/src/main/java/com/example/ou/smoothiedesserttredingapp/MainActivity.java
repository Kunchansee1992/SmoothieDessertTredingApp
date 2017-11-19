package com.example.ou.smoothiedesserttredingapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtSlogan;
    Button logIn , register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set fonts of slogan
        txtSlogan = (TextView) findViewById(R.id.txtSlogan);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/SHOWG.TTF");
        txtSlogan.setTypeface(myCustomFont);



        //button logIn
        logIn = (Button) findViewById(R.id.btLogIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this,LogIn.class);
                startActivity(login);
            }
        });

        //button register
        register = (Button) findViewById(R.id.btRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(MainActivity.this,Register.class);
                startActivity(register);
            }
        });
    }
}
