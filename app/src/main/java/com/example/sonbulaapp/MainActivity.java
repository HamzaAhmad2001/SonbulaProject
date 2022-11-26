package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        Button btn2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

        btn2=(Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity()
    {
        Intent intent = new Intent(this,EditProfile.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this,ProfileVolunteer.class);
        startActivity(intent);
    }
}
