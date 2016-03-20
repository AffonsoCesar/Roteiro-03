package com.example.affonso.projetocarros_affonso;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

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

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_main);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new RecyclerView.LayoutManager() {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        });

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
