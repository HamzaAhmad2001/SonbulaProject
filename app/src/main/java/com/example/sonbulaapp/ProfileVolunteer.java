package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileVolunteer extends AppCompatActivity   {


private Button btn_editProfile;
private TextView ed_id;
SharedPreferences sp;
ImageButton btn_profile;
ImageButton btn_home;
ImageButton btn_archive;
ImageButton btn_Setting;




    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_volunteer);

        ed_id=findViewById(R.id.volunteer_profile_ed_ID);
        getID();



        //setSkillsList();

        btn_editProfile=findViewById(R.id.btn_editProfile);

        this.btn_editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileVolunteer.this, EditProfile.class);
                startActivity(intent);
            }
        });

        btn_Setting=findViewById(R.id.btn_setting);
        btn_Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn_setting=new Intent(ProfileVolunteer.this, SettingPage.class);
                startActivity(intentbtn_setting);
            }
        });

        btn_profile=findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn_profile=new Intent(ProfileVolunteer.this, ProfileVolunteer.class);
                startActivity(intentbtn_profile);
            }
        });

      //  btn_home=findViewById(R.id.btn_home);
        //btn_home.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Intent intentbtn_home=new Intent(VolunteerProfileActivity.this,/*voulnter home*/VolunteerProfileActivity.class);
                //startActivity(intentbtn_home);
           // }
        //});

        btn_archive=findViewById(R.id.btn_archive);
        btn_archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn_archive=new Intent(ProfileVolunteer.this,/*voulnter atchive*/SettingPage.class);
                startActivity(intentbtn_archive);
            }
        });

    }

    public void getID(){
        sp = getSharedPreferences("ID",MODE_PRIVATE);
        String ID=sp.getString("ID","IDD");
        ed_id.setText(ID);
    }

    public void setSkillsList(){
        Bundle bundle = getIntent().getExtras();
        ListView skillslist;
        skillslist = findViewById(R.id.Disabilities_list);


        ArrayList<String> skillsData = new ArrayList<>(0);
        ArrayList<String> skillsDescription = new ArrayList<>();


       // skillsData=bundle.getStringArrayList("stringarray");

        if(skillsData.size() >0 ) {

            for(int i=0 ; i<skillsData.size() ; i++)
            {

                switch(skillsData.get(i))
                {
                    case "Reading in Arabic" :
                        skillsDescription.add("Reading Arabic with a clear voice, good accent, and medium speed");
                        break;

                    case "Reading in English":
                        skillsDescription.add("Reading English with a clear voice, good accent, and medium speed");
                        break;

                    case "Writing in Arabic":
                        skillsDescription.add("Clear handwriting in the Arabic language");
                        break;

                    case "Writing in English":
                        skillsDescription.add("Clear handwriting in the English language");
                        break;

                    case "Being a helpmate":
                        skillsDescription.add("Helping the disabled transition between colleges");
                        break;

                }
            }

        }


        CustomAdapter adapter = new CustomAdapter(this, skillsData ,skillsDescription);

        skillslist.setAdapter(adapter);

    }
}