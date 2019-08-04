package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BAddPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badd_place);
    }
    public  void addplaces(View view){
        Intent addplc = new Intent(this,MHome.class);
        startActivity(addplc);
    }


}
