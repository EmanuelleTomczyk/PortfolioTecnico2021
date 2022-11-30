package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Pagamento extends AppCompatActivity {
    static int tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
        getSupportActionBar().hide();
    }

    public void plantar_arvore(View v){
        Uri webpage = Uri.parse("https://nubank.com.br/pagar/64ywf/BGc4Xa1KWm");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void voltar_tela(View v){
        if (tela == 1){
            Intent perfil = new Intent(this, Perfil.class);
            startActivity(perfil);
        }
        if (tela == 2){
            Intent resultado = new Intent(this, Resultado.class);
            startActivity(resultado);
        }
    }
}