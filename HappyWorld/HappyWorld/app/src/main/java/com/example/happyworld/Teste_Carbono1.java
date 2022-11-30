package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Teste_Carbono1 extends AppCompatActivity {
    RadioButton r1, r2, r3, r4, r5, r6, r7;
    TextView texto1;
    ImageView imagem, avancar;
    static int opcao_carbono = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_carbono1);
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

        if (opcao_carbono == 1) {
            texto1.setText("Quantas pessoas moram na sua residência?");
            r1.setText("1");
            r2.setText("2");
            r3.setText("3");
            r4.setText("4");
            r5.setText("5 ou mais");
            imagem.setImageResource(R.drawable.moradia_eco);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_carbono == 3) {
            texto1.setText("Quantos reais você gasta com gás, em média, por mês?");
            r1.setText("Nada");
            r2.setText("30 a 50 reais");
            r3.setText("50 a 100 reais");
            r4.setText("100 a 150 reais");
            r5.setText("150 a 200 reais");
            r6.setText("mais de 200 reais");
            imagem.setImageResource(R.drawable.moradia_eco);
            r7.setVisibility(View.INVISIBLE);
        } if (opcao_carbono == 5) {
            texto1.setText("Em média, quanto você come por dia?");
            r1.setText("Eu como pouco (1000 kcal)");
            r2.setText("Moderadamente (1500 kcal)");
            r3.setText("Bastante (2000 kcal)");
            r4.setText("Muito (3000 kcal)");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao_carbono == 7) {
            texto1.setText("Quais meios de transporte você costuma utilizar no seu dia a dia?");
            r1.setText("Carro");
            r2.setText("Bicicleta");
            r3.setText("Motocicleta");
            r4.setText("Transporte público");
            r5.setText("Ando a pé");
            r6.setText("Pego carona");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono == 9) {
            texto1.setText("Em média, quanto você gasta com etanol por mês?");
            r1.setText("Nada");
            r2.setText("50 a 100 reais");
            r3.setText("100 a 200 reais");
            r4.setText("200 a 300 reais");
            r5.setText("mais de 300 reais");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono == 11) {
            texto1.setText("Em média, quanto você gasta com Gás Natural Veicular (GNV) por mês?");
            r1.setText("Nada");
            r2.setText("50 a 100 reais");
            r3.setText("100 a 200 reais");
            r4.setText("200 a 300 reais");
            r5.setText("mais de 300 reais");
            r6.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono == 13) {
            texto1.setText("Em média, quanto tempo você gasta com transporte público por dia?");
            r1.setText("Nenhum");
            r2.setText("Menos de 15 min");
            r3.setText("15 a 30 min");
            r4.setText("30 a 45 min");
            r5.setText("45 a 60 min");
            r6.setText("Mais de 1h");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao_carbono == 15) {
            texto1.setText("Quantos ternos, jaquetas, vestidos, casacos e camisas você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        } if (opcao_carbono == 17) {
            texto1.setText("Quantas camisetas, calças, shorts, saias e roupas de treino você compra por ano?");
            r1.setText("Nenhum");
            r2.setText("1-5");
            r3.setText("5-10");
            r4.setText("10-20");
            r5.setText("20-30");
            r6.setText("Mais de 30");
            r7.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        }
    }

    public void calcular_carb(View v) {
        Intent c = new Intent(this, Teste_PCarbono2.class);
        if (opcao_carbono == 1) {
            Teste_PCarbono2.opcao_carbono2 = 2;
            Somas.resc1 = Somas.pegada_carbono;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 25;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 15;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        } if (opcao_carbono == 3) {
            Somas.resc3 = Somas.pegada_carbono - Somas.resc2;
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
            Teste_PCarbono2.opcao_carbono2 = 4;
        } if (opcao_carbono == 5) {
            Somas.resc5 = Somas.pegada_carbono - Somas.resc4;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 45;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 6;
        } if (opcao_carbono == 7) {
            Somas.resc7 = Somas.pegada_carbono - Somas.resc6;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 60;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 20;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 8;
        } if (opcao_carbono == 9) {
            Somas.resc9 = Somas.pegada_carbono - Somas.resc8;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 15;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 25;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 35;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 50;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 10;
        } if (opcao_carbono == 11) {
            Somas.resc11 = Somas.pegada_carbono - Somas.resc10;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 8;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 16;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 24;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 35;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 12;
        } if (opcao_carbono == 13) {
            Somas.resc13 = Somas.pegada_carbono - Somas.resc12;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 45;
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
            Teste_PCarbono2.opcao_carbono2 = 14;
        } if (opcao_carbono == 15) {
            Somas.resc15 = Somas.pegada_carbono - Somas.resc14;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 25;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 35;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_carbono += 45;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_carbono += 60;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 16;
        } if (opcao_carbono == 17) {
            Somas.resc17 = Somas.pegada_carbono - Somas.resc16;
            if (r1.isChecked()) {
                Somas.pegada_carbono += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_carbono += 15;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 25;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 40;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_carbono += 50;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_carbono += 70;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Teste_PCarbono2.opcao_carbono2 = 18;
        }
    }

    public void voltar_c(View v) {
        Intent ant = new Intent(this, Teste_PCarbono2.class);
        if (opcao_carbono < 3) {
            Intent vo = new Intent(this, Fragment.class);
            startActivity(vo);
            Somas.pegada_carbono = 0;
        } if (opcao_carbono == 3) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 2;
            Somas.pegada_carbono = Somas.resc2;
        } if (opcao_carbono == 5) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 4;
            Somas.pegada_carbono = Somas.resc4;
        } if (opcao_carbono == 7) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 6;
            Somas.pegada_carbono = Somas.resc6;
        } if (opcao_carbono == 9) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 8;
            Somas.pegada_carbono = Somas.resc8;
        } if (opcao_carbono == 11) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 10;
            Somas.pegada_carbono = Somas.resc10;
        } if (opcao_carbono == 13) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 12;
            Somas.pegada_carbono = Somas.resc12;
        } if (opcao_carbono == 15) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 14;
            Somas.pegada_carbono = Somas.resc14;
        } if (opcao_carbono == 17) {
            startActivity(ant);
            Teste_PCarbono2.opcao_carbono2 = 16;
            Somas.pegada_carbono = Somas.resc16;
        }
    }
}