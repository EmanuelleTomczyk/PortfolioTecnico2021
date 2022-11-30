package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Teste_Phidrica1 extends AppCompatActivity {
    RadioButton r1, r2, r3, r4, r5, r6, r7;
    TextView texto1;
    ImageView imagem, avancar;
    static int opcao_hidrica = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teste_phidrica1);
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

        if (opcao_hidrica == 1) {
            texto1.setText("Quantos m3 possui sua residência, em média?");
            r1.setText("Menos de 200 m3");
            r2.setText("Entre 200 e 400 m3");
            r3.setText("Entre 400 e 600 m3");
            r4.setText("Entre 600 e 800 m3");
            r5.setText("Mais de 800 m3");
            imagem.setImageResource(R.drawable.moradia_eco);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_hidrica == 3) {
            texto1.setText("Você utiliza máquina para lavar roupa?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_hidrica == 5) {
            texto1.setText("Você utiliza máquina de lavar louça?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
        } if (opcao_hidrica == 7) {
            texto1.setText("Quantas vezes por semana você lava seu carro?");
            r1.setText("Não tenho carro/ Não lavo toda a semana");
            r2.setText("1-2");
            r3.setText("3-4");
            r4.setText("4-5");
            r5.setText("Mais de 5");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
        } if (opcao_hidrica == 9) {
            texto1.setText("Quanto tempo por semana você gasta lavando equipamentos ou calçadas?");
            r1.setText("1-15min");
            r2.setText("15-30min");
            r3.setText("30-60min");
            r4.setText("60-120min");
            r5.setText("Mais de 2h");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
        } if (opcao_hidrica == 11) {
            texto1.setText("Quantas vezes por ano você enche sua piscina/banheira?");
            r1.setText("Não tenho piscina ou banheira");
            r2.setText("1-5");
            r3.setText("5-10");
            r4.setText("10-15");
            r5.setText("Mais de 15");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.moradia_eco);
        } if (opcao_hidrica == 13) {
            texto1.setText("Quantas vezes por dia você escova os dentes?");
            r1.setText("0");
            r2.setText("1-2");
            r3.setText("3-4");
            r4.setText("5-6");
            r5.setText("7-8");
            r6.setText("Mais de 8");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.hig);
        } if (opcao_hidrica == 15) {
            texto1.setText("Quantos banhos toma por dia?");
            r1.setText("0");
            r2.setText("1-2");
            r3.setText("3-4");
            r4.setText("5-6");
            r5.setText("Mais de 7");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.hig);
        } if (opcao_hidrica == 17) {
            texto1.setText("Enquanto lava as mãos, você:");
            r1.setText("Fecha a torneira enquanto ensaboa");
            r2.setText("Não fecha a torneira enquanto ensaboa");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.hig);
        } if (opcao_hidrica == 19) {
            texto1.setText("Quantas frutas você consome por dia?");
            r1.setText("0");
            r2.setText("1-2");
            r3.setText("3-4");
            r4.setText("5-6");
            r5.setText("Mais de 7");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 21) {
            texto1.setText("Quantos kg de carne de porco você consome por semana?");
            r1.setText("Não consumo carne de porco");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 23) {
            texto1.setText("Quantos kg de produtos cereais (arroz, aveia, trigo…) você consome por semana?");
            r1.setText("Nenhum");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 25) {
            texto1.setText("Seu consumo de açúcar é:");
            r1.setText("Alto");
            r2.setText("Médio");
            r3.setText("Pequeno");
            r4.setText("Nulo");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 27) {
            texto1.setText("Quantos copos de café e chá você toma por dia?");
            r1.setText("Nenhum");
            r2.setText("1-2");
            r3.setText("3-4");
            r4.setText("5-6");
            r5.setText("Mais de 6");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 29) {
            texto1.setText("Quantos kg de laticínios você consome por semana?");
            r1.setText("Não consumo laticínios");
            r2.setText("1");
            r3.setText("2-3");
            r4.setText("3-5");
            r5.setText("5-10");
            r6.setText("Mais de 10");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_hidrica == 31) {
            texto1.setText("Quantos ternos, jaquetas, vestidos, casacos e camisas você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10 ");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        } if (opcao_hidrica == 33) {
            texto1.setText("Quantas camisetas, calças, shorts, saias e roupas de treino você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10 ");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        } if (opcao_hidrica == 35) {
            texto1.setText("Quantos livros e cadernos você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10 ");
            r4.setText("10-15");
            r5.setText("Mais de 15");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        }
    }

    public void calcular_hidrica(View v) {
        Intent c = new Intent(this, Teste_Phidrica2.class);
        if (opcao_hidrica == 1) {
            Teste_Phidrica2.opcao_hidrica2 = 2;
            Somas.resh1 = Somas.pegada_hidrica;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 4000;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 8000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 13000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 18000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 25000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 3) {
            Teste_Phidrica2.opcao_hidrica2 = 4;
            Somas.resh3 = Somas.pegada_hidrica - Somas.resh2;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 120;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 170;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 5) {
            Teste_Phidrica2.opcao_hidrica2 = 6;
            Somas.resh5 = Somas.pegada_hidrica - Somas.resh4;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 6000;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 7) {
            Teste_Phidrica2.opcao_hidrica2 = 8;
            Somas.resh7 = Somas.pegada_hidrica - Somas.resh6;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 20000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 40000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 52000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 65000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 9) {
            Teste_Phidrica2.opcao_hidrica2 = 10;
            Somas.resh9 = Somas.pegada_hidrica - Somas.resh8;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 8000;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 17000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 42000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 80000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 125000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 11) {
            Teste_Phidrica2.opcao_hidrica2 = 12;
            Somas.resh11 = Somas.pegada_hidrica - Somas.resh10;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 3*200;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 7*200;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 13*200;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 15*200;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 13) {
            Teste_Phidrica2.opcao_hidrica2 = 14;
            Somas.resh13 = Somas.pegada_hidrica - Somas.resh12;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += (728 * 3);
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += (1100 * 3);
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += (1800 * 3);
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += (2900 * 3);
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += (3100 * 3);
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 15) {
            Teste_Phidrica2.opcao_hidrica2 = 16;
            Somas.resh15 = Somas.pegada_hidrica - Somas.resh14;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += (500 * 50);
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += (1100 * 50);
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += (1900 * 50);
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += (2500 * 50);
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 17) {
            Teste_Phidrica2.opcao_hidrica2 = 18;
            Somas.resh17 = Somas.pegada_hidrica - Somas.resh16;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0.5;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 1.5;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 19) {
            Teste_Phidrica2.opcao_hidrica2 = 20;
            Somas.resh19 = Somas.pegada_hidrica - Somas.resh18;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } if (r2.isChecked()) {
                Somas.pegada_hidrica += 12000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 28000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 40000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 55000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 70000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 21) {
            Teste_Phidrica2.opcao_hidrica2 = 22;
            Somas.resh21 = Somas.pegada_hidrica - Somas.resh20;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 150000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 288000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 570000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 950000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 2000000;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 2700000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 23) {
            Teste_Phidrica2.opcao_hidrica2 = 24;
            Somas.resh23 = Somas.pegada_hidrica - Somas.resh22;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 18000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 28800;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 57500;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 86500;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 200500;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 288000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 25) {
            Teste_Phidrica2.opcao_hidrica2 = 26;
            Somas.resh25 = Somas.pegada_hidrica - Somas.resh24;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 540;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 360;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 180;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 27) {
            Teste_Phidrica2.opcao_hidrica2 = 28;
            Somas.resh27 = Somas.pegada_hidrica - Somas.resh26;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 130;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 390;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 650;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 800;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 29) {
            Teste_Phidrica2.opcao_hidrica2 = 30;
            Somas.resh29 = Somas.pegada_hidrica - Somas.resh28;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 9000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 18000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 36000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 55000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 100000;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 180000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 31) {
            Teste_Phidrica2.opcao_hidrica2 = 32;
            Somas.resh31 = Somas.pegada_hidrica - Somas.resh30;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 7500;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 17500;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 38000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 62000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 75000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 33) {
            Teste_Phidrica2.opcao_hidrica2 = 34;
            Somas.resh33 = Somas.pegada_hidrica - Somas.resh32;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 7500;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 17500;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 38000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 62000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 75000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        } if (opcao_hidrica == 35) {
            Intent res_hid = new Intent(this, Resultado.class);
            finish();
            Somas.resh35 = Somas.pegada_hidrica - Somas.resh34;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(res_hid);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += (30*150);
                startActivity(res_hid);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += (70*150);
                startActivity(res_hid);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += (120*150);
                startActivity(res_hid);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += (150*150);
                startActivity(res_hid);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
    }

    public void voltar_h(View v) {
        Intent ant = new Intent(this, Teste_Phidrica2.class);
        if (opcao_hidrica < 3) {
            Intent vo = new Intent(this, Fragment.class);
            startActivity(vo);
            Somas.pegada_hidrica = 0;
        } if (opcao_hidrica == 3) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 2;
            Somas.pegada_hidrica = Somas.resh2;
        } if (opcao_hidrica == 5) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 4;
            Somas.pegada_hidrica = Somas.resh4;
        } if (opcao_hidrica == 7) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 6;
            Somas.pegada_hidrica = Somas.resh6;
        } if (opcao_hidrica == 9) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 8;
            Somas.pegada_hidrica = Somas.resh8;
        } if (opcao_hidrica == 11) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 10;
            Somas.pegada_hidrica = Somas.resh10;
        } if (opcao_hidrica == 13) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 12;
            Somas.pegada_hidrica = Somas.resh12;
        } if (opcao_hidrica == 15) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 14;
            Somas.pegada_hidrica = Somas.resh14;
        } if (opcao_hidrica == 17) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 16;
            Somas.pegada_hidrica = Somas.resh16;
        } if (opcao_hidrica == 19) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 18;
            Somas.pegada_hidrica = Somas.resh18;
        } if (opcao_hidrica == 21) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 20;
            Somas.pegada_hidrica = Somas.resh20;
        } if (opcao_hidrica == 23) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 22;
            Somas.pegada_hidrica = Somas.resh22;
        } if (opcao_hidrica == 25) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 24;
            Somas.pegada_hidrica = Somas.resh24;
        } if (opcao_hidrica == 27) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 26;
            Somas.pegada_hidrica = Somas.resh26;
        } if (opcao_hidrica == 29) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 28;
            Somas.pegada_hidrica = Somas.resh28;
        } if (opcao_hidrica == 31) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 30;
            Somas.pegada_hidrica = Somas.resh30;
        } if (opcao_hidrica == 33) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 32;
            Somas.pegada_hidrica = Somas.resh32;
        } if (opcao_hidrica == 35) {
            startActivity(ant);
            Teste_Phidrica2.opcao_hidrica2 = 34;
            Somas.pegada_hidrica = Somas.resh34;
        }
    }
}