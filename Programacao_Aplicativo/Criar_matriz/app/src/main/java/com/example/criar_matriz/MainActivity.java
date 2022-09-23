package com.example.criar_matriz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText um, dois, tres, quatro, cinco, seis, sete, oito, nove;
     TextView det;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        um = findViewById(R.id.um);
        dois = findViewById(R.id.dois);
        tres = findViewById(R.id.tres);
        quatro = findViewById(R.id.quatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        sete = findViewById(R.id.sete);
        oito = findViewById(R.id.oito);
        nove = findViewById(R.id.nove);
        det = findViewById(R.id.det);
    }

    public void limpar(View v){
        um.setText("");
        dois.setText("");
        tres.setText("");
        quatro.setText("");
        cinco.setText("");
        seis.setText("");
        sete.setText("");
        oito.setText("");
        nove.setText("");
    }

    public void calculo(View v) {
        try {
            int n1 = Integer.parseInt(String.valueOf(um.getText()));
            int n2 = Integer.parseInt(String.valueOf(dois.getText()));
            int n3 = Integer.parseInt(String.valueOf(tres.getText()));
            int n4 = Integer.parseInt(String.valueOf(quatro.getText()));
            int n5 = Integer.parseInt(String.valueOf(cinco.getText()));
            int n6 = Integer.parseInt(String.valueOf(seis.getText()));
            int n7 = Integer.parseInt(String.valueOf(sete.getText()));
            int n8 = Integer.parseInt(String.valueOf(oito.getText()));
            int n9 = Integer.parseInt(String.valueOf(nove.getText()));
            int d1 = n1 * n5 * n9 + n2 * n6 * n7 + n3 * n4 * n8 - (n2 * n4 * n9) - (n1 * n6 * n8) - (n3 * n5 * n7);
            det.setText("Determinante" + "\n" + d1 + "");
        } catch (Exception e){
            Toast.makeText(this, "Preencha os dados corretamente", Toast.LENGTH_SHORT).show();
        }

    }
}