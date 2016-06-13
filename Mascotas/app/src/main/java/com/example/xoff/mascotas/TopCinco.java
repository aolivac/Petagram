package com.example.xoff.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/*

metemos cinco elementos a capón



 */


public class TopCinco extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cinco);


      //  Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
      //  setSupportActionBar(miActionBar);



        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }


    // para la lista dummy reusamos el codigo del main activity
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro1, "Toby", "Setter", "3"));
        mascotas.add(new Mascota(R.drawable.perro3, "Titan", "Mastin", "5"));
        mascotas.add(new Mascota(R.drawable.perro4, "Canelo", "Podenco", "8"));
        mascotas.add(new Mascota(R.drawable.perro6, "Golfo", "Mestizo", "2"));
        mascotas.add(new Mascota(R.drawable.perro8, "Flaco", "Galgo", "5"));

    }
}
