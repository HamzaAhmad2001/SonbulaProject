package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class SignUpDisabledPage2 extends AppCompatActivity {
Button buttonBackSignupDisabledPage1;
Button signup;

    private CheckBox chk_vision;
    private CheckBox chk_mobility;
    private CheckBox chk_deaf;
    private CheckBox chk_Paralyzed;

    private CheckBox chk_acceptHelpF;
    private CheckBox chk_acceptHelpM;

    Button btn_DetailsVision;
    Button btn_DetailsDeaf;
    Button btn_DetailsMobility;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page2);
        chk_deaf=findViewById(R.id.chk_deaf);
        chk_mobility=findViewById(R.id.chk_mobility);
        chk_vision=findViewById(R.id.chk_vision);
        chk_Paralyzed=findViewById(R.id.chk_Paralyzed);


        chk_acceptHelpF=findViewById(R.id.chk_acceptHelpF);
        chk_acceptHelpM=findViewById(R.id.chk_acceptHelpM);

        buttonBackSignupDisabledPage1=findViewById(R.id.buttonBackSignUpDisabledPage1);
        buttonBackSignupDisabledPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               backToSignupDisabledPage1();
            }
        });
        signup=findViewById(R.id.signUp);
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
        if(chk_deaf.isChecked() || chk_mobility.isChecked() || chk_vision.isChecked()||chk_Paralyzed.isChecked())
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
        Intent intentbuttonBackSignUpDisabledPage1=new Intent(SignUpDisabledPage2.this,SignUpDisabledPage1.class);
        startActivity(intentbuttonBackSignUpDisabledPage1);
    }
    public void openDisabledProfile()
    {
        if(isCheckeed() && isCheckeedHelp())
        {
            Intent intentSuingUp=new Intent(SignUpDisabledPage2.this,disabled_profile.class);
            startActivity(intentSuingUp);

        }
        else if(isCheckeed() )
            openDialog("Please check at least one accept help gender");

        else if(isCheckeedHelp()  )
            openDialog("Please check at least one disability type");
        else
            openDialog("Please check at least one disability type and accept help gender");
    }

}