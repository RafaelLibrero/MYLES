package com.enrashe.myles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private String[] localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;
        private TextView personName;
        private TextView personAge;
        private ImageView personPhoto;

        public ViewHolder(View view) {
            super(view);
            personName = (TextView) view.findViewById(R.id.person_name);
            personAge = (TextView) view.findViewById(R.id.person_age);
            personPhoto = (ImageView) view.findViewById(R.id.person_photo);


        }

    }

    List<Datos_Eventos> eventos;

    Adapter(List<Datos_Eventos>eventos){
        this.eventos=eventos;
    }


    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     *                by RecyclerView.
     */
    public Adapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_eventos, viewGroup, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.personName.setText(eventos.get(position).getTitulo());
        viewHolder.personAge.setText(eventos.get(position).getFecha());
        //viewHolder.personPhoto.setImageResource(eventos.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return eventos.size();
    }
}
