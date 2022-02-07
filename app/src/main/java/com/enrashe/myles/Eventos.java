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
    private RecyclerView rv;

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

    private void initData() {
        eventos = new ArrayList<>();
        eventos.add(new Datos_Eventos(R.drawable.holly, "Holly run", "Esta tarde joven es tuya ¡Holly run!", "Gratis", "Linea 3 Metro", "23/3/2022"));
        eventos.add(new Datos_Eventos(R.drawable.expo, "Exposición Planetario", "¡Sumergete en los confines del universo!", "Gratis", "Linea 6 Metro", "22/4/2022"));
        eventos.add(new Datos_Eventos(R.drawable.excursion, "Excursion al monte", "Tu día con compañía y naturaleza", "Gratis", "Atocha", "1/05/2022"));
        eventos.add(new Datos_Eventos(R.drawable.holly, "Holly run", "Esta tarde joven es tuya ¡Holly run!", "Gratis", "Linea 3 Metro", "23/3/2022"));
        eventos.add(new Datos_Eventos(R.drawable.expo, "Exposición Planetario", "¡Sumergete en los confines del universo!", "Gratis", "Linea 6 Metro", "22/4/2022"));
        eventos.add(new Datos_Eventos(R.drawable.excursion, "Excursion al monte", "Día para ti con la mejor compañia, la naturaleza", "Gratis", "Atocha", "1/05/2022"));
        eventos.add(new Datos_Eventos(R.drawable.holly, "Holly run", "Esta tarde joven es tuya ¡Holly run!", "Gratis", "Linea 3 Metro", "23/3/2022"));
        eventos.add(new Datos_Eventos(R.drawable.expo, "Exposición Planetario", "¡Sumergete en los confines del universo!", "Gratis", "Linea 6 SMetro", "22/4/2022"));
        eventos.add(new Datos_Eventos(R.drawable.excursion, "Excursion al monte", "Día para ti con la mejor compañia, la naturaleza", "Gratis", "Atocha", "1/05/2022"));
    }

    private void initializeAdapter() {
        Adapter adapter = new Adapter(eventos);
        rv.setAdapter(adapter);
    }
}