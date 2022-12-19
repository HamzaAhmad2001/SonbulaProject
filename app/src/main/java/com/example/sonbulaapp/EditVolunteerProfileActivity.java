package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;


public class EditVolunteerProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_readingArabic;
    private Button btn_readingEnglish;
    private Button btn_writingArabic;
    private Button btn_writingEnglish;
    private Button btn_helpMate;
    private Button btn_signLanguage;

    private Button btn_Save;
    private Button btn_Cancel;

    private CheckBox chk_readingArabic;
    private CheckBox chk_readingEnglish;
    private CheckBox chk_writingArabic;
    private CheckBox chk_writingEnglish;
    private CheckBox chk_helpMate;
    private CheckBox chk_signLanguage;


    public ArrayList<String> skillsArray = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_volunteer);

        btn_readingArabic= (Button) findViewById(R.id.btn_DetailsReadingArabic);
        btn_readingEnglish= (Button)findViewById(R.id.btn_DetailsReadingEng);
        btn_writingArabic=(Button)findViewById(R.id.btn_DetailsWritingArabic);
        btn_writingEnglish=(Button)findViewById(R.id.btn_DetailsWritingEng);
        btn_helpMate=(Button)findViewById(R.id.btn_DetailsHelpMate);
        btn_signLanguage= (Button)findViewById(R.id.btn_DetailsSignLanguage);
        btn_Save=(Button) findViewById(R.id.editprofile_volunteer_btn_save);

        chk_readingArabic = (CheckBox) findViewById(R.id.editprofile_volunteer_chk_raedingArab);
        chk_readingEnglish = (CheckBox) findViewById(R.id.editprofile_volunteer_chk_raedingEng);
        chk_writingArabic = (CheckBox) findViewById(R.id.editprofile_volunteer_chk_writingArab);
        chk_writingEnglish = (CheckBox) findViewById(R.id.editprofile_volunteer_chk_writingEng);
        chk_helpMate = (CheckBox) findViewById(R.id.editprofile_volunteer_chk_helpmate);
        chk_signLanguage = (CheckBox)  findViewById(R.id.editprofile_volunteer_chk_signLanguage);


        btn_readingArabic.setOnClickListener(this);
        btn_readingEnglish.setOnClickListener(this);
        btn_writingArabic.setOnClickListener(this);
        btn_writingEnglish.setOnClickListener(this);
        btn_helpMate.setOnClickListener(this);
        btn_signLanguage.setOnClickListener(this);


        btn_Save.setOnClickListener(this);
        btn_Cancel= (Button)findViewById(R.id.editprofile_volunteer_btn_cancel);
        btn_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { clickCancel(); }
        });




    }

public void clickCancel()
{
    Intent intent=new Intent(EditVolunteerProfileActivity.this,VolunteerProfileActivity.class);
    startActivity(intent);
}


    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.editprofile_volunteer_btn_save)
        {
            if(chk_readingArabic.isChecked())
                skillsArray.add("Reading in Arabic");
             if(chk_readingEnglish.isChecked())
                skillsArray.add("Reading in English");
             if(chk_writingArabic.isChecked())
                skillsArray.add("Writing in Arabic");
             if(chk_writingEnglish.isChecked())
                skillsArray.add("Writing in English");
            if(chk_helpMate.isChecked())
                skillsArray.add("Being a helpmate");
            if(chk_signLanguage.isChecked())
                skillsArray.add("Sign Language Interpreter");


            Toast.makeText(this,skillsArray.toString(),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, VolunteerProfileActivity.class);

                intent.putExtra("stringarray",skillsArray);



            startActivity(intent);


            return ;

        }

        switch(v.getId()) {
            case R.id.btn_DetailsReadingArabic:
                openDialog("Reading Arabic with a clear voice, good accent, and medium speed");
                break;
            case R.id.btn_DetailsReadingEng:
                openDialog("Reading English with a clear voice, good accent, and medium speed");
                break;

            case R.id.btn_DetailsWritingArabic:
                openDialog("Clear handwriting in the Arabic language");
                break;

            case R.id.btn_DetailsWritingEng :
                openDialog("Clear handwriting in the English language");
                break;

            case R.id.btn_DetailsHelpMate :
                openDialog("Helping the disabled transition between colleges");
                break;

            case R.id.btn_DetailsSignLanguage:
                openDialog("Interpreting in sign language effectively");
                break;


        }
    }
}