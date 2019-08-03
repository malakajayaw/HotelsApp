package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MHotelAddSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhotel_add_summary);
    }

    public void sumback(View view){
        Intent direct = new Intent(this,MAddHotel.class);
        startActivity(direct);
    }

    public void sumsubmit(View view){
        Intent direct = new Intent(this,MHome.class);
        startActivity(direct);
    }
}
