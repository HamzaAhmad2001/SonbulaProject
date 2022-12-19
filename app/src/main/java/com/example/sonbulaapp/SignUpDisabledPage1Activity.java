package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpDisabledPage1Activity extends AppCompatActivity {
Button buttonBackSignupDisabled;
Button buttonNextSignupDisabledPage2;
    boolean x=false;
    EditText passwordDisabled;
    EditText idDisabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disabled_page1);
        buttonBackSignupDisabled=findViewById(R.id.buttonBackSignUpDisabled1);
        buttonBackSignupDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToSignUppPage();
            }
        });

        passwordDisabled=findViewById(R.id.passwordDisabled);
        idDisabled=findViewById(R.id.idDisabled);

        buttonNextSignupDisabledPage2=findViewById(R.id.buttonNextSignUpDisabledPage1);
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
        Intent intentButtonBackSignUpDisabled=new Intent(SignUpDisabledPage1Activity.this, SignUpPageActivity.class);
        startActivity(intentButtonBackSignUpDisabled);
    }
    public void openSignUpDisabledPage2()
    {
        String id_Disabled=idDisabled.getText().toString();
        String pass_Disabled=passwordDisabled.getText().toString();

        if(id_Disabled.equals("1937517")|| id_Disabled.equals("1937549") )
        {
            if(pass_Disabled.equals("0000"))
            {

                    Intent intentButtonNextSignUpDisabledPage2 = new Intent(SignUpDisabledPage1Activity.this, SignUpDisabledPage2Activity.class);
                    startActivity(intentButtonNextSignUpDisabledPage2);


            }
            else
            {
                passwordDisabled.setError("Please enter you password");
            }

        }
        else
        {

            idDisabled.setError("Please enter your university portal ID");

        }

    }



}