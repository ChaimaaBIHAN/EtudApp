package com.example.etudapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoursAdapter extends RecyclerView.Adapter<CoursAdapter.ViewHolder> {

    CoursData[] coursData;
    Context context;
    public CoursAdapter(CoursData[] coursData, Home activity) {
        this.coursData = coursData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_cours,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoursAdapter.ViewHolder holder, int position) {
        final CoursData coursDataList = coursData[position];
        holder.textViewCours.setText(coursDataList.getCours());
        holder.textViewDescripton.setText(coursDataList.getDescription());
        holder.textViewJointure.setText(coursDataList.getJointures());

    }

    @Override
    public int getItemCount() {
        return coursData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewCours;
        TextView textViewDescripton;
        TextView textViewJointure;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           textViewCours = itemView.findViewById(R.id.Cours);
           textViewDescripton = itemView.findViewById(R.id.Description);
           textViewJointure = itemView.findViewById(R.id.Jointure);
       }
   }
}
