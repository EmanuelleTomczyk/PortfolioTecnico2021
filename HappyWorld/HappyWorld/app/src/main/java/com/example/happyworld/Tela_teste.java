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

public class Tela_teste extends AppCompatActivity {
    RadioButton r1, r2, r3, r4, r5, r6;
    TextView texto1;
    ImageView imagem, avancar;
    static int opcao = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_teste);
        getSupportActionBar().hide();
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6_1);
        avancar = findViewById(R.id.avancar);
        texto1 = findViewById(R.id.texto2);
        imagem = findViewById(R.id.imagem_t);
        organiza();
    }

    public void voltar(View v) {
        Intent ant = new Intent(this, Tela_teste2.class);
        if (opcao < 3) {
            Intent vo = new Intent(this, Fragment.class);
            startActivity(vo);
            Somas.pegada_ecologica = 0;
        } if (opcao == 3) {
            startActivity(ant);
            Tela_teste2.opcao2 = 2;
            Somas.pegada_ecologica = Somas.res2;
        } if (opcao == 5) {
            startActivity(ant);
            Tela_teste2.opcao2 = 4;
            Somas.pegada_ecologica = Somas.res4;
        } if (opcao == 7) {
            startActivity(ant);
            Tela_teste2.opcao2 = 6;
            Somas.pegada_ecologica = Somas.res6;
        } if (opcao == 9) {
            startActivity(ant);
            Tela_teste2.opcao2 = 8;
            Somas.pegada_ecologica = Somas.res8;
        } if (opcao == 11) {
            startActivity(ant);
            Tela_teste2.opcao2 = 10;
            Somas.pegada_ecologica = Somas.res10;
        } if (opcao == 13) {
            startActivity(ant);
            Tela_teste2.opcao2 = 12;
            Somas.pegada_ecologica = Somas.res12;
        } if (opcao == 15) {
            startActivity(ant);
            Tela_teste2.opcao2 = 14;
            Somas.pegada_ecologica = Somas.res14;
        } if (opcao == 17) {
            startActivity(ant);
            Tela_teste2.opcao2 = 16;
            Somas.pegada_ecologica = Somas.res16;
        }
    }

    public void organiza() {
        if (opcao == 1) {
            texto1.setText("Quantas pessoas moram em sua residência?");
            r1.setText("1");
            r2.setText("2");
            r3.setText("3");
            r4.setText("4");
            r5.setText("5 ou mais");
            r6.setVisibility(View.INVISIBLE);
        } if (opcao == 3) {
            texto1.setText("Quantas torneiras há em sua casa?");
            r1.setText("Menos de 3");
            r2.setText("3 a 5");
            r3.setText("6 a 8");
            r4.setText("8 a 10");
            r5.setText("Mais de 10");
            r6.setVisibility(View.INVISIBLE);
        } if (opcao == 5) {
            texto1.setText("Quantas refeições de carne ou de peixe você come por semana?");
            r1.setText("Nenhuma");
            r2.setText("1 a 3");
            r3.setText("4 a 6");
            r4.setText("7 a 10");
            r5.setText("Mais de 10");
            r6.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao == 7) {
            texto1.setText("Você procura comprar alimentos produzidos localmente?");
            r1.setText("Sim");
            r2.setText("Não");
            r3.setText("Às vezes");
            r4.setText("Raramente");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.alimentacao);
        } if (opcao == 9) {
            texto1.setText("Como você vai para o trabalho e/ou escola?");
            r1.setText("Carro");
            r2.setText("Carona");
            r3.setText("Transporte público");
            r4.setText("Bicicleta ou a pé");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao == 11) {
            texto1.setText("Aonde você foi nas últimas férias?");
            r1.setText("Lugar nenhum");
            r2.setText("Fiquei no meu país");
            r3.setText("Viajei pelo continente");
            r4.setText("Saí do continente");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.trasportes);
        } if (opcao == 13) {
            texto1.setText("Quantas compras significativas você faz por ano (tv, computador, mobília, etc)?");
            r1.setText("0");
            r2.setText("1 a 3");
            r3.setText("4 a 6");
            r4.setText("Mais de 6");
            r6.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.consumo);
        } if (opcao == 15) {
            texto1.setText("Com que frequência você procura reduzir a produção de resíduos (evita produtos com muita embalagem, reutiliza papel, etc)?");
            r1.setText("Sempre");
            r2.setText("Às vezes");
            r3.setText("Raramente");
            r4.setText("Nunca");
            r5.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.residuo);
        } if (opcao == 17) {
            texto1.setText("Com que frequência você costuma reciclar o lixo?");
            r1.setText("Sempre");
            r2.setText("Às vezes");
            r3.setText("Raramente");
            r4.setText("Nunca");
            r6.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
            imagem.setImageResource(R.drawable.residuo);
        }
    }

    public void calcular_eco(View v) {
        Intent c = new Intent(this, Tela_teste2.class);
        if (opcao == 1) {
            Tela_teste2.opcao2 = 2;
            Somas.res1 = Somas.pegada_ecologica;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 15;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
        } if (opcao == 3) {
            Somas.res3 = Somas.pegada_ecologica - Somas.res2;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 5;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 15;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 20;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 4;
        } if (opcao == 5) {
            Somas.res5 = Somas.pegada_ecologica - Somas.res4;
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
                Somas.pegada_ecologica += 35;
                startActivity(c);
            } else if (r5.isChecked()) {
                Somas.pegada_ecologica += 50;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 6;
        } if (opcao == 7) {
            Somas.res7 = Somas.pegada_ecologica - Somas.res6;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 125;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 50;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 100;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 8;
        } if (opcao == 9) {
            Somas.res9 = Somas.pegada_ecologica - Somas.res8;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 60;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 15;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 10;
        }
        if (opcao == 11) {
            Somas.res11 = Somas.pegada_ecologica - Somas.res10;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 10;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 50;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 12;
        }
        if (opcao == 13) {
            Somas.res13 = Somas.pegada_ecologica - Somas.res12;
            if (r1.isChecked()) {
                Somas.pegada_ecologica += 0;
                startActivity(c);
            } else if (r2.isChecked()) {
                Somas.pegada_ecologica += 15;
                startActivity(c);
            } else if (r3.isChecked()) {
                Somas.pegada_ecologica += 30;
                startActivity(c);
            } else if (r4.isChecked()) {
                Somas.pegada_ecologica += 45;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 14;
        } if (opcao == 15) {
            Somas.res15 = Somas.pegada_ecologica - Somas.res14;
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
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 16;
        } if (opcao == 17) {
            Somas.res17 = Somas.pegada_ecologica - Somas.res16;
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
                Somas.pegada_ecologica += 25;
                startActivity(c);
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
            }
            Tela_teste2.opcao2 = 18;
        }
    }
}