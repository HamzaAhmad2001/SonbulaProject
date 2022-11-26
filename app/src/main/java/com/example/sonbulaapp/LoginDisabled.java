package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginDisabled extends AppCompatActivity {
    TextView textViewSignupLD;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_disabled);
        textViewSignupLD = findViewById(R.id.textViewSignUpLD);

        textViewSignupLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUp =new Intent(LoginDisabled.this,SignUpPage.class);
                startActivity(intentSignUp);
            }
        });
    }
}