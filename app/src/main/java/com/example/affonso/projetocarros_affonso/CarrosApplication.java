package com.example.affonso.projetocarros_affonso;


import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarrosApplication extends Application {

    private List<Carros> carros;

    @Override
    public void onCreate() {
        super.onCreate();
        carros = new ArrayList<>();
        criarCarrosPadrao();
    }

    private void criarCarrosPadrao() {
        carros.add(new Carros("BMW",R.drawable.bmw_720));
        carros.add(new Carros("Camaro",R.drawable.camaro));
        carros.add(new Carros("Corvette",R.drawable.corvette));
        carros.add(new Carros("CT6",R.drawable.ct6));
        carros.add(new Carros("DB77",R.drawable.db77));
        carros.add(new Carros("Gallardo",R.drawable.gallardo));
        carros.add(new Carros("Mustang",R.drawable.mustang));
        carros.add(new Carros("Pagani", R.drawable.paganni_zonda));
        carros.add(new Carros("Porsche",R.drawable.porsche_911));
        carros.add(new Carros("Vyron", R.drawable.vyron));
    }
    public List<Carros> getCarros () {
        return carros;
    }

    public void adicionarCarro () {
        Random random = new Random();
        carros.add(carros.get(carros.size()>1?random.nextInt(carros.size()-1):0));
    }
    public void removerCarro (int position) {
        carros.remove(position);
    }
}
