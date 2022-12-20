package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpVolunteerPage1 extends AppCompatActivity {
Button buttonBackSignup;
Button buttonNextSignupVolunteerPage1;
EditText EditTextTextPersonStudentIDVolunteer;
SharedPreferences.Editor edit;
SharedPreferences sp;
EditText passwordVolunteer,idVolunteer;
    boolean x=false;

@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer_page1);

         sp = getSharedPreferences("ID",MODE_PRIVATE);
         edit = sp.edit();




        buttonBackSignup=findViewById(R.id.signup_volunteer_back_btn1);
        buttonBackSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               backToSignUp();
            }
        });
        EditTextTextPersonStudentIDVolunteer=findViewById(R.id.idVolunteer);

        passwordVolunteer=findViewById(R.id.passwordVolunteer);
        idVolunteer=findViewById(R.id.idVolunteer);


        buttonNextSignupVolunteerPage1=findViewById(R.id.buttonNextSignUpVolunteerPage1);
        buttonNextSignupVolunteerPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.putString("ID" , EditTextTextPersonStudentIDVolunteer.getText().toString());
                edit.apply();


                String id_Volunteer=idVolunteer.getText().toString();
                String pass_Volunteer=passwordVolunteer.getText().toString();

                if(id_Volunteer.equals("1937517") || id_Volunteer.equals("1937549"))
                {
                    if(pass_Volunteer.equals("0000"))
                    {


                            Intent intent = new Intent(SignUpVolunteerPage1.this, SignUpVolunteerPage2.class);
                            startActivity(intent);



                    }
                    else
                    {
                        passwordVolunteer.setError("please enter you pass");
                    }

                }
                else
                {

                    idVolunteer.setError("Please enter you id ");

                }


            }
        });
    }


    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }
    public void backToSignUp()
    {
        Intent intentBackSignup=new Intent(SignUpVolunteerPage1.this, SignUpPage.class);
        startActivity(intentBackSignup);
    }


}