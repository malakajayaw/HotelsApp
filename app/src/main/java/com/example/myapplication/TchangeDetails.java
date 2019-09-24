package com.example.myapplication;

import androidx.annotation.NonNull;
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

public class TchangeDetails extends AppCompatActivity {
TextView a,b,c,d;
Button btn;
DatabaseReference ureff;
String uname,uemail,umobile,upassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchange_details);

        a=(TextView)findViewById(R.id.unameview);
        b=(TextView)findViewById(R.id.uemailview);
        c=(TextView)findViewById(R.id.ucontactview);
        d=(TextView)findViewById(R.id.upasswordview);

        btn=(Button)findViewById(R.id.udelete);


                ureff = FirebaseDatabase.getInstance().getReference().child("User").child("1");

                ureff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                         uname =dataSnapshot.child("uname").getValue().toString();
                         uemail =dataSnapshot.child("uemail").getValue().toString();
                         umobile =dataSnapshot.child("umobile").getValue().toString();
                         upassword =dataSnapshot.child("upassword").getValue().toString();

                        a.setText(uname);
                        b.setText(uemail);
                        c.setText(umobile);
                        d.setText(upassword);




                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                       deluser(uname);
                    }
                });

            }
            public void deluser(String uname){
            DatabaseReference deluser =FirebaseDatabase.getInstance().getReference("User").child("3");



                Intent delhome = new Intent(this,TWelcome.class);
                startActivity(delhome);

                deluser.removeValue();

                Toast.makeText(TchangeDetails.this,"Successfully Deleted",Toast.LENGTH_LONG).show();
            }


    public void editprof(View view){
        Intent editprof = new Intent(this,TeitProf.class);
        startActivity(editprof);

    }
}
