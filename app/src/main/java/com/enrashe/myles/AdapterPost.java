package com.enrashe.myles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class AdapterPost extends FirestoreRecyclerAdapter<BlogElementos, AdapterPost.BlogViewHolder> {
    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */

    public AdapterPost(@NonNull FirestoreRecyclerOptions<BlogElementos> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull BlogViewHolder holder, int position, @NonNull BlogElementos model) {
        holder.titulo.setText(model.getTitulo());
        holder.descripcion.setText(model.getDescripcion());
        Glide.with(holder.itemView.getContext())
                .load(model.getImagen())
                .centerCrop()
                .into(holder.imagenP);


    }

    @NonNull
    @Override
    public BlogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowpost, parent, false);

        return new BlogViewHolder(v);
    }

    class BlogViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo, descripcion;
        private ImageView imagenP;

        public BlogViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.tvT);
            descripcion = (TextView) itemView.findViewById(R.id.tvD);
            imagenP = (ImageView) itemView.findViewById(R.id.imgP);


        }

    }


}
