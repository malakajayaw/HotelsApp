package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TAnimation extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent animation = new Intent(TAnimation.this ,TWelcome.class);
                startActivity(animation);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
