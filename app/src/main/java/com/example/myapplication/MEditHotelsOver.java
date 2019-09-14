package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MEditHotelsOver extends AppCompatActivity {

    EditText Hname, Haddress, Hdistrict, Hgrade;

    DatabaseReference dbref;
    Hotel h1;
    long Hid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medit_hotels_over);

        Hname = (EditText)findViewById(R.id.editText27);
        Haddress = (EditText)findViewById(R.id.editText28);
        Hdistrict = (EditText)findViewById(R.id.editText29);
        Hgrade = (EditText)findViewById(R.id.editText30);

        dbref = FirebaseDatabase.getInstance().getReference().child("Hotel").child("1");

        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String hname =dataSnapshot.child("hname").getValue().toString();
                String haddress =dataSnapshot.child("hadress").getValue().toString();
                String hdistrict =dataSnapshot.child("hdistrict").getValue().toString();
                String hgrade =dataSnapshot.child("hgrade").getValue().toString();

                Hname.setText(hname);
                Haddress.setText(haddress);
                Hdistrict.setText(hdistrict);
                Hgrade.setText(hgrade);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public void toHomeM(View view){
        int tempGrade=Integer.parseInt(Hgrade.getText().toString().trim());

        h1.setHname(Hname.getText().toString().trim());
        h1.setHadress(Haddress.getText().toString().trim());
        h1.setHdistrict(Hdistrict.getText().toString().trim());
        h1.setHgrade(tempGrade);

        dbref.child("1").setValue(h1);

        Intent redirect = new Intent(this,MHome.class);
        startActivity(redirect);
    }
    public void toDelete(View view){
        Intent redirect = new Intent(this,MHome.class);
        startActivity(redirect);
    }
}
