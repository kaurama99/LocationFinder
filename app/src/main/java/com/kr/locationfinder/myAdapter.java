package com.kr.locationfinder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {
    Context context;
    Activity activity;
    ArrayList location_id, location_address, location_latitude, location_longitude;


    myAdapter(Activity activity, Context context,
              ArrayList location_id,
              ArrayList location_address,
              ArrayList location_latitude,
              ArrayList location_longitude){
        this.activity = activity;
        this.context = context;
        this.location_id = location_id;
        this.location_address = location_address;
        this.location_latitude = location_latitude;
        this.location_longitude = location_longitude;

    }
    @NonNull
    @Override
    public myAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.MyViewHolder holder, int position) {
        holder.location_id_text.setText(String.valueOf(location_id.get(position)));
        holder.location_address_text.setText(String.valueOf(location_address.get(position)));
        holder.location_latitude_text.setText(String.valueOf(location_latitude.get(position)));
        holder.location_longitude_text.setText(String.valueOf(location_longitude.get(position)));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(location_id.get(position)));
                intent.putExtra("address", String.valueOf(location_address.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return location_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView location_id_text, location_address_text, location_latitude_text, location_longitude_text;
        LinearLayout mainLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            location_id_text = itemView.findViewById(R.id.location_id_text);
            location_address_text = itemView.findViewById(R.id.location_address_text);
            location_latitude_text = itemView.findViewById(R.id.location_latitude_text);
            location_longitude_text = itemView.findViewById(R.id.location_longitude_text);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
