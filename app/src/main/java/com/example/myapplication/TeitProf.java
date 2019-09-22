package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TeitProf extends AppCompatActivity {
TextView na,em,mble,pss;
Button btnn;
DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teit_prof);

        na=(TextView)findViewById(R.id.euname);
        em=(TextView)findViewById(R.id.euemail);
        mble=(TextView)findViewById(R.id.eucontact);
        pss=(TextView)findViewById(R.id.eupassword);
        btnn=(Button)findViewById(R.id.eusave);

    }

    public void updateprof(){



    }
}
