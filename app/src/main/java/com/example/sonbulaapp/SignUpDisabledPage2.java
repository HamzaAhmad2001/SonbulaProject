package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpDisabledPage2 extends AppCompatActivity {
Button buttonBackSignupDisabledPage1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page2);

        buttonBackSignupDisabledPage1=findViewById(R.id.buttonBackSignUpDisabledPage1);
        buttonBackSignupDisabledPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbuttonBackSignUpDisabledPage1=new Intent(SignUpDisabledPage2.this,SignUpDisabledPage1.class);
                startActivity(intentbuttonBackSignUpDisabledPage1);
            }
        });
    }
}