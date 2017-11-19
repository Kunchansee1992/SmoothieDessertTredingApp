package com.example.ou.smoothiedesserttredingapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set fonts of slogan
        txtSlogan = (TextView) findViewById(R.id.txtSlogan);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/SHOWG.TTF");
        txtSlogan.setTypeface(myCustomFont);
    }
}
