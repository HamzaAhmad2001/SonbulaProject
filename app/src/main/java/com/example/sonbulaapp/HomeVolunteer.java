package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class HomeVolunteer extends AppCompatActivity  {

    RecyclerView recyclerView;
    ImageButton btn_Add;
    ImageButton btn_profile;
    ImageButton btn_home;
    ImageButton btn_accepted;
    ImageButton btn_setting;

  //  RequestsModel[] myListData;
    public ArrayList<RequestsModel>  myListData = new ArrayList<>();

    RequestsAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_volunteer);
    //String disableName, String disibilityName, String needType, Date date, String location,int image , String timeAgo
        recyclerView = findViewById(R.id.recycleView);



        myListData.add(new RequestsModel("Hamza ibrahim omar ahmad" , "Vision impairment" , "Being help mate"
                        , "Faculty of engineering", R.drawable.profile , "30 minutes ago"));
        myListData.add(new RequestsModel("Ahmad Hassan" , "Paralyzed" , "Writing in Arabic"
                        , "Faculty of IT", R.drawable.profile , "10 minutes ago"));
        myListData.add(new RequestsModel("Waleed Abu Qalben" , "chairs help" , "Being help mate"
                        , "Faculty of engineering", R.drawable.profile , "1 minutes ago"));



        adapter = new RequestsAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

        btn_Add=findViewById(R.id.btn_add);

        btn_profile=findViewById(R.id.btn_Profile);
        btn_home=findViewById(R.id.btn_Home);
        btn_accepted=findViewById(R.id.btn_Accepted);
        btn_setting=findViewById(R.id.btn_Setting);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeVolunteer.this,EditProfile.class);
                startActivity(intent);
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeVolunteer.this,HomeVolunteer.class);
                startActivity(intent);
            }
        });
        btn_accepted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeVolunteer.this,AcceptedRequests.class);
                startActivity(intent);
            }
        });
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeVolunteer.this,SettingPage.class);
                startActivity(intent);
            }
        });


        adapter.setAddClickListener(new RequestsAdapter.ItemAddClickOnRequest() {
            @Override
            public void onItemClick(int pos) {

            }

            @Override
            public void onAdd(int pos) {

               myListData.remove(pos);
               adapter.notifyItemRemoved(pos);

            }
        });




    }


}