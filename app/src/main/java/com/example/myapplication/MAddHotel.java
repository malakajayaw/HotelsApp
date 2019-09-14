package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MAddHotel extends AppCompatActivity {

    EditText Hname, Haddress, Hdistrict, Hgrade;
    Button addHotel;
    DatabaseReference dbref;
    Hotel h1;
    long Hid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madd_hotel);
        Hname = (EditText)findViewById(R.id.editText9);
        Haddress = (EditText)findViewById(R.id.editText10);
        Hdistrict = (EditText)findViewById(R.id.editText11);
        Hgrade = (EditText)findViewById(R.id.editText12);

        addHotel = (Button)findViewById(R.id.button4);

        h1 = new Hotel();

        dbref = FirebaseDatabase.getInstance().getReference().child("Hotel");
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    Hid = (dataSnapshot.getChildrenCount());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        addHotel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int tempGrade=Integer.parseInt(Hgrade.getText().toString().trim());

                h1.setHname(Hname.getText().toString().trim());
                h1.setHadress(Haddress.getText().toString().trim());
                h1.setHdistrict(Hdistrict.getText().toString().trim());
                h1.setHgrade(tempGrade);

                dbref.child(String.valueOf(Hid+1)).setValue(h1);
                Toast.makeText(MAddHotel.this,"Hotel Added Successfully!",Toast.LENGTH_LONG).show();


            }
        });

    }
    public void toAddPackage(View view){
        Intent direct = new Intent(this,MAddPackage.class);
        startActivity(direct);
    }
}
