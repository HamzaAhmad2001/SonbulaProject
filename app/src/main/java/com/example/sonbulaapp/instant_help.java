package com.example.sonbulaapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class instant_help extends AppCompatActivity {

    private Button next;
    private ImageButton profile;
    private ImageButton home;
    private ImageButton archive;
    private ImageButton settings;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_help);

       Spinner sp_places= findViewById(R.id.selectPlace);

       sp_places.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               //to program the spinner
               //method when an item is selected
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
        //method when no item selected
           }
       });

        next = (Button) findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openInstantNeed();}
        });


        profile = (ImageButton) findViewById(R.id.buttom_bar_btn_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openProfile();}
        });

        home = (ImageButton) findViewById(R.id.buttom_bar_btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHome();}
        });

       /* archive  = (ImageButton) findViewById(R.id.btn_archive);
        archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openArchive();}
        });


        settings  = (ImageButton) findViewById(R.id.btn_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings();}
        });*/


    }
    public void openInstantNeed()
    {
        Intent intent = new Intent(instant_help.this, instantNeeds.class);
        startActivity(intent);
    }
    public void openProfile()
    {
        Intent intent = new Intent(instant_help.this, disabled_profile.class);
        startActivity(intent);
    }


    public void openHome()
    {
        Intent intent = new Intent(instant_help.this, disabled_home.class);
        startActivity(intent);
    }
    public void openArchive()
    {
        Intent intent = new Intent(instant_help.this, /* Archive صفحة مش موجودة*/disabled_profile.class);
        startActivity(intent);
    }
    public void openSettings()
    {
        Intent intent = new Intent(instant_help.this, /*صفحة مش موجودةSettings */disabled_profile.class);
        startActivity(intent);
    }

}