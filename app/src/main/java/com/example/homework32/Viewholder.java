package com.example.homework32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Viewholder extends RecyclerView.ViewHolder {
    final ImageView imageView ;
    final TextView name;
    final TextView surname;


    public Viewholder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        surname = itemView.findViewById(R.id.surname);



    }

   /* public void onBind(String name,String surname, int image){*/

}
