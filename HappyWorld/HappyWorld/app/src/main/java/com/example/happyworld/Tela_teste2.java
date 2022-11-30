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

public class Tela_teste2 extends AppCompatActivity {
    ProgressBar pb;
    RadioButton r1, r2, r3, r4, r5, r6;
    TextView texto2;
    ImageView imagem2;
    static int opcao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_teste2);
        getSupportActionBar().hide();
        texto2 = findViewById(R.id.texto2);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        imagem2 = findViewById(R.id.imagem_t2);
        pb = findViewById(R.id.pb_ali);
        organiza();
    }

    public void organiza() {
        if (opcao2 == 2) {
            texto2.setText("Qual o sistema de aquecimento da sua casa?");
            r1.setText("Gás natural");
            r2.setText("Eletricidade");
            r3.setText("Gasóleo");
            r4.setText("Fontes renováveis");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        }
        if (opcao2 == 4) {
            texto2.setText("Em que tipo de casa vives?");
            r1.setText("Apartamento");
            r2.setText("Casa");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        }
        if (opcao2 == 6) {
            imagem2.setImageResource(R.drawable.alimentacao);
            texto2.setText("Quantas refeições feitas em casa você come por semana?");
            r1.setText("Menos de 10");
            r2.setText("10 a 14");
            r3.setText("15 a 18");
            r4.setText("Mais de 18");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        }
        if (opcao2 == 8) {
            imagem2.setImageResource(R.drawable.trasportes);
            texto2.setText("Que tipo de automóvel você tem?");
            r1.setText("Moto");
            r2.setText("Baixa cilindrada (até 1200 c.c.)");
            r3.setText("Média e alta cilindrada (a partir de 1200 c.c.)");
            r4.setText("Van ou caminhonete");
            r5.setText("Automóvel com tração 4 rodas");
            r6.setText("Nenhum");
        }
        if (opcao2 == 10) {
            imagem2.setImageResource(R.drawable.trasportes);
            texto2.setText("Quantos quilômetros você tem que percorrer de carro para chegar ao trabalho e/ou escola?");
            r1.setText("Não tenho carro");
            r2.setText("Menos de 10");
            r3.setText("Entre 10 e 30");
            r4.setText("Entre 30 e 50");
            r5.setText("Entre 50 e 100");
            r6.setText("Mais de 100");
        }
        if (opcao2 == 12) {
            imagem2.setImageResource(R.drawable.trasportes);
            texto2.setText("Em quantos fins de semana você viaja de carro (no mínimo 20 km)?");
            r1.setText("0");
            r2.setText("1 a 3");
            r3.setText("4 a 6");
            r4.setText("7 a 9");
            r5.setText("Mais de 9");
            r6.setVisibility(View.INVISIBLE);
        }
        if (opcao2 == 14) {
            imagem2.setImageResource(R.drawable.consumo);
            texto2.setText("Você costuma comprar produtos de baixo consumo de energia?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        } if (opcao2 == 16) {
            imagem2.setImageResource(R.drawable.residuo);
            texto2.setText("Você costuma praticar a compostagem dos resíduos orgânicos?");
            r1.setText("Sempre");
            r2.setText("Às vezes");
            r3.setText("Nunca");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        } if (opcao2 == 18) {
            imagem2.setImageResource(R.drawable.residuo);
            texto2.setText("Quantos sacos de lixo você produz por semana?");
            r1.setText("1");
            r2.setText("2");
            r3.setText("3 ou mais");
            r4.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        }
    }

    public void voltar(View v) {
        Intent vo = new Intent(this, Tela_teste.class);
        if (opcao2 == 2) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res1;
            Tela_teste.opcao = 1;
        } if (opcao2 == 4) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res3;
            Tela_teste.opcao = 3;
        } if (opcao2 == 6) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res5;
            Tela_teste.opcao = 5;
        } if (opcao2 == 8) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res7;
            Tela_teste.opcao = 7;
        } if (opcao2 == 10) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res9;
            Tela_teste.opcao = 9;
        } if (opcao2 == 12) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res11;
            Tela_teste.opcao = 11;
        } if (opcao2 == 14) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res13;
            Tela_teste.opcao = 13;
        } if (opcao2 == 16) {
            startActivity(vo);
            Somas.pegada_ecologica = Somas.res15;
            Tela_teste.opcao = 15;
        } if (opcao2 == 18) {
            startActivity(vo);
            Tela_teste.opcao = 17;
            Somas.pegada_ecologica = Somas.res17;
        }
    }

    public void calcular(View v) {
        Intent c = new Intent(this, Tela_teste.class);
        if (opcao2 == 2) {
            Tela_teste.opcao = 3;
            Somas.res2 = Somas.pegada_ecologica - Somas.res1;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 40;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 50;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 4) {
            Tela_teste.opcao = 5;
            Somas.res4 = Somas.pegada_ecologica - Somas.res3;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 40;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 6) {
            Tela_teste.opcao = 7;
            Somas.res6 = Somas.pegada_ecologica - Somas.res5;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 15;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 8) {
            Tela_teste.opcao = 9;
            Somas.res8 = Somas.pegada_ecologica - Somas.res7;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 35;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 60;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 75;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 100;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 130;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 10) {
            Tela_teste.opcao = 11;
            Somas.res10 = Somas.pegada_ecologica - Somas.res9;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 60;
                startActivity(c);
            } else if (r6.isChecked()) {
                Somas.pegada_ecologica += 80;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 12) {
            Tela_teste.opcao = 13;
            Somas.res12 = Somas.pegada_ecologica - Somas.res11;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 40;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 14) {
            Tela_teste.opcao = 15;
            Somas.res14 = Somas.pegada_ecologica - Somas.res13;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        }
        if (opcao2 == 16) {
            Tela_teste.opcao = 17;
            Somas.res16 = Somas.pegada_ecologica - Somas.res15;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        } if (opcao2 == 18) {
            Intent r = new Intent(this, Resultado.class);
            Somas.res18 = Somas.pegada_ecologica - Somas.res17;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(r);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(r);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(r);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            finish();
        }
    }
}