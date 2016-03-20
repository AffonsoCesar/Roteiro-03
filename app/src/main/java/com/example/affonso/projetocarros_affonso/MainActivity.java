package com.example.affonso.projetocarros_affonso;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CarrosAdapter adapter;
    private CarrosApplication application;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        application = (CarrosApplication) getApplicationContext();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adapter = new CarrosAdapter(this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Informo ao recyclerView que ele assumirá o formato de lista
        recyclerView.setItemAnimator(new DefaultItemAnimator()); // Informo ao recyclerView que as animações são padrões
        recyclerView.setHasFixedSize(true); // Informo ao recyclerView que o seu tamanho é fixo
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                application.adicionarCarro();
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //public boolean onOptionsItemSelected (MenuItem item) {
        //int id = item.getItemId();

        //if (id == R.id.action_about) {
           // if (!adapter.isGrid()) {
             //   adapter.setIsGrid(true);
              //  adapter.notifyDataSetChanged();
              //  item.setTitle("Sobre");
           // }
        //}
       // return super.onOptionsItemSelected(item);
   }
