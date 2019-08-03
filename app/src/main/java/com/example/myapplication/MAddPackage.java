package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAddPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madd_package);
    }

    public void morePackages(View view){
        Intent direct = new Intent(this,MAddPackage.class);
        startActivity(direct);
    }

    public void back(View view){
        Intent direct = new Intent(this,MAddHotel.class);
        startActivity(direct);
    }
}
