package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpPage extends AppCompatActivity {
 private Button buttonBacktoWelcome;
    TextView textViewLogin;
    Button buttonVolunteerSignupAs;
    Button buttonDisabledSingupAs;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        buttonBacktoWelcome=findViewById(R.id.buttonBackToWelcome);
        buttonBacktoWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    openWelcomePage();
            }
            public void openWelcomePage()
            {
                Intent intent = new Intent(SignUpPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        textViewLogin=findViewById(R.id.goToLoginPage);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogIn =new Intent(SignUpPage.this,LogInPage.class);
                startActivity(intentLogIn);

            }
        });
        buttonVolunteerSignupAs=findViewById(R.id.buttonVolunteerSignUpAs);
        buttonVolunteerSignupAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUpVolunteerPage1 =new Intent(SignUpPage.this,SignUpVolunteerPage1.class);
                startActivity(intentSignUpVolunteerPage1);
            }
        });
        buttonDisabledSingupAs=findViewById(R.id.Disabled);
        buttonDisabledSingupAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbuttonDisabledSingupAs=new Intent(SignUpPage.this,SignUpDisabledPage1.class);
                startActivity(intentbuttonDisabledSingupAs);
            }
        });

    }
}