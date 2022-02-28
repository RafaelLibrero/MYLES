package com.enrashe.myles;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;
        private TextView evento;
        private TextView descripcion;
        private TextView precio;
        private TextView fecha;
        private TextView transporte;
        private ImageView personPhoto;

        public ViewHolder(View view) {
            super(view);
            cv = (CardView) itemView.findViewById(R.id.cv);
            evento = (TextView) view.findViewById(R.id.evento);
            descripcion = (TextView) view.findViewById(R.id.descripcion);
            precio = (TextView) view.findViewById(R.id.precio);
            transporte = (TextView) view.findViewById(R.id.transporte);
            fecha = (TextView) view.findViewById(R.id.fecha);
            personPhoto = (ImageView) view.findViewById(R.id.person_photo);
        }

    }

    List<Datos_Eventos> eventos;

    Adapter(List<Datos_Eventos> eventos) {
        this.eventos = eventos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_cd, viewGroup, false);
        ViewHolder pvh = new ViewHolder(v);
        generarColor(pvh.cv);
        return pvh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.evento.setText(eventos.get(position).getTitulo());
        viewHolder.descripcion.setText(eventos.get(position).getDescripcion());
        viewHolder.precio.setText(eventos.get(position).getPrecio());
        viewHolder.transporte.setText(eventos.get(position).getTrasnporte());
        viewHolder.fecha.setText(eventos.get(position).getFecha());
        viewHolder.personPhoto.setImageResource(eventos.get(position).idFoto);

    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return eventos.size();
    }

    public void generarColor(CardView cv) {
        Random rnd = new Random();


        int color = Color.argb(190, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        cv.setCardBackgroundColor(color);

    }
}
