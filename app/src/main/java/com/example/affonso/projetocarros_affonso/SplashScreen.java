package com.example.affonso.projetocarros_affonso;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;


public class SplashScreen extends AppCompatActivity implements Runnable{

    private static final int DELAY = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ocultarBarraDeNavegação();

        Handler handler = new Handler();
        handler.postDelayed(this, DELAY);

    }
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void ocultarBarraDeNavegação(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

}
