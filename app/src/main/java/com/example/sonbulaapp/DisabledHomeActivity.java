package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DisabledHomeActivity extends AppCompatActivity {
     private Button instantHelp;
     private Button scheduleMeeting;
     private ImageButton profile;
     private ImageButton home;
     private ImageButton archive;
     private ImageButton settings;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disabled_home);

        instantHelp = (Button) findViewById(R.id.btn_instantHelp);
        instantHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openInstantHelp();}
        });



       /* scheduleMeeting = (Button) findViewById(R.id.btn_scheduleMeeting);
        scheduleMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openScheduleMeeting();}
        });*/



        profile = (ImageButton) findViewById(R.id.btn_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openProfile();}
        });



        home = (ImageButton) findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHome();}
        });



       /* archive  = (ImageButton) findViewById(R.id.btn_archive);
        archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openArchive();}
        });*/


        settings  = (ImageButton) findViewById(R.id.btn_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings();}
        });



    }
    public void openInstantHelp()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, InstantHelpActivity.class);
        startActivity(intent);
    }

    public void openScheduleMeeting()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, /*schedle meeting صفحة مش موجودة*/EditDisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openProfile()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, DisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openHome()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, DisabledHomeActivity.class);
        startActivity(intent);
    }

    public void openArchive()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, /* Archive صفحة مش موجودة*/DisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openSettings()
    {
        Intent intent = new Intent(DisabledHomeActivity.this, SettingsPageDisabledActivity.class);
        startActivity(intent);
    }

}