package com.example.xoff.mascotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
       // setSupportActionBar(miActionBar);
       // getActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item ) {
            switch (item.getItemId()) {
                case R.id.menuFavoritos:
                    Intent intent = new Intent(this,TopCinco.class);
                    startActivity(intent);
                    break;

            }
            return super.onOptionsItemSelected(item);
        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_favorito, menu);
            return  true ;

        }

        /*
        ListView lstMascotas = (ListView) findViewById(R.id.lstMascotas);
        lstMascotas.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresMascotas));

        lstMascotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleMascota.class);
                intent.putExtra(getResources().getString(R.string.pNombre),  mascotas.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.pRaza),    mascotas.get(position).getRaza());

                startActivity(intent);
            }
        });

*/




    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.perro1,"Toby",   "Setter","3"));
        mascotas.add( new Mascota(R.drawable.perro2,"Pancho", "Labrador","2"));
        mascotas.add( new Mascota(R.drawable.perro3,"Titan",  "Mastin","5"));
        mascotas.add( new Mascota(R.drawable.perro4,"Canelo", "Podenco","2"));
        mascotas.add( new Mascota(R.drawable.perro5,"Rata",   "Pincher","1"));
        mascotas.add( new Mascota(R.drawable.perro6,"Golfo",  "Mestizo","5"));
        mascotas.add( new Mascota(R.drawable.perro7,"Blas",   "Perdiguero","7"));
        mascotas.add( new Mascota(R.drawable.perro8,"Flaco",  "Galgo","1"));
        mascotas.add( new Mascota(R.drawable.perro9,"Daida",  "Pastor","3"));
      //  ArrayList<String> nombresMascotas = new ArrayList<>();
      //  for (Mascota mascota : mascotas ){
      //      nombresMascotas.add(mascota.getNombre());
      //  }
    }

}

