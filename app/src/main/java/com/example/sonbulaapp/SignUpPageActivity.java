package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpPageActivity extends AppCompatActivity {
 private Button buttonBackSignUp;
    TextView textViewLogin;
    Button buttonVolunteerSignupAs;
    Button buttonDisabledSingupAs;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        buttonBackSignUp=findViewById(R.id.buttonBackWelcome);
        buttonBackSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    backToWelcomePage();
            }

        });
        textViewLogin=findViewById(R.id.goToSignupPage);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openLogInPage();

            }
        });
        buttonVolunteerSignupAs=findViewById(R.id.signup_btn_volunteer);
        buttonVolunteerSignupAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpVolunteerPage1();
            }
        });
        buttonDisabledSingupAs=findViewById(R.id.signup_btn_disabled);
        buttonDisabledSingupAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpDisabledPage1();
            }
        });

    }
    public void backToWelcomePage()
    {
        Intent intent = new Intent(SignUpPageActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void openLogInPage()
    {
        Intent intentLogIn =new Intent(SignUpPageActivity.this, LogInPageActivity.class);
        startActivity(intentLogIn);
    }
    public void openSignUpVolunteerPage1()
    {
        Intent intentSignUpVolunteerPage1 =new Intent(SignUpPageActivity.this, SignUpVolunteerPage1Activity.class);
        startActivity(intentSignUpVolunteerPage1);
    }
    public void openSignUpDisabledPage1()
    {
        Intent intentbuttonDisabledSingupAs=new Intent(SignUpPageActivity.this, SignUpDisabledPage1Activity.class);
        startActivity(intentbuttonDisabledSingupAs);
    }
}