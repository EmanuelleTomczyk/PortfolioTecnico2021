package com.example.teste_fumator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Maleficios extends AppCompatActivity {
    Perfil perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maleficios);
        getSupportActionBar().hide();
    }

    public void voltar(View v){
        Intent p = new Intent(this, Fragment.class);
        startActivity(p);
    }
}