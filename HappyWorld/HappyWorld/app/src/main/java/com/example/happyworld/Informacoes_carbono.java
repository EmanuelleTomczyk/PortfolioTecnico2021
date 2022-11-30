package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Informacoes_carbono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_informacoes_carbono);
    }

    public void ir_site(View v){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void volta(View v){
        Intent vo = new Intent(this, Resultado.class);
        startActivity(vo);
    }
}