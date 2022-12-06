package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginVolunteer extends AppCompatActivity {
    TextView textViewSignupLV;
    Button buttonLogInVolunteer;
    EditText password_Volunteer,id_Volunteer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_volunteer);


       /* button login and required id & password
       id_Volunteer=findViewById(R.id.id_Volunteer);
        password_Volunteer=findViewById(R.id.password_Volunteer);

        buttonLogInVolunteer=findViewById(R.id.buttonLogInVolunteer);
        buttonLogInVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id_volunteer=id_Volunteer.getText().toString();
                String pass_volunteer=password_Volunteer.getText().toString();
                if(id_volunteer.equals("1937517"))
                {
                    if(pass_volunteer.equals("0000"))
                    {
                        Intent intentButtonLogInVolunteer=new Intent(LoginVolunteer.this,ahmadjlhgljbhj.class);
                        startActivity(intentButtonLogInVolunteer);
                    }
                    else
                    {
                        password_Volunteer.setError("Please enter your id student");
                    }
                }
                else
                {
                    id_Volunteer.setError("Please enter your password");

                }

            }
        });*/


        textViewSignupLV = findViewById(R.id.textViewSignUpLV);

        textViewSignupLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });
    }
    public void openSignUp()
    {
        Intent intentSignUp =new Intent(LoginVolunteer.this,SignUpPage.class);
        startActivity(intentSignUp);
    }
}