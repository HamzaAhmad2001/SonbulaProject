package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ProfileVolunteer extends AppCompatActivity   {

    EditProfile ed = new EditProfile();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_volunteer);

        setSkillsList();



    }

    public void setSkillsList(){
        Bundle bundle = getIntent().getExtras();
        ListView skillslist;
        skillslist = findViewById(R.id.Skills_list);


        ArrayList<String> skillsData = new ArrayList<>(0);
        ArrayList<String> skillsDescription = new ArrayList<>();


        skillsData=bundle.getStringArrayList("stringarray");



        if(skillsData.size() >0) {

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

        else {

            skillsData.add("Reading in Arabic");
            skillsDescription.add("Reading Arabic with a clear voice, good accent, and medium speed");
            skillsData.add("Reading in English");
            skillsDescription.add("Reading English with a clear voice, good accent, and medium speed");

        }



        CustomAdapter adapter = new CustomAdapter(this, skillsData ,skillsDescription);

        skillslist.setAdapter(adapter);

    }
}