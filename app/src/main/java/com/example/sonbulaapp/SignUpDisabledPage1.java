package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpDisabledPage1 extends AppCompatActivity {
Button buttonBackSignupDisabled;
Button buttonNextSignupDisabledPage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page1);
        buttonBackSignupDisabled=findViewById(R.id.buttonBackSignUpDisabled);
        buttonBackSignupDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentButtonBackSignUpDisabled=new Intent(SignUpDisabledPage1.this,SignUpPage.class);
                startActivity(intentButtonBackSignUpDisabled);
            }
        });
        buttonNextSignupDisabledPage2=findViewById(R.id.buttonNextSignUpDisabledPage2);
        buttonNextSignupDisabledPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbuttonNextSignUpDisabledPage2=new Intent(SignUpDisabledPage1.this,SignUpDisabledPage2.class);
                startActivity(intentbuttonNextSignUpDisabledPage2);
            }
        });
    }
}