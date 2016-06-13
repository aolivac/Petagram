package com.example.xoff.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Bundle parametros = getIntent().getExtras();
        String nombre  = parametros.getString(getResources().getString(R.string.pNombre));
        String raza    = parametros.getString(getResources().getString(R.string.pRaza));
        String numLikes = parametros.getString(getResources().getString(R.string.pNumLikes));


        TextView tvNombre  = (TextView) findViewById(R.id.tvNombreMascota);
        TextView tvRaza    = (TextView) findViewById(R.id.tvRaza);
        TextView tvNumLikes = (TextView) findViewById(R.id.tvNumLikes);


        tvNombre.setText(nombre);
        tvRaza.setText(raza);
        tvNumLikes.setText(numLikes);
    }
}


