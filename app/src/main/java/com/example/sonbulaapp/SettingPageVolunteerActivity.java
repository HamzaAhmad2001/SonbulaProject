package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingPageVolunteerActivity extends AppCompatActivity {
Button btn_EditVolunteerProfile;
Button buttonLogout;
private ImageButton btn_profile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_page);

        btn_EditVolunteerProfile=findViewById(R.id.volunteer_settings_btn_editProfile);
        btn_EditVolunteerProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditProfile();
            }
        });

        buttonLogout=findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogOutPage();
            }
        });

        btn_profile=(ImageButton) findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileVolunteer();
            }
        });

    }
    public void openEditProfile()
    {
        Intent intentbtn_editProfile=new Intent(SettingPageVolunteerActivity.this, EditVolunteerProfileActivity.class);
        startActivity(intentbtn_editProfile);
    }
    public void openLogOutPage()
    {
        Intent intentButtonLogout=new Intent(SettingPageVolunteerActivity.this, LogOutPageVoulnteerActivity.class);
        startActivity(intentButtonLogout);
    }
    public void openProfileVolunteer()
    {
        Intent intentBtn_ProfileVolunteer=new Intent(SettingPageVolunteerActivity.this, VolunteerProfileActivity.class);
        startActivity(intentBtn_ProfileVolunteer);
    }
}