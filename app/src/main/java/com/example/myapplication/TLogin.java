package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlogin);
    }
    public void toHome(View view){
        Intent a = new Intent(this,MHome.class);
        startActivity(a);
    }

    public void displaytoast(View view){
        Toast.makeText(TLogin.this , "Login Successfully", Toast.LENGTH_SHORT).show();

    }

}
