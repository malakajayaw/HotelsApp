package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelcome);
    }

    public void login(View view) {
        Intent singin = new Intent(this, TLogin.class);
        startActivity(singin);

    }
    public void register(View view){
        Intent singup = new Intent(this,SingUp.class);
        startActivity(singup);
    }
}
