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
    private Button btn_DetailsReadingArb;
    private Button btn_DetailsReadingEng;
    private Button btn_DetailsWritingArb;
    private Button btn_DetailsWritingEng;
    private Button btn_DetailsHelpMate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_needs);

      /*  findVolunteer = (Button) findViewById(R.id.findVolunteerButton);
        findVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openFindingVolunteer();}
        });*/
        btn_DetailsReadingArb=findViewById(R.id.btn_DetailsReadingArb);
        btn_DetailsReadingArb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsReadingArb();
            }
        });
        btn_DetailsReadingEng=findViewById(R.id.btn_DetailsReadingEng);
        btn_DetailsReadingEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsReadingEng();
            }
        });
        btn_DetailsWritingArb=findViewById(R.id.btn_DetailsWritingArb);
        btn_DetailsWritingArb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsWritingArb();
            }
        });
        btn_DetailsWritingEng=findViewById(R.id.btn_DetailsWritingEng);
        btn_DetailsWritingEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsWritingEng();
            }
        });
        btn_DetailsHelpMate=findViewById(R.id.btn_DetailsHelpMate);
        btn_DetailsHelpMate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsHelpMate();
            }
        });

    }
    public void openFindingVolunteer()
    {
        Intent intent = new Intent(instantNeeds.this,/*صفحة مش موجودة finding*/ instantNeeds.class);
        startActivity(intent);
    }

    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }
    public void openBtnDetailsReadingArb()
    {
        openDialog("You need a volunteer to read Arabic. language in a good accent.voice and medium speed.");
    }
    public void openBtnDetailsReadingEng()
    {
        openDialog("You need a volunteer to read English language in a good accent.voice and medium speed.");
    }
    public void openBtnDetailsWritingArb()
    {
        openDialog("You need a good,clear Arabic language handwriter");
    }
    public void openBtnDetailsWritingEng()
    {
        openDialog("You need a good,clear English language handwriter");
    }public void openBtnDetailsHelpMate()
    {
        openDialog("You need a volunteer to help you in moving between colleges.");
    }
}