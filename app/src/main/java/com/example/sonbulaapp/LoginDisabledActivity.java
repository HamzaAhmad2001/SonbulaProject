package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginDisabledActivity extends AppCompatActivity {
    TextView textViewSignupLD;
    EditText Password_Disabled,id_Disabled;
    Button buttonLogInDisabled;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_disabled);

       /* button login and required id & password
       Password_Disabled=findViewById(R.id.Password_Disabled);
        id_Disabled=findViewById(R.id.id_Disabled);

        buttonLogInDisabled=findViewById(R.id.buttonLogInDisabled);
        buttonLogInDisabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id_disabled=id_Disabled.getText().toString();
                String pass_disabled=Password_Disabled.getText().toString();
                if(id_disabled.equals("1937517"))
                {
                    if(pass_disabled.equals("0000"))
                    {
                        Intent intentbuttonLogInDisabled=new Intent(LoginDisabled.this,ahmadjlhgljbhj.class);
                        startActivity(intentbuttonLogInDisabled);
                    }
                    else
                        Password_Disabled.setError("please enter your password");
                }
                else
                    id_Disabled.setError("Please enter your id student ");
            }
        });*/

        textViewSignupLD = findViewById(R.id.textViewSignUpLD);
        textViewSignupLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               openSignUp();

            }
        });
    }
    public void openSignUp()
    {
        Intent intentSignUp =new Intent(LoginDisabledActivity.this, SignUpPageActivity.class);
        startActivity(intentSignUp);
    }
}