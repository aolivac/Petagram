package com.example.xoff.mascotas;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by XOFF on 12/06/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
        this.activity = activity;



    }

    ArrayList<Mascota> mascotas;
    Activity           activity;


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreMascotaCV.setText(mascota.getNombre());
        mascotaViewHolder.tvNumLikesCV.setText(mascota.getNumLikes());


        /*  en prevision de hacer funcionar el boton de like
        mascotaViewHolder.ibLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
       */


    }



    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView   imgFoto;
        private TextView    tvNombreMascotaCV;
        private TextView    tvNumLikesCV;
        private ImageButton ibLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgFoto           = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvNombreMascotaCV = (TextView) itemView.findViewById(R.id.tvNombreMascotaCV);
            tvNumLikesCV      = (TextView) itemView.findViewById(R.id.tvNumLikesCV);
            ibLike            = (ImageButton) itemView.findViewById(R.id.ibLike);
        }
    }
}

