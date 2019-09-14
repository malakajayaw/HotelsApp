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


public class SingUp extends AppCompatActivity {

EditText uname,uemail,ucontact,upassword;
Button usave;
DatabaseReference uref;
User usr;
long uid=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        uname =(EditText)findViewById(R.id.uname);
        uemail=(EditText)findViewById(R.id.uemail);
        ucontact =(EditText)findViewById(R.id.ucontact);
        upassword=(EditText)findViewById(R.id.upassword);

        usave=(Button)findViewById(R.id.usave);

        usr = new User();

        uref = FirebaseDatabase.getInstance().getReference().child("User");
        uref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                    uid=(dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        usave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int umobile=Integer.parseInt(ucontact.getText().toString().trim());

                usr.setUname(uname.getText().toString().trim());
                usr.setUemail(uemail.getText().toString().trim());
                usr.setUmobile(umobile);
                usr.setUpassword(upassword.getText().toString().trim());

                
                uref.child(String.valueOf(uid+1)).setValue(usr);
                Toast.makeText(SingUp.this,"SuingedUp Successfully!",Toast.LENGTH_LONG).show();
            }
        });











    }




    public void tohome(View view){
        Intent a = new Intent(this,MHome.class);
        startActivity(a);
    }

}
