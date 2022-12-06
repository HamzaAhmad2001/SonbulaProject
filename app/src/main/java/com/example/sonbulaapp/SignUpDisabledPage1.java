package com.example.sonbulaapp;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SignUpDisabledPage1 extends AppCompatActivity {
Button buttonBackSignupDisabled;
Button buttonNextSignupDisabledPage2;
    RadioGroup radioGroupMFD;
    RadioButton radioButton;
    boolean x=false;
    EditText passwordDisabled;
    EditText idDisabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page1);
        buttonBackSignupDisabled=findViewById(R.id.buttonBackSignUpDisabled);
        buttonBackSignupDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToSignUppPage();
            }
        });

        passwordDisabled=findViewById(R.id.passwordDisabled);
        idDisabled=findViewById(R.id.idDisabled);
        radioGroupMFD=(RadioGroup) findViewById(R.id.radioGroupMFD);
        radioGroupMFD.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
                radioButton=findViewById(checkedId);
                switch (radioButton.getId())
                {

                    case R.id.radioButtonMaleD:
                    {
                        x=true;
                    }
                    case R.id.radioButtonFemaleD:
                    {
                        x=true;
                    }
                }
            }
        });
        buttonNextSignupDisabledPage2=findViewById(R.id.buttonNextSignUpDisabledPage2);
        buttonNextSignupDisabledPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpDisabledPage2();
            }
        });

    }
    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }
    public void backToSignUppPage()
    {
        Intent intentButtonBackSignUpDisabled=new Intent(SignUpDisabledPage1.this,SignUpPage.class);
        startActivity(intentButtonBackSignUpDisabled);
    }
    public void openSignUpDisabledPage2()
    {
        String id_Disabled=idDisabled.getText().toString();
        String pass_Disabled=passwordDisabled.getText().toString();

        if(id_Disabled.equals("1937517"))
        {
            if(pass_Disabled.equals("0000"))
            {
                if(x)
                {
                    Intent intentButtonNextSignUpVolunteerPage2 = new Intent(SignUpDisabledPage1.this, SignUpDisabledPage2.class);
                    startActivity(intentButtonNextSignUpVolunteerPage2);
                }
                {
                    openDialog("Please enter your gender");
                }

            }
            else
            {
                passwordDisabled.setError("please enter you pass");
            }

        }
        else
        {

            idDisabled.setError("Pleass enter you id ");

        }

    }



}