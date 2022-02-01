package com.enrashe.myles;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Eventos extends AppCompatActivity {
    private List<Datos_Eventos> eventos;
    private  RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        rv = (RecyclerView) findViewById(R.id.rv);

        rv.setHasFixedSize(true);

        LinearLayoutManager lln = new LinearLayoutManager(this);
        rv.setLayoutManager(lln);

        rv.setHasFixedSize(true);

        initData();
        initializeAdapter();


    }
    private void initData(){
        eventos = new ArrayList<>();
        eventos.add(new Datos_Eventos("Emma Wilson", "23 years old","3455345435","5434234","634fewfdew"));
        eventos.add(new Datos_Eventos("Emma Wilson", "23 years old","3455345435","5434234","634fewfdew"));
        eventos.add(new Datos_Eventos("Emma Wilson", "23 years old","3455345435","5434234","634fewfdew"));
    }

    private void initializeAdapter(){
        Adapter adapter = new Adapter(eventos);
        rv.setAdapter(adapter);
    }
}