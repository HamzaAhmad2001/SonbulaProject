package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.Calendar;

public class ScheduleMeetingActivity extends AppCompatActivity {

    private TextView setDate;
    private TextView setTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_meeting);
        String [] places = getResources().getStringArray(R.array.places);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.place_drop_down_item,
                places
        );
        AutoCompleteTextView autoComplete = findViewById(R.id.schedule_meeting_fill_place);
        autoComplete.setAdapter(adapter);

        setDate = findViewById(R.id.schedule_meeting_date);
        setTime = findViewById(R.id.schedule_meeting_time);
        setDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                Calendar sevenDaysLater = (Calendar) calendar.clone();
                sevenDaysLater.add(Calendar.DATE, 7);
                int MONTH = calendar.get(Calendar.MONTH);
                int DAY = calendar.get(Calendar.DATE);
                int YEAR = calendar.get(calendar.YEAR);


              DatePickerDialog datePickerDialog = new DatePickerDialog(ScheduleMeetingActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month+1;
                        setDate.setText(dayOfMonth + "/" + month + "/" + year );
                    }
                }, YEAR, MONTH, DAY);

                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                datePickerDialog.getDatePicker().setMaxDate(sevenDaysLater.getTimeInMillis());
                datePickerDialog.show();
            }
        });



       setTime.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               Calendar calendar = Calendar.getInstance();
               MaterialTimePicker timePicker = new MaterialTimePicker.Builder().setTimeFormat(TimeFormat.CLOCK_12H)
                       .setHour(calendar.get(Calendar.HOUR))
                       .setMinute(calendar.get(Calendar.MINUTE))
                       .build();

               timePicker.show(getSupportFragmentManager(),"Time");
               timePicker.addOnPositiveButtonClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       int Hour = timePicker.getHour();
                       int Minute = timePicker.getMinute();

                       setTime.setText(Hour+" : "+Minute);
                   }
               });
           }
       });

    }
}