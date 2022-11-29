package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpVolunteerPage1 extends AppCompatActivity {
Button buttonBackSignup;
Button buttonNextSignupVolunteerPage2;
EditText EditTextTextPersonStudentIDVolunteer;
SharedPreferences.Editor edit;
SharedPreferences sp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer_page1);

         sp = getSharedPreferences("ID",MODE_PRIVATE);
         edit = sp.edit();




        buttonBackSignup=findViewById(R.id.buttonBackSignUp);
        buttonBackSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackSignup=new Intent(SignUpVolunteerPage1.this,SignUpPage.class);
                startActivity(intentBackSignup);
            }
        });
        EditTextTextPersonStudentIDVolunteer=findViewById(R.id.editTextTextPersonStudentIDVolunteer);
        buttonNextSignupVolunteerPage2=findViewById(R.id.buttonNextSignUpVolunteerPage2);
        buttonNextSignupVolunteerPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edit.putString("ID" , EditTextTextPersonStudentIDVolunteer.getText().toString());
                edit.apply();
                Intent intentButtonNextSignUpVolunteerPage2=new Intent(SignUpVolunteerPage1.this,SignUpVolunteerPage2.class);
                startActivity(intentButtonNextSignUpVolunteerPage2);
            }
        });
    }
}