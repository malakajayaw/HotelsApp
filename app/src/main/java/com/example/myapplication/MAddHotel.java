package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
    }
    public void toAddPackage(View view){
        Intent direct = new Intent(this,MAddPackage.class);
        startActivity(direct);
    }
}
