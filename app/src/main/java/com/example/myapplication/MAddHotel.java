package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAddHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madd_hotel);
    }
    public void toAddPackage(View view){
        Intent direct = new Intent(this,MAddPackage.class);
        startActivity(direct);
    }
}
