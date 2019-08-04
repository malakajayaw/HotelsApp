package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BUpdatePlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bupdate_place);
    }
    public void updateplaces(View view){
        Intent updateplc = new Intent(this,MHome.class);
        startActivity(updateplc);

    }
}
