package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class SignUpDisabledPage2 extends AppCompatActivity {
Button buttonBackSignupDisabledPage;
Button signup;

    private CheckBox chk_physical;
    private CheckBox chk_deaf;
    private CheckBox chk_vision;


    private CheckBox chk_acceptHelpF;
    private CheckBox chk_acceptHelpM;

    Button btn_DetailsVision;
    Button btn_DetailsDeaf;
    Button btn_DetailsMobility;



    public ArrayList<String> skillsArray = new ArrayList<>();

    SharedPreferences.Editor edit;
    SharedPreferences sp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page2);
        chk_physical=findViewById(R.id.signup_disabled_chk_physical);
        chk_deaf=findViewById(R.id.signup_disabled_chk_deaf);
        chk_vision=findViewById(R.id.signup_disabled_chk_vision);



        chk_acceptHelpF=findViewById(R.id.chk_acceptHelpF);
        chk_acceptHelpM=findViewById(R.id.chk_acceptHelpM);

        buttonBackSignupDisabledPage=findViewById(R.id.buttonBackSignUpDisabledPage2);
        buttonBackSignupDisabledPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               backToSignupDisabledPage1();
            }
        });
        signup=findViewById(R.id.signup_disabled_btn_signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openDisabledProfile();


            }
        });

        btn_DetailsMobility=findViewById(R.id.btn_DetailsMobility);
        btn_DetailsMobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A limitation in independent, purposeful physical movement of the body or of one or more extremities.");
            }
        });

        btn_DetailsDeaf=findViewById(R.id.btn_DetailsDeaf);
        btn_DetailsDeaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A hearing loss so severe that there is very little or no functional hearing.");
            }
        });

        btn_DetailsVision=findViewById(R.id.btn_DetailsVision);
        btn_DetailsVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("A person's eyesight cannot be corrected to a normal level.");
            }
        });

    }



    public boolean isCheckeed()
    {
        if(chk_deaf.isChecked() || chk_physical.isChecked() || chk_vision.isChecked())
            return true;

        else
            return false;
    }
    public boolean isCheckeedHelp()
    {
        if(chk_acceptHelpM.isChecked() ||chk_acceptHelpF.isChecked())
            return true;

        else
            return false;
    }
    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }
    public void backToSignupDisabledPage1()
    {
        Intent intentbuttonBackSignUpDisabledPage=new Intent(SignUpDisabledPage2.this, SignUpDisabledPage1.class);
        startActivity(intentbuttonBackSignUpDisabledPage);
    }
    public void openDisabledProfile()
    {
        if(isCheckeed() && isCheckeedHelp())
        {
            Intent intent=new Intent(SignUpDisabledPage2.this, disabled_profile.class);
                   startActivity(intent);
        }
        else if(isCheckeed() )
            openDialog("Please check at least one accept help gender");

        else if(isCheckeedHelp()  )
            openDialog("Please check at least one disability type");
        else
            openDialog("Please check at least one disability type and accept help gender");
    }

}