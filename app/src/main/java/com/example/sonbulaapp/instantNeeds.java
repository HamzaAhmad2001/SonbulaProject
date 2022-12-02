package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
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

public class instantNeeds extends AppCompatActivity {

    private Button findVolunteer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_needs);

        findVolunteer = (Button) findViewById(R.id.findVolunteerButton);
        findVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openFindingVolunteer();}
        });

    }
    public void openFindingVolunteer()
    {
        Intent intent = new Intent(instantNeeds.this,/*صفحة مش موجودة finding*/ instantNeeds.class);
        startActivity(intent);
    }
}