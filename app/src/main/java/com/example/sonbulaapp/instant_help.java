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

    private ImageButton profile;
    private ImageButton home;
    private ImageButton archive;
    private ImageButton settings;
    private Button findVolunteer;
    private Button btn_DetailsReadingArb;
    private Button btn_DetailsReadingEng;
    private Button btn_DetailsWritingArb;
    private Button btn_DetailsWritingEng;
    private Button btn_DetailsHelpMate;
    private Button btn_DetailsSignLanguage;

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

        findVolunteer = (Button) findViewById(R.id.findVolunteerButton);
        findVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openFindingVolunteer();}
        });

        btn_DetailsReadingArb=findViewById(R.id.btn_DetailsArabicReader);
        btn_DetailsReadingArb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsReadingArb();
            }
        });
        btn_DetailsReadingEng=findViewById(R.id.btn_DetailsEnglishReader);
        btn_DetailsReadingEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsReadingEng();
            }
        });
        btn_DetailsWritingArb=findViewById(R.id.btn_DetailsArabicWriter);
        btn_DetailsWritingArb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsWritingArb();
            }
        });
        btn_DetailsWritingEng=findViewById(R.id.btn_DetailsEnglishWriter);
        btn_DetailsWritingEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsWritingEng();
            }
        });
        btn_DetailsHelpMate=findViewById(R.id.btn_DetailsHelpmate);
        btn_DetailsHelpMate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsHelpMate();
            }
        });

        btn_DetailsSignLanguage=findViewById(R.id.btn_DetailsSignLanguage);
        btn_DetailsSignLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBtnDetailsSignLanguage();
            }
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

   public void openFindingVolunteer()
    {
        Intent intent = new Intent(instant_help.this, instant_help.class);
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
    }
    public void openBtnDetailsHelpMate()
    {
        openDialog("You need a volunteer to help you in moving between colleges.");
    }
    public void openBtnDetailsSignLanguage()
    {
        openDialog("Interpreting in sign language effectively");
    }


    public void openInstantNeed()
    {
        Intent intent = new Intent(instant_help.this, instant_help.class);
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
        Intent intent = new Intent(instant_help.this, SettingPage.class);
        startActivity(intent);
    }

}