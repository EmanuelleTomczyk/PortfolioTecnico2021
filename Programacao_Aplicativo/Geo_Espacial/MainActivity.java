package com.example.geoespacial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton at, aba, abv, n, f, v, h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        at = findViewById(R.id.At);
        aba = findViewById(R.id.Aba);
        abv = findViewById(R.id.Abv);
        n = findViewById(R.id.n);
        f = findViewById(R.id.f);
        v = findViewById(R.id.v);
        h = findViewById(R.id.h);
    }

    public void  click(View view) {
        Intent i = new Intent(this, TelaCalculo.class);
        if(at.isChecked()){
            TelaCalculo.formula = 1;
            startActivity(i);
        }

        else if (aba.isChecked()) {
            TelaCalculo.formula = 2;
            startActivity(i);
        }

        else if (abv.isChecked()) {
            TelaCalculo.formula = 3;
            startActivity(i);
        }

        else if (n.isChecked()) {
            TelaCalculo.formula = 4;
            startActivity(i);
        }

        else if (f.isChecked()) {
            TelaCalculo.formula = 5;
            startActivity(i);
        }

        else if (v.isChecked()) {
            TelaCalculo.formula = 6;
            startActivity(i);
        }

        else if (h.isChecked()) {
            TelaCalculo.formula = 7;
            startActivity(i);
        }

        else{
            Toast.makeText(this, "Você precisa selecionar uma opção!", Toast.LENGTH_LONG).show();
        }
    }
}