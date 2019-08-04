package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MManagePackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmanage_package);
    }

    public void toHomeP(View view) {
        Intent redirect = new Intent(this, MHome.class);
        startActivity(redirect);
    }
}