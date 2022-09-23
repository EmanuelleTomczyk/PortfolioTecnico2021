package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button gerar_mus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        gerar_mus = findViewById(R.id.gerar_mus);
    }

    public void gerar (View view){
        Intent m = new Intent(this, Musica.class);
        startActivity(m);
        getSupportActionBar().hide();
        Random musica = new Random();
        Musica.gerar = musica.nextInt(40)+1;
    }
}