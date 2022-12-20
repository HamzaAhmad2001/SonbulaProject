package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingsPageDisabledActivity extends AppCompatActivity {
    Button btn_EditDisableProfile;
    Button buttonLogout;
    private ImageButton btn_profile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page_disabled);

        btn_EditDisableProfile=findViewById(R.id.disabled_setting_btn_editProfile);
        btn_EditDisableProfile.setOnClickListener(new View.OnClickListener() {
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
        Intent intentbtn_editProfile=new Intent(SettingsPageDisabledActivity.this, editDisabledProfile.class);
        startActivity(intentbtn_editProfile);
    }
    public void openLogOutPage()
    {
        Intent intentButtonLogout=new Intent(SettingsPageDisabledActivity.this, LogOutPageDisabledActivity.class);
        startActivity(intentButtonLogout);
    }
    public void openProfileVolunteer()
    {
        Intent intentBtn_ProfileVolunteer=new Intent(SettingsPageDisabledActivity.this, disabled_profile.class);
        startActivity(intentBtn_ProfileVolunteer);
    }
}