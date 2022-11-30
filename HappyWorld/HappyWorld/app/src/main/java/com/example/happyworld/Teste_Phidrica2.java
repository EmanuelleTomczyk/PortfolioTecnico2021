package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Teste_Phidrica2 extends AppCompatActivity {
    RadioButton r1, r2, r3, r4, r5, r6, r7;
    TextView texto2;
    ImageView imagem2;
    static int opcao_hidrica2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teste_phidrica2);
        texto2 = findViewById(R.id.texto2);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6_1);
        r7 = findViewById(R.id.r7_2);
        imagem2 = findViewById(R.id.imagem_t);
        if (opcao_hidrica2 == 2) {
            texto2.setText("Quantas pessoas moram na sua residência?");
            r1.setText("1");
            r2.setText("2");
            r3.setText("3");
            r4.setText("4");
            r5.setText("5 ou mais");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem2.setImageResource(R.drawable.moradia_eco);
        }
        if (opcao_hidrica2 == 4) {
            texto2.setText("Quantas vezes por semana você lava roupa?");
            r1.setText("1");
            r2.setText("2");
            r3.setText("3 ou 4");
            r4.setText("5 ou mais");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem2.setImageResource(R.drawable.moradia_eco);
        }
        if (opcao_hidrica2 == 6) {
            imagem2.setImageResource(R.drawable.moradia_eco);
            texto2.setText("Você lava a louça em água corrente?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setText("Uso máquina de lavar");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 8) {
            imagem2.setImageResource(R.drawable.moradia_eco);
            texto2.setText("Quantas vezes por semana você rega seu jardim?");
            r1.setText("Não tenho jardim");
            r2.setText("1-3");
            r3.setText("3-6");
            r4.setText("6-9");
            r5.setText("Mais de 9");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 10) {
            imagem2.setImageResource(R.drawable.moradia_eco);
            texto2.setText("Qual a capacidade da sua piscina/banheira?");
            r1.setText("Não tenho piscina ou banheira");
            r2.setText("Menos de 150l");
            r3.setText("150-200l");
            r4.setText("200-400l");
            r5.setText("400-600l");
            r6.setText("Mais de 600l");
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 12) {
            imagem2.setImageResource(R.drawable.hig);
            texto2.setText("Quando você escova os dentes:");
            r1.setText("Usa copo");
            r2.setText("Não usa copo, mas fecha a torneira enquanto escova os dentes");
            r3.setText("Não usa copo e não fecha a torneira enquanto escova os dentes");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 14) {
            imagem2.setImageResource(R.drawable.hig);
            texto2.setText("Quanto tempo você demora no banho?");
            r1.setText("5 min");
            r2.setText("10 a 15 min");
            r3.setText("15 a 20 min");
            r4.setText("20 a 25 min");
            r5.setText("25 a 30 min");
            r6.setText("Mais de 30min");
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 16) {
            imagem2.setImageResource(R.drawable.hig);
            texto2.setText("O seu vaso sanitário tem a opção de descarga dupla?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 18) {
            imagem2.setImageResource(R.drawable.hig);
            texto2.setText("Quantas vezes por dia você lava as mãos?");
            r1.setText("1-4");
            r2.setText("4-8");
            r3.setText("8-12");
            r4.setText("Mais de 12");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 20) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantos kg de frango você consome por semana?");
            r1.setText("Não consumo frango");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
        }
        if (opcao_hidrica2 == 22) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantas kg de carne bovina você consome por semana?");
            r1.setText("Não consumo carne bovina");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
        }
        if (opcao_hidrica2 == 24) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantos ovos você consome por semana?");
            r1.setText("Nenhum");
            r2.setText("1-3");
            r3.setText("3-6");
            r4.setText("6-10");
            r5.setText("10-20");
            r6.setText("Mais de 20");
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 26) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantas kg de tubérculos (batata, cenoura…) você consome por semana?");
            r1.setText("Nenhum");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
        }
        if (opcao_hidrica2 == 28) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantos kg de massas você consome por semana?");
            r1.setText("Não consumo massas");
            r2.setText("Menos de 1kg");
            r3.setText("1");
            r4.setText("2-3");
            r5.setText("3-5");
            r6.setText("5-10");
            r7.setText("Mais de 10");
        }
        if (opcao_hidrica2 == 30) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantas barras de chocolate você come por semana?");
            r1.setText("Nenhuma");
            r2.setText("1-3");
            r3.setText("3-5");
            r4.setText("5-7");
            r5.setText("Mais de 7");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (opcao_hidrica2 == 32) {
            texto2.setText("Quantas meias, luvas, roupas de banho, roupas íntimas, pijamas, lenços, gravatas e cachecóis você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10 ");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem2.setImageResource(R.drawable.consumo);
        }
        if (opcao_hidrica2 == 34) {
            texto2.setText("Qual o número médio de páginas dos livros/cadernos que você compra?");
            r1.setText("Menos de 100");
            r2.setText("100");
            r3.setText("200");
            r4.setText("300");
            r5.setText("Mais de 300");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem2.setImageResource(R.drawable.consumo);
        }
    }

    public void calcular_hidrica2(View v) {
        Intent c = new Intent(this, Teste_Phidrica1.class);
        if (opcao_hidrica2 == 2) {
            Teste_Phidrica1.opcao_hidrica = 3;
            Somas.resh2 = Somas.pegada_hidrica - Somas.resh1;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += Somas.resh1;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += Somas.pegada_hidrica/2;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += (Somas.pegada_hidrica/3);
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += (Somas.pegada_hidrica/4);
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += (Somas.pegada_hidrica/6);
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 4) {
            Teste_Phidrica1.opcao_hidrica = 5;
            double i = Somas.res3;
            Somas.resh4 = Somas.pegada_hidrica - Somas.res3;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 120 * 45;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 120 * 90;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 120 * 140;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 120 * 280;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 6) {
            Teste_Phidrica1.opcao_hidrica = 7;
            Somas.resh6 = Somas.pegada_hidrica - Somas.res5;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 60000;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 20000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 8) {
            Teste_Phidrica1.opcao_hidrica = 9;
            Somas.resh8 = Somas.pegada_hidrica - Somas.res7;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 520;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 1000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 2080;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 3000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 10) {
            Teste_Phidrica1.opcao_hidrica = 11;
            Somas.resh10 = Somas.pegada_hidrica - Somas.res9;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 80;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 170;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 300;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 500;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 700;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 12) {
            Teste_Phidrica1.opcao_hidrica = 13;
            Somas.resh12 = Somas.pegada_hidrica - Somas.res11;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0.5;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 1.5;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 10;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 14) {
            Teste_Phidrica1.opcao_hidrica = 15;
            Somas.resh14 = Somas.pegada_hidrica - Somas.res13;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 40;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 70;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 100;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 180;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 220;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 260;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 16) {
            Teste_Phidrica1.opcao_hidrica = 17;
            Somas.resh16 = Somas.pegada_hidrica - Somas.res15;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 130000;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 200000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 18) {
            Teste_Phidrica1.opcao_hidrica = 19;
            Somas.resh18 = Somas.pegada_hidrica - Somas.res17;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += (720 * 0.75);
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += (21000 * 0.75);
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += (3600 * 0.75);
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += (4300 * 0.75);
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 20) {
            Teste_Phidrica1.opcao_hidrica = 21;
            Somas.resh20 = Somas.pegada_hidrica - Somas.resh19;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 100000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 190000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 380000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 760000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 1100000;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 2700000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 22) {
            Teste_Phidrica1.opcao_hidrica = 23;
            Somas.resh22 = Somas.pegada_hidrica - Somas.resh21;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 300000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 700000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 1500000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 2400000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 4500000;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 7200000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 24) {
            Teste_Phidrica1.opcao_hidrica = 25;
            Somas.resh24 = Somas.pegada_hidrica - Somas.resh23;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 14500;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 72000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 115200;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 216000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 280000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 26) {
            Teste_Phidrica1.opcao_hidrica = 27;
            Somas.resh26 = Somas.pegada_hidrica - Somas.resh25;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 5000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 7200;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 14500;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 28000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 43200;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 72000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 28) {
            Teste_Phidrica1.opcao_hidrica = 29;
            Somas.resh28 = Somas.pegada_hidrica - Somas.resh27;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 30000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 54000;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 108000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 200000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 270000;
                startActivity(c);
            } else if (r7.isChecked()) {
                Somas.pegada_hidrica += 540000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 30) {
            Teste_Phidrica1.opcao_hidrica = 31;
            Somas.resh30 = Somas.pegada_hidrica - Somas.resh29;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 61000;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 183600;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 310000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 427000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 32) {
            Teste_Phidrica1.opcao_hidrica = 33;
            Somas.resh32 = Somas.pegada_hidrica - Somas.resh31;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 3600;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 8400;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 18000;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 30000;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_hidrica += 36000;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
        if (opcao_hidrica2 == 34) {
            Teste_Phidrica1.opcao_hidrica = 35;
            Somas.resh34 = Somas.pegada_hidrica - Somas.resh33;
            if (r1.isChecked()) {
                Somas.pegada_hidrica += 50;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_hidrica += 100;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_hidrica += 200;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_hidrica += 300;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_hidrica += 400;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção" + Somas.pegada_hidrica, Toast.LENGTH_LONG).show();
            }
        }
    }

    public void voltar_h2(View v) {
        Intent ant = new Intent(this, Teste_Phidrica1.class);
        if (opcao_hidrica2 == 2) {
            startActivity(ant);
            Somas.pegada_hidrica = Somas.resh1;
            Teste_Phidrica1.opcao_hidrica = 1;
        }
        if (opcao_hidrica2 == 4) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 3;
            Somas.pegada_hidrica = Somas.resh3;
        }
        if (opcao_hidrica2 == 6) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 5;
            Somas.pegada_hidrica = Somas.resh5;
        }
        if (opcao_hidrica2 == 8) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 7;
            Somas.pegada_hidrica = Somas.resh7;
        }
        if (opcao_hidrica2 == 10) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 9;
            Somas.pegada_hidrica = Somas.resh9;
        }
        if (opcao_hidrica2 == 12) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 11;
            Somas.pegada_hidrica = Somas.resh11;
        }
        if (opcao_hidrica2 == 14) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 13;
            Somas.pegada_hidrica = Somas.resh13;
        }
        if (opcao_hidrica2 == 16) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 15;
            Somas.pegada_hidrica = Somas.resh15;
        }
        if (opcao_hidrica2 == 18) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 17;
            Somas.pegada_hidrica = Somas.resh17;
        }
        if (opcao_hidrica2 == 20) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 19;
            Somas.pegada_hidrica = Somas.resh19;
        }
        if (opcao_hidrica2 == 22) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 21;
            Somas.pegada_hidrica = Somas.resh21;
        }
        if (opcao_hidrica2 == 24) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 23;
            Somas.pegada_hidrica = Somas.resh23;
        }
        if (opcao_hidrica2 == 26) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 25;
            Somas.pegada_hidrica = Somas.resh25;
        }
        if (opcao_hidrica2 == 28) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 27;
            Somas.pegada_hidrica = Somas.resh27;
        }
        if (opcao_hidrica2 == 30) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 29;
            Somas.pegada_hidrica = Somas.resh29;
        }
        if (opcao_hidrica2 == 32) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 31;
            Somas.pegada_hidrica = Somas.resh31;
        }
        if (opcao_hidrica2 == 34) {
            startActivity(ant);
            Teste_Phidrica1.opcao_hidrica = 33;
            Somas.pegada_hidrica = Somas.resh33;
        }
    }
}