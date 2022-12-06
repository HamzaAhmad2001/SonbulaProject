package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class disabled_home extends AppCompatActivity {
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
        });


        settings  = (ImageButton) findViewById(R.id.btn_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings();}
        });*/



    }
    public void openInstantHelp()
    {
        Intent intent = new Intent(disabled_home.this, instant_help.class);
        startActivity(intent);
    }

    public void openScheduleMeeting()
    {
        Intent intent = new Intent(disabled_home.this, /*schedle meeting صفحة مش موجودة*/editDisabledProfile.class);
        startActivity(intent);
    }

    public void openProfile()
    {
        Intent intent = new Intent(disabled_home.this, disabled_profile.class);
        startActivity(intent);
    }

    public void openHome()
    {
        Intent intent = new Intent(disabled_home.this, disabled_home.class);
        startActivity(intent);
    }

    public void openArchive()
    {
        Intent intent = new Intent(disabled_home.this, /* Archive صفحة مش موجودة*/disabled_profile.class);
        startActivity(intent);
    }

    public void openSettings()
    {
        Intent intent = new Intent(disabled_home.this, /*صفحة مش موجودةSettings */disabled_profile.class);
        startActivity(intent);
    }

}