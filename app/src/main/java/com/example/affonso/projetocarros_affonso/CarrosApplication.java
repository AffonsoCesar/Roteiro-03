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
        carros.add(new Carros("bmw",R.drawable.bmw_720));
        carros.add(new Carros("camaro",R.drawable.camaro));
        carros.add(new Carros("corvette",R.drawable.corvette));
        carros.add(new Carros("ct6",R.drawable.ct6));
        carros.add(new Carros("db77",R.drawable.db77));
        carros.add(new Carros("gallardo",R.drawable.gallardo));
        carros.add(new Carros("mustang",R.drawable.mustang));
        carros.add(new Carros("pagani", R.drawable.paganni_zonda));
        carros.add(new Carros("porsche",R.drawable.porsche_911));
        carros.add(new Carros("vyron", R.drawable.vyron));
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
