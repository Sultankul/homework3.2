package com.example.homework32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<Information> informationList = new ArrayList<Information>();

    private AdapterPerson adapterPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        adapterPerson = new AdapterPerson(this,informationList);
        recyclerView.setAdapter(adapterPerson);
        loadData();
    }

    private void loadData() {
        informationList.add(new Information("Jonh","Smith",R.drawable.image));
        informationList.add(new Information("Alice","Din",R.drawable.image));
        informationList.add(new Information("Tim","Baker",R.drawable.image));
        informationList.add(new Information("Ben","Ten",R.drawable.image));
        informationList.add(new Information("Gwen","Glori",R.drawable.image));
        informationList.add(new Information("Shon","Lee",R.drawable.image));

    }
}