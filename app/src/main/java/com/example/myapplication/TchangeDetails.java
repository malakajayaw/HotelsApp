package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TchangeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchange_details);
    }
    public void changepassword(View view){
        Intent changepwd = new Intent(this,TChangeLoginPwd.class);
        startActivity(changepwd);
    }
    public void onclickhome(View view){
        Intent gghome = new Intent(this,MHome.class);
        startActivity(gghome);
    }
}
