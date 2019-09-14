package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SingUp extends AppCompatActivity {

EditText uname,uemail,ucontact,upassword;
Button usave;
DatabaseReference uref;
User usr;



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

        usave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int umobile=Integer.parseInt(ucontact.getText().toString().trim());

                usr.setUname(uname.getText().toString().trim());
                usr.setUemail(uemail.getText().toString().trim());
                usr.setUmobile(umobile);
                usr.setUpassword(upassword.getText().toString().trim());

                uref.child("user1").push().setValue(usr);
                Toast.makeText(SingUp.this,"SuingedUp Successfully!",Toast.LENGTH_LONG).show();
            }
        });











    }




    public void tohome(View view){
        Intent a = new Intent(this,MHome.class);
        startActivity(a);
    }

}
