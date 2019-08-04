package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MManageHotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmanage_hotels);
    }

    public void toHotelEdit(View view){
        Intent redirect = new Intent(this,MEditHotelsOver.class);
        startActivity(redirect);
    }
    public void toPackageEdit(View view){
        Intent redirect = new Intent(this,MEditHotelsOver.class);
        startActivity(redirect);
    }
}
