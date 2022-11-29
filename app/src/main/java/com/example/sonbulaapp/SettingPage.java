package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingPage extends AppCompatActivity {
Button btn_EditProfile;
Button buttonLogout;
private ImageButton btn_ProfileVolunteer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_page);

        btn_EditProfile=findViewById(R.id.btn_editProfile);
        btn_EditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn_editProfile=new Intent(SettingPage.this,EditProfile.class);
                startActivity(intentbtn_editProfile);
            }
        });

        buttonLogout=findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentButtonLogout=new Intent(SettingPage.this,LogOutPage.class);
                startActivity(intentButtonLogout);
            }
        });

        btn_ProfileVolunteer=(ImageButton) findViewById(R.id.btn_profileVolunteer);
        btn_ProfileVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBtn_ProfileVolunteer=new Intent(SettingPage.this,ProfileVolunteer.class);
                startActivity(intentBtn_ProfileVolunteer);
            }
        });

    }
}