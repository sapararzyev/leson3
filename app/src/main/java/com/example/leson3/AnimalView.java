package com.example.leson3;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalView extends RecyclerView.ViewHolder {
   private TextView tv_textView;
    public AnimalView(@NonNull View itemView) {
        super(itemView);
      tv_textView=itemView.findViewById(R.id.tv_Animal);
    }
    public void bind(String animal) {
      tv_textView.setText(animal);
    }
}