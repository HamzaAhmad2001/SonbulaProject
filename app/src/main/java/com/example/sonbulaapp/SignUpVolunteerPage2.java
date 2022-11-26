package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpVolunteerPage2 extends AppCompatActivity {
Button buttonBackSignupVolunteerPage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer_page2);
        buttonBackSignupVolunteerPage1=findViewById(R.id.buttonBackSignUpVolunteerPage1);
        buttonBackSignupVolunteerPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNextSignupVolunteerPage2 =new Intent(SignUpVolunteerPage2.this,SignUpVolunteerPage1.class);
                 startActivity(intentNextSignupVolunteerPage2);
            }
        });
    }
}