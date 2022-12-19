package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;


public class EditProfile extends AppCompatActivity implements View.OnClickListener {

    private Button btn_readingArabic;
    private Button btn_readingEnglish;
    private Button btn_writingArabic;
    private Button btn_writingEnglish;
    private Button btn_helpMate;

    private Button btn_Save;

    private CheckBox chk_readingArabic;
    private CheckBox chk_readingEnglish;
    private CheckBox chk_writingArabic;
    private CheckBox chk_writingEnglish;
    private CheckBox chk_helpMate;

    public ArrayList<String> skillsArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        btn_readingArabic= (Button) findViewById(R.id.btn_DetailsReadingArb);
        btn_readingEnglish= (Button)findViewById(R.id.btn_DetailsReadingEng);
        btn_writingArabic=(Button)findViewById(R.id.btn_DetailsWritingArb);
        btn_writingEnglish=(Button)findViewById(R.id.btn_DetailsWritingEng);
        btn_helpMate=(Button)findViewById(R.id.btn_DetailsHelpMate);
        btn_Save=(Button) findViewById(R.id.btn_save);

        chk_readingArabic = (CheckBox) findViewById(R.id.chk_readingArabic);
        chk_readingEnglish = (CheckBox) findViewById(R.id.chk_readingEnglish);
        chk_writingArabic = (CheckBox) findViewById(R.id.chk_writingArabic);
        chk_writingEnglish = (CheckBox) findViewById(R.id.chk_writingEnglish);
        chk_helpMate = (CheckBox) findViewById(R.id.chk_helpmate);

        btn_readingArabic.setOnClickListener(this);
        btn_readingEnglish.setOnClickListener(this);
        btn_writingArabic.setOnClickListener(this);
        btn_writingEnglish.setOnClickListener(this);
        btn_helpMate.setOnClickListener(this);


        btn_Save.setOnClickListener(this);




    }




    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_save)
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


            Toast.makeText(this,skillsArray.toString(),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, ProfileVolunteer.class);

                intent.putExtra("stringarray",skillsArray);



            startActivity(intent);


            return ;

        }

        switch(v.getId()) {
            case R.id.btn_DetailsReadingArb:
                openDialog("Reading Arabic with a clear voice, good accent, and medium speed");
                break;
            case R.id.btn_DetailsReadingEng:
                openDialog("Reading English with a clear voice, good accent, and medium speed");
                break;

            case R.id.btn_DetailsWritingArb :
                openDialog("Clear handwriting in the Arabic language");
                break;

            case R.id.btn_DetailsWritingEng :
                openDialog("Clear handwriting in the English language");
                break;

            case R.id.btn_DetailsHelpMate :
                openDialog("Helping the disabled transition between colleges");
                break;
        }
    }
}