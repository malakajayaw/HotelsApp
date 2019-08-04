package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MEditHotelsOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medit_hotels_over);
    }
    public void toHomeM(View view){
        Intent redirect = new Intent(this,MHome.class);
        startActivity(redirect);
    }
    public void toDelete(View view){
        Intent redirect = new Intent(this,MHome.class);
        startActivity(redirect);
    }
}
