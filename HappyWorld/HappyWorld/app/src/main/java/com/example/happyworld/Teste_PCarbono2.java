package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Teste_PCarbono2 extends AppCompatActivity {
    RadioButton r1, r2, r3, r4, r5, r6, r7;
    TextView texto1;
    ImageView imagem, avancar;
    static int opcao_carbono2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_pcarbono2);
        getSupportActionBar().hide();
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6_1);
        r7 = findViewById(R.id.r7);
        avancar = findViewById(R.id.avancar);
        texto1 = findViewById(R.id.texto2);
        imagem = findViewById(R.id.imagem_t);

        if (opcao_carbono2 == 2) {
            texto1.setText("Na sua residência, utiliza-se botijão ou gás encanado?");
            r1.setText("Nenhum");
            r2.setText("Botijão (GLP)");
            r3.setText("Gás encanado");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_carbono2 == 4) {
            texto1.setText("Quantos reais você gasta com energia elétrica, em média, por mês?");
            r1.setText("Nada");
            r2.setText("30 a 50 reais");
            r3.setText("50 a 100 reais");
            r4.setText("100 a 150 reais");
            r5.setText("150 a 200 reais");
            r6.setText("mais de 200 reais");
            imagem.setImageResource(R.drawable.moradia_eco);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_carbono2 == 6) {
            texto1.setText("Como você classificaria sua dieta?");
            r1.setText("Alto consumo de carnes");
            r2.setText("Consumo de carnes mediano");
            r3.setText("Flexitariana (carne no máximo 3x por semana)");
            r4.setText("Pesco-vegetariana");
            r5.setText("Ovo-lacto-vegetariana");
            r6.setText("Vegetariana estrita/ vegana");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_carbono2 == 8) {
            texto1.setText("Em média, quanto você gasta com gasolina comum por mês?");
            r1.setText("Nada");
            r2.setText("50 a 100 reais");
            r3.setText("100 a 200 reais");
            r4.setText("200 a 300 reais");
            r5.setText("mais de 300 reais");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono2 == 10) {
            texto1.setText("Em média, quanto você gasta com diesel por mês?");
            r1.setText("Nada");
            r2.setText("50 a 100 reais");
            r3.setText("100 a 200 reais");
            r4.setText("200 a 300 reais");
            r5.setText("mais de 300 reais");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono2 == 12) {
            texto1.setText("Quais meios de transporte público você utiliza?");
            r1.setText("Metrô/Trem");
            r2.setText("Ônibus");
            r3.setText("Não utilizo transporte público");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono2 == 14) {
            texto1.setText("Quantos voos de até 3 horas você realiza por ano?");
            r1.setText("Nenhum");
            r2.setText("1-2 ");
            r3.setText("2-3");
            r4.setText("3-5");
            r5.setText("5-10");
            r6.setText("Mais de 10");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono2 == 16) {
            texto1.setText("Quantas meias, luvas, roupas de banho, roupas íntimas, pijamas, lenços, gravatas e cachecóis você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        } if (opcao_carbono2 == 18) {
            texto1.setText("Quantas compras significativas você faz por ano (tv, computador, mobília, etc)");
            r1.setText("0");
            r2.setText("1 a 3");
            r3.setText("4 a 6");
            r4.setText("Mais de 6");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        }
    }

    public void calcular_carb2(View v) {
        Intent c = new Intent(this, Teste_Carbono1.class);
        if (opcao_carbono2 == 2) {
            Teste_Carbono1.opcao_carbono = 3;
            Somas.resc2 = Somas.pegada_carbono - Somas.resc1;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        } if (opcao_carbono2 == 4) {
            Somas.resc4 = Somas.pegada_carbono - Somas.resc3;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } if (r2.isChecked()) {
                Somas.pegada_carbono += 10/3;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 20/3;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 30/3;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 40/3;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 50/3;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 5;
        } if (opcao_carbono2 == 6) {
            Somas.resc6 = Somas.pegada_carbono - Somas.resc5;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 60;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 50;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 7;
        } if (opcao_carbono2 == 8) {
            Somas.resc8 = Somas.pegada_carbono - Somas.resc7;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 45;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 9;
        } if (opcao_carbono2 == 10) {
            Somas.resc10 = Somas.pegada_carbono - Somas.resc9;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 55;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 11;
        } if (opcao_carbono2 == 12) {
            Somas.resc12 = Somas.pegada_carbono - Somas.resc11;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 13;
        } if (opcao_carbono2 == 14) {
            Somas.resc14 = Somas.pegada_carbono - Somas.resc13;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 60;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 80;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 15;
        } if (opcao_carbono2 == 16) {
            Somas.resc16 = Somas.pegada_carbono - Somas.resc15;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 50;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_Carbono1.opcao_carbono = 17;
        } if (opcao_carbono2 == 18) {
            Intent i = new Intent(this, Resultado.class);
            Somas.resc18 = Somas.pegada_carbono - Somas.resc17;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(i);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 15;
                startActivity(i);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 35;
                startActivity(i);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 50;
                startActivity(i);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void voltar_c2(View v) {
        Intent ant = new Intent(this, Teste_Carbono1.class);
        if (opcao_carbono2 == 2) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 1;
            Somas.pegada_carbono = Somas.resc1;
        } if (opcao_carbono2 == 4) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 3;
            Somas.pegada_carbono = Somas.resc3;
        } if (opcao_carbono2 == 6) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 5;
            Somas.pegada_carbono = Somas.resc5;
        } if (opcao_carbono2 == 8) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 7;
            Somas.pegada_carbono = Somas.resc7;
        } if (opcao_carbono2 == 10) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 9;
            Somas.pegada_carbono = Somas.resc9;
        } if (opcao_carbono2 == 12) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 11;
            Somas.pegada_carbono = Somas.resc11;
        } if (opcao_carbono2 == 14) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 13;
            Somas.pegada_carbono = Somas.resc13;
        } if (opcao_carbono2 == 16) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 15;
            Somas.pegada_carbono = Somas.resc15;
        } if (opcao_carbono2 == 18) {
            startActivity(ant);
            Teste_Carbono1.opcao_carbono = 17;
            Somas.pegada_carbono = Somas.resc17;
        }
    }
}