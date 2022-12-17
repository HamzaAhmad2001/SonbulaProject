package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class RequestsAdapter extends RecyclerView.Adapter<RequestsAdapter.MyViewHolder> {

    public ItemAddClickOnRequest addClickListener;
    public ImageButton btn_Add;

    //Data Source

    private ArrayList<RequestsModel> listData;

    public interface ItemAddClickOnRequest {

        public void onItemClick(int pos);
        public void onAdd(int pos);
    }


    public RequestsAdapter(ArrayList<RequestsModel> listData) {
        this.listData = listData;
    }

    public void setAddClickListener(ItemAddClickOnRequest addClickListener) {
        this.addClickListener = addClickListener;
    }

    // 2- View Holder Class:
    public  class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView disableName;
        public TextView disibilityName;
        public TextView needType;
        public Date date;
        public TextView location;
        public TextView timeAgo;




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.image=itemView.findViewById(R.id.imageview);
            this.disableName=itemView.findViewById(R.id.tv_name);
            this.disibilityName=itemView.findViewById(R.id.tv_disibilityName);
            this.needType=itemView.findViewById(R.id.tv_needType);
            this.location=itemView.findViewById(R.id.tv_Location);
            this.timeAgo=itemView.findViewById(R.id.tv_timeAgo);

            btn_Add=itemView.findViewById(R.id.btn_add);

            btn_Add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(addClickListener !=null){
                        int position= getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            addClickListener.onAdd(position);
                        }
                    }
                }
            });


        }

    }

    // Implementing the Methods
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.helprequestsitem,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final RequestsModel myListData = listData.get(position);
        holder.disableName.setText(listData.get(position).getDisableName());
        holder.disibilityName.setText(listData.get(position).getDisibilityName());
        holder.needType.setText(listData.get(position).getNeedType());
        holder.location.setText(listData.get(position).getLocation());
        holder.timeAgo.setText(listData.get(position).getTimeAgo());
        holder.image.setImageResource(listData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

}
