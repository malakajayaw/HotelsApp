package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TLogin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlogin);



        }













    public void toHome(View view){
        Intent a = new Intent(TLogin.this,MHome.class);
        startActivity(a);
        Toast.makeText(TLogin.this,"Login Succesfuly!",Toast.LENGTH_LONG).show();
    }



}
