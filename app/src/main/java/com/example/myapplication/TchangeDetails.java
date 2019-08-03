package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TchangeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchange_details);
    }
    public void clicktohome(View view){
        Intent tohome = new Intent(this,MHome.class);
        startActivity(tohome);
    }
    public void onclickhome(View view){
        Intent gghome = new Intent(this,MHome.class);
        startActivity(gghome);
    }
}
