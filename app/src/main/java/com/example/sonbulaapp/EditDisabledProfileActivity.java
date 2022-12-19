package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class EditDisabledProfileActivity extends AppCompatActivity {
    private Button saveChanges;
    private Button cancel;

    private CheckBox chk_physical;
    private CheckBox chk_deaf;
    private CheckBox chk_vision;


    Button btn_DetailsVision;
    Button btn_DetailsDeaf;
    Button btn_DetailsMobility;

    public ArrayList<String> skillsArray = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_disabled_profile);

        saveChanges = (Button) findViewById(R.id.editprofile_disabled_btn_save);
        saveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });


        cancel = (Button) findViewById(R.id.editprofile_disabled_btn_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        chk_physical = findViewById(R.id.editProfile_disabled_chk_physical);
        chk_deaf = findViewById(R.id.editProfile_disabled_chk_deaf);
        chk_vision = findViewById(R.id.editProfile_disabled_chk_vision);


        btn_DetailsMobility = findViewById(R.id.btn_DetailsPhysical);
        btn_DetailsMobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A limitation in independent, purposeful physical movement of the body or of one or more extremities.");
            }
        });

        btn_DetailsDeaf = findViewById(R.id.btn_DetailsDeaf);
        btn_DetailsDeaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A hearing loss so severe that there is very little or no functional hearing.");
            }
        });

        btn_DetailsVision = findViewById(R.id.btn_DetailsVision);
        btn_DetailsVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A person's eyesight cannot be corrected to a normal level.");
            }
        });


    }

    public void openDialog(String s) {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(), "example dialog");

    }

    public void openProfile() {
        Intent intent = new Intent(EditDisabledProfileActivity.this, DisabledProfileActivity.class);
        startActivity(intent);
    }

    public boolean isCheckeed()
    {
        if(chk_deaf.isChecked() || chk_physical.isChecked() || chk_vision.isChecked())
            return true;

        else
            return false;
    }

    public void onClick(View v) {

        if (v.getId() == R.id.editprofile_disabled_btn_save) {
            if (isCheckeed()) {
                if (chk_physical.isChecked())
                    skillsArray.add("Mobility and Physical Impairments");
                if (chk_deaf.isChecked())
                    skillsArray.add("Deaf or Hard Hearing");
                if (chk_vision.isChecked())
                    skillsArray.add("Vision Impairments");


                // Toast.makeText(this,skillsArray.toString(),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, VolunteerProfileActivity.class);

                intent.putExtra("stringarray", skillsArray);


                startActivity(intent);

            } else
                openDialog("Please check at least one disability");


            // Toast.makeText(this,skillsArray.toString(),Toast.LENGTH_LONG).show();


            return;

        }
    }

}