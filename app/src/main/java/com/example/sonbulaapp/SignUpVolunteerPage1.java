package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpVolunteerPage1 extends AppCompatActivity {
Button buttonBackSignup;
Button buttonNextSignupVolunteerPage2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer_page1);

        buttonBackSignup=findViewById(R.id.buttonBackSignUp);
        buttonBackSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackSignup=new Intent(SignUpVolunteerPage1.this,SignUpPage.class);
                startActivity(intentBackSignup);
            }
        });
        buttonNextSignupVolunteerPage2=findViewById(R.id.buttonNextSignUpVolunteerPage2);
        buttonNextSignupVolunteerPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentButtonNextSignUpVolunteerPage2=new Intent(SignUpVolunteerPage1.this,SignUpVolunteerPage2.class);
                startActivity(intentButtonNextSignUpVolunteerPage2);
            }
        });
    }
}