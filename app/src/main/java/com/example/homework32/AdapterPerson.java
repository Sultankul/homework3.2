package com.example.homework32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPerson extends RecyclerView.Adapter <Viewholder> {

    private final List<Information> informationList;

    private final LayoutInflater inflater;

    public AdapterPerson(Context context ,List<Information> informationList ) {
        this.informationList = informationList;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
    Information information = informationList.get(position);

    holder.surname.setText(information.getSurname());
    holder.name.setText(information.getName());
    holder.imageView.setImageResource(information.getImage());
    }

    @Override
    public int getItemCount() {

        return informationList.size();
    }
}
