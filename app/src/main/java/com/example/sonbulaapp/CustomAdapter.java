package com.example.sonbulaapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;

    private final ArrayList<String> title;
    private final ArrayList<String> description;


    public CustomAdapter(Activity context, ArrayList<String> title, ArrayList<String> description) {
        super(context,R.layout.customitem,title);
        this.context = context;
        this.title = title;
        this.description = description;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customitem, null , true);

        TextView titleText = rowView.findViewById(R.id.skillTitle);
        TextView DescriptionText= rowView.findViewById(R.id.skillDescription);

        titleText.setText(title.get(position));
        DescriptionText.setText(description.get(position));

        return rowView;

    }




}
