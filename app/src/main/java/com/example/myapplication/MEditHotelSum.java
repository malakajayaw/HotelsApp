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

public class MEditHotelSum extends AppCompatActivity {
TextView l,m,n,o,p;
Button btndel;
DatabaseReference dbrefff;
String Hname,Hadress,Hdistrict,Hgrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medit_hotel_sum);

        l=(TextView) findViewById(R.id.textView45);

        btndel=(Button) findViewById(R.id.button19);

        dbrefff =  FirebaseDatabase.getInstance().getReference().child("Hotel").child("1");

        dbrefff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Hname=dataSnapshot.child("Hname").getValue().toString();
                Hadress=dataSnapshot.child("Hadress").getValue().toString();
                Hdistrict=dataSnapshot.child("Hdistrict").getValue().toString();
                Hgrade=dataSnapshot.child("Hgrade").getValue().toString();

                m.setText(Hname);
                n.setText(Hadress);
                o.setText(Hdistrict);
                p.setText(Hgrade);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }


        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toDeleteP(Hname);
            }
        });
    }


    public void toDeleteP(String Hname) {
        DatabaseReference deluser=FirebaseDatabase.getInstance().getReference("Hotel").child("2");

        Intent dell = new Intent(MEditHotelSum.this,MEditHotelSum.class);
        startActivity(dell);

        deluser.removeValue();

        Toast.makeText(MEditHotelSum.this,"Successfully Deleted",Toast.LENGTH_LONG).show();



    }

    public void toEditP(View view) {
        Intent redirect = new Intent(this, MManagePackage.class);
        startActivity(redirect);
    }
}
