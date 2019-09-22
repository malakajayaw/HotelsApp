package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TLogin extends AppCompatActivity {
TextView usnm,pwd;
Button usv;
User U;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlogin);

        usnm =(EditText) findViewById(R.id.Tusername);
        pwd =(EditText) findViewById(R.id.Tusername);

        usv =(Button) findViewById(R.id.Tloginusr);
        U = new User();
        usv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                U.setUname(usnm.getText().toString().trim());
                U.setUpassword(pwd.getText().toString().trim());

                String uunm = usnm.getText().toString();
                String upwd = pwd.getText().toString();

                if (uunm.isEmpty() || upwd.isEmpty()){
                    Toast.makeText(TLogin.this,"Login Failed!",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent a = new Intent(TLogin.this,MHome.class);
                    startActivity(a);
                    Toast.makeText(TLogin.this,"Login Succesfuly!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }















    public void toHome(View view){

    }



}
