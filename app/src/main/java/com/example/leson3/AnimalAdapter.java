package com.example.leson3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalView> {

   private ArrayList<String> Animals;

    public AnimalAdapter(ArrayList<String> animals) {
        Animals = animals;
    }

    @NonNull
    @Override
    public AnimalView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalView(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalView holder, int position) {
    holder.bind(Animals.get(position));
    }

    @Override
    public int getItemCount() {
        return Animals.size();
    }
}
