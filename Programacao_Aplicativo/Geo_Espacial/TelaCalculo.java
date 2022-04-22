package com.example.geoespacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaCalculo extends AppCompatActivity {
    static  int formula;
    EditText et1, et2, et3;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calculo);
        getSupportActionBar().hide();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        r = findViewById(R.id.resultado);
        organizaTela();
    }

    public void organizaTela(){
        if(formula == 1){
            et1.setHint("Área da base");
            et2.setHint("Número de faces laterais");
            et3.setHint("Área da face lateral");
        }

        else if(formula == 2){
            et1.setHint("Área total");
            et2.setHint("Número de faces laterais");
            et3.setHint("Área da face lateral");
        }

        else if(formula == 3){
            et1.setHint("Volume");
            et2.setHint("Altura");
            et3.setVisibility(View.INVISIBLE);
        }

        else if(formula == 4){
            et1.setHint("Área total");
            et2.setHint("Área da base");
            et3.setHint("Área da face lateral");
        }

        else if(formula == 5){
            et1.setHint("Área total");
            et2.setHint("Área da base");
            et3.setHint("Número de faces laterais");
        }

        else if(formula == 6){
            et1.setHint("Área da base");
            et2.setHint("Altura");
            et3.setVisibility(View.INVISIBLE);
        }

        else if(formula == 7){
            et1.setHint("Volume");
            et2.setHint("Área da base");
            et3.setVisibility(View.INVISIBLE);
        }
    }

    public void calcula(View view){
        double conta;
        double a = Double.parseDouble(et1.getText().toString());
        double b = Double.parseDouble(et2.getText().toString());

        switch (formula){
            case 1:
                double c = Double.parseDouble(et3.getText().toString());
                conta = 2*a + b*c;
                r.setText(conta+"");
                break;

            case 2:
                c = Double.parseDouble(et3.getText().toString());
                conta = (a - b*c)/2;
                r.setText(conta+"");
                break;

            case 4:
                c = Double.parseDouble(et3.getText().toString());
                conta = (a - 2*b)/c;
                r.setText(conta+"");
                break;

            case 5:
                c = Double.parseDouble(et3.getText().toString());
                conta = (a - 2*b)/c;
                r.setText(conta+"");
                break;

            case 3:
                conta = a/b;
                r.setText(conta+"");
                break;

            case 6:
                conta = a*b;
                r.setText(conta+"");
                break;

            case 7:
                conta = a/b;
                r.setText(conta+"");
                break;
        }
    }
}
