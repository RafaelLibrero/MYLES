package com.enrashe.myles;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        //rv.setHasFixedSize(true);

        LinearLayoutManager lln = new LinearLayoutManager(Eventos.this);
        rv.setLayoutManager(lln);


    }
}