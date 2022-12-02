package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

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


public class disabled_profile extends AppCompatActivity {

    private Button edit;
    private ImageButton profile;
    private ImageButton home;
    private ImageButton archive;
    private ImageButton settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disabled_profile);

        edit = (Button) findViewById(R.id.btn_edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openEditProfile();}
        });



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



        archive  = (ImageButton) findViewById(R.id.btn_archive);
        archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openArchive();}
        });



        settings  = (ImageButton) findViewById(R.id.btn_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings();}
        });



    }
    public void openEditProfile()
    {
        Intent intent = new Intent(disabled_profile.this, editDisabledProfile.class);
        startActivity(intent);
    }

    public void openProfile()
    {
        Intent intent = new Intent(disabled_profile.this, disabled_profile.class);
        startActivity(intent);
    }

    public void openHome()
    {
        Intent intent = new Intent(disabled_profile.this, disabled_home.class);
        startActivity(intent);
    }

    public void openArchive()
    {
        Intent intent = new Intent(disabled_profile.this, /* Archive صفحة مش موجودة*/disabled_profile.class);
        startActivity(intent);
    }

    public void openSettings()
    {
        Intent intent = new Intent(disabled_profile.this, /*صفحة مش موجودةSettings */disabled_profile.class);
        startActivity(intent);
    }



}