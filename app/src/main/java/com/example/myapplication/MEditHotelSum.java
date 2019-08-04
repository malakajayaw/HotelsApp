package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MEditHotelSum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medit_hotel_sum);
    }

    public void toDeleteP(View view) {
        Intent redirect = new Intent(this, MHome.class);
        startActivity(redirect);
    }

    public void toEditP(View view) {
        Intent redirect = new Intent(this, MManagePackage.class);
        startActivity(redirect);
    }
}
