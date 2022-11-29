package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;
//
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonSignup;
    TextView textViewLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSignup=findViewById(R.id.buttonSignUp);
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpPage();
            }
            public void openSignUpPage()
            {
                Intent intent = new Intent(MainActivity.this,SignUpPage.class);
                startActivity(intent);
            }
        });

        textViewLogin=findViewById(R.id.textViewLogIn);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogIn =new Intent(MainActivity.this,LogInPage.class);
                startActivity(intentLogIn);

            }
        });

    }


}