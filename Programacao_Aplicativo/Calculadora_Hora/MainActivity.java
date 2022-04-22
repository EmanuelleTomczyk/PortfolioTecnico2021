package com.example.horrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText h1, m1, h2, m2;
    TextView sh, sm;
    Button soma, subtrai, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        h1 = findViewById(R.id.h1);
        m1 = findViewById(R.id.m1);
        h2 = findViewById(R.id.h2);
        m2 = findViewById(R.id.m2);
        sh = findViewById(R.id.sh);
        sm = findViewById(R.id.sm);
        soma = findViewById(R.id.soma);
        subtrai = findViewById(R.id.subtrai);
        reset = findViewById(R.id.reset);
    }

    public void subtrai(View subtrai){
        int conta_min = 0;
        int conta_hora = 0;
        int a = Integer.parseInt(m1.getText().toString());
        int b = Integer.parseInt(m2.getText().toString());
        int c = Integer.parseInt(h1.getText().toString());
        int d = Integer.parseInt(h2.getText().toString());

        if(subtrai.isClickable()){
            conta_min = a - b;
            conta_hora = c - d;
            sh.setText(conta_hora+"");
            sm.setText(conta_min+"");

            while (conta_min < 0) {
                conta_hora--;
                conta_min = conta_min + 60;
                sh.setText(conta_hora + "");
                sm.setText(conta_min + "");
            }

            while (a > 59){
                c ++;
                a = a -60;
            }

            while (b > 59){
                d ++;
                b = b -60;
            }
        }

        if (d > c){
            conta_hora = d - c;
            conta_min = b - a;
            sh.setText(conta_hora + "");
            sm.setText(conta_min + "");
        }

        else{
            conta_hora = c - d;
            sh.setText(conta_hora + "");
            sm.setText(conta_min + "");
            if(b > a){
                conta_min = b - a;
                sh.setText(conta_hora + "");
                sm.setText(conta_min + "");
            }
            else{
                conta_min = a - b;
                sh.setText(conta_hora + "");
                sm.setText(conta_min + "");
            }
        }
    }

    public void soma(View soma){
        int conta_min = 0;
        int conta_hora = 0;
        int a = Integer.parseInt(m1.getText().toString());
        int b = Integer.parseInt(m2.getText().toString());
        int c = Integer.parseInt(h1.getText().toString());
        int d = Integer.parseInt(h2.getText().toString());

        if(soma.isClickable()){
            conta_min = a + b;
            conta_hora = c + d;
            sh.setText(conta_hora+"");
            sm.setText(conta_min+"");

            while (conta_min > 59){
                conta_hora ++;
                conta_min = conta_min - 60;
                sh.setText(conta_hora+"");
                sm.setText(conta_min+"");
            }
        }
    }

    public void reset(View reset){
        if(reset.isClickable()) {
            m1.setText("");
            m2.setText("");
            h1.setText("");
            h2.setText("");
            sh.setText("");
            sm.setText("");
        }
    }
}