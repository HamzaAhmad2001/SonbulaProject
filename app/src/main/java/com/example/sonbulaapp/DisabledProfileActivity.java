package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DisabledProfileActivity extends AppCompatActivity {

    private Button edit;
    private ImageButton profile;
    private ImageButton home;
    private ImageButton archive;
    private ImageButton settings;
    private TextView ed_id;
    SharedPreferences sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disabled_profile);


        ed_id=findViewById(R.id.disabaled_home_ed_ID);
        getID();


        edit = (Button) findViewById(R.id.disabled_profile_btn_editProfile);
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



      /* archive  = (ImageButton) findViewById(R.id.btn_archive);
        archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openArchive();}
        });
*/


        settings  = (ImageButton) findViewById(R.id.btn_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings();}
        });



    }
    public void openEditProfile()
    {
        Intent intent = new Intent(DisabledProfileActivity.this, EditDisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openProfile()
    {
        Intent intent = new Intent(DisabledProfileActivity.this, DisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openHome()
    {
        Intent intent = new Intent(DisabledProfileActivity.this, DisabledHomeActivity.class);
        startActivity(intent);
    }

    public void openArchive()
    {
        Intent intent = new Intent(DisabledProfileActivity.this, /* Archive صفحة مش موجودة*/DisabledProfileActivity.class);
        startActivity(intent);
    }

    public void openSettings()
    {
        Intent intent = new Intent(DisabledProfileActivity.this, SettingsPageDisabledActivity.class);
        startActivity(intent);
    }




    public void getID(){
        sp = getSharedPreferences("ID",MODE_PRIVATE);
        String ID=sp.getString("ID","IDD");
        ed_id.setText(ID);
    }

    /*public void setDisabilitiesList(){
        Bundle bundle = getIntent().getExtras();
        ListView disabilitylist;
        disabilitylist = findViewById(R.id.Disabilities_list);


        ArrayList<String> disablityData = new ArrayList<>(0);
        ArrayList<String> disabilityDescription = new ArrayList<>();


        disablityData=bundle.getStringArrayList("stringarray");

        if(disablityData.size() >0 ) {

            for(int i=0 ; i<disablityData.size() ; i++)
            {

                switch(disablityData.get(i))
                {
                    case "Mobility and Physical Impairments" :
                        disabilityDescription.add("A limitation in independent, purposeful physical movement of the body or of one or more extremities. ");
                        break;

                    case "Deaf or Hard Hearing":
                        disabilityDescription.add("A hearing loss so severe that there is very little or no functional hearing. ");
                        break;

                    case "Vision Impairments":
                        disabilityDescription.add("A person’s eyesight cannot be corrected to a normal level.");
                        break;


                }
            }

        }


        CustomAdapter adapter = new CustomAdapter(this, disablityData ,disabilityDescription);

       // disablityData.setAdapter(adapter);

    }*/
}