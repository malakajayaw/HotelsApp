package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TeitProf extends AppCompatActivity {
TextView na,em,mble,pss;
Button btnn;
DatabaseReference reff;
User u;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teit_prof);

        na=(TextView)findViewById(R.id.euname);
        em=(TextView)findViewById(R.id.euemail);
        mble=(TextView)findViewById(R.id.eucontact);
        pss=(TextView)findViewById(R.id.eupassword);
        btnn=(Button)findViewById(R.id.eusave);

        u = new  User();

        reff = FirebaseDatabase.getInstance().getReference().child("User").child("1");



        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int eucontact=Integer.parseInt(mble.getText().toString().trim());

                u.setUname(na.getText().toString().trim());
                u.setUemail(em.getText().toString().trim());
                u.setUmobile(eucontact);
                u.setUpassword(pss.getText().toString().trim());

                Intent updateusr = new Intent(TeitProf.this,TchangeDetails.class);
                startActivity(updateusr);
                Toast.makeText(TeitProf.this,"Updated correctly!!",Toast.LENGTH_LONG).show();
            }
        });



    }
    public void updateuser(View view){

    }


}
