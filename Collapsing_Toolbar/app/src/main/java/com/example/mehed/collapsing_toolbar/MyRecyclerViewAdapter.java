package com.example.mehed.collapsing_toolbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    public MyRecyclerViewAdapter(Context context, ArrayList<String> animalList){
        this.context = context;
        this.animalList = animalList;

    }

    Context context;
    ArrayList<String>animalList;
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.sample_view,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.MyViewHolder myViewHolder, int i) {
        String animal=animalList.get(i);
        myViewHolder.textView.setText(animal);

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.TV);
        }


        }


}
