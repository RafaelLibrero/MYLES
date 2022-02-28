package com.enrashe.myles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorChats extends RecyclerView.Adapter<AdaptadorChats.MensajeHolder> {
    private List<ChatMensaje> listadoMensajes;

    public AdaptadorChats(List<ChatMensaje> listadoMensajes) {
        this.listadoMensajes = listadoMensajes;
    }


    @NonNull
    @Override
    public MensajeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vista_mensaje, viewGroup, false);
        return new MensajeHolder(mView);

    }

    @Override
    public void onBindViewHolder(@NonNull MensajeHolder mensajeHolder, int position) {
        mensajeHolder.tvnom.setText(listadoMensajes.get(position).getNombre());
        mensajeHolder.tvmes.setText(listadoMensajes.get(position).getMensaje());


    }

    @Override
    public int getItemCount() {
        return listadoMensajes.size();
    }

    class MensajeHolder extends RecyclerView.ViewHolder {

        private TextView tvmes, tvnom;

        public MensajeHolder(@NonNull View itemView) {
            super(itemView);
            tvmes = itemView.findViewById(R.id.tvmes);
            tvnom = itemView.findViewById(R.id.tvnom);

        }
    }

}
