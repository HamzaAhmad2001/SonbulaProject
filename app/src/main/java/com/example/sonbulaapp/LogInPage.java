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
        buttonBacktoWelcome=findViewById(R.id.buttonBackToWelcome);
        buttonBacktoWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWelcomePage();
            }
            public void openWelcomePage()
            {
                Intent intent = new Intent(LogInPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        textViewSignup = findViewById(R.id.textViewSignUp);
        textViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUp =new Intent(LogInPage.this,SignUpPage.class);
                startActivity(intentSignUp);
            }
        });
        btnVolunteer=findViewById(R.id.buttonVolunteerLoginAs);
        btnVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVolunteer =new Intent(LogInPage.this,LoginVolunteer.class);
                startActivity(intentVolunteer);
            }
        });
        btnDisabled=findViewById(R.id.Disabled);
        btnDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDisabled =new Intent(LogInPage.this,LoginDisabled.class);
                startActivity(intentDisabled);
            }
        });

    }
}