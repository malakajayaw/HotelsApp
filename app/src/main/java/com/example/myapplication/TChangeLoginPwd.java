package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TChangeLoginPwd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchange_login_pwd);
    }
    public void gotohm(View view){
        Intent tohome = new Intent(this,MHome.class);
        startActivity(tohome);
    }
}
