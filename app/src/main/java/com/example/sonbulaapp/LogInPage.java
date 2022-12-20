package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInPage extends AppCompatActivity {
    private Button buttonBacktoWelcome;
    TextView textViewSignup;
    Button btnVolunteer;
    Button btnDisabled;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
       buttonBacktoWelcome=findViewById(R.id.buttonBackWelcome);
        buttonBacktoWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWelcomePage();
            }
            public void openWelcomePage()
            {
                backToWelcome();
            }
        });
        textViewSignup = findViewById(R.id.goToSignupPage);
        textViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openSignUp();
            }
        });
        btnVolunteer=findViewById(R.id.buttonVolunteerLoginAs);
        btnVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openLogInVolunteer();
            }
        });
        btnDisabled=findViewById(R.id.buttonDisableLoginAs);
        btnDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogInDisabled();
            }
        });

    }
    public void backToWelcome()
    {
        Intent intent = new Intent(LogInPage.this,MainActivity.class);
        startActivity(intent);
    }
    public void openSignUp()
    {
        Intent intentSignUp =new Intent(LogInPage.this, SignUpPage.class);
        startActivity(intentSignUp);
    }
    public void openLogInVolunteer()
    {
        Intent intentVolunteer =new Intent(LogInPage.this, LoginVolunteer.class);
        startActivity(intentVolunteer);
    }
    public void openLogInDisabled()
    {
        Intent intentDisabled =new Intent(LogInPage.this, LoginDisabled.class);
        startActivity(intentDisabled);
    }

}