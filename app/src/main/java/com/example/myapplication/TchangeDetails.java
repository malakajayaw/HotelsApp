package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TchangeDetails extends AppCompatActivity {
TextView a,b,c,d;
Button btn;
DatabaseReference ureff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchange_details);

        a=(TextView)findViewById(R.id.unameview);
        b=(TextView)findViewById(R.id.uemailview);
        c=(TextView)findViewById(R.id.ucontactview);
        d=(TextView)findViewById(R.id.upasswordview);
        btn=(Button)findViewById(R.id.Tcdetails);


                ureff = FirebaseDatabase.getInstance().getReference().child("User").child("1");

                ureff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String uname =dataSnapshot.child("uname").getValue().toString();
                        String uemail =dataSnapshot.child("uemail").getValue().toString();
                        String umobile =dataSnapshot.child("umobile").getValue().toString();
                        String upassword =dataSnapshot.child("upassword").getValue().toString();

                        a.setText(uname);
                        b.setText(uemail);
                        c.setText(umobile);
                        d.setText(upassword);


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }


    public void onclickhome(View view){
        Intent gghome = new Intent(this,MHome.class);
        startActivity(gghome);
    }
}
