package com.example.teste_fumator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Informacoes extends AppCompatActivity {
    String usuarioID;
    EditText nicotinac, eletronicoc, charutoc, tabacoc, narguilec, maconhac, palhac;
    Button entrar_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);
        getSupportActionBar().hide();
        Componentes();
        entrar_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String erro;
                String nicotina = nicotinac.getText().toString();
                String eletronico = eletronicoc.getText().toString();
                String charuto = charutoc.getText().toString();
                String tabaco = tabacoc.getText().toString();
                String narguile = narguilec.getText().toString();
                String maconha = maconhac.getText().toString();
                String palha = palhac.getText().toString();
                if(nicotina.isEmpty() && eletronico.isEmpty() && charuto.isEmpty() && tabaco.isEmpty() && narguile.isEmpty() && maconha.isEmpty() && palha.isEmpty()){
                    erro = "Preencha alguma das informações!";
                    Snackbar snackbar = Snackbar.make(v, erro, Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    Salvar_dados();
                    Intent i = new Intent(Informacoes.this, Fragment.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

    private void Salvar_dados() {
        String nicotina = nicotinac.getText().toString();
        String eletronico = eletronicoc.getText().toString();
        String charuto = charutoc.getText().toString();
        String tabaco = tabacoc.getText().toString();
        String narguile = narguilec.getText().toString();
        String maconha = maconhac.getText().toString();
        String palha = palhac.getText().toString();

        try {
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            Map<String, Object> dados = new HashMap<>();
            dados.put("nicotina", nicotina);
            dados.put("eletronico", eletronico);
            dados.put("charuto", charuto);
            dados.put("tabaco", tabaco);
            dados.put("narguile", narguile);
            dados.put("maconha", maconha);
            dados.put("palha", palha);

            usuarioID = FirebaseAuth.getInstance().getUid();
            DocumentReference documentReference = db.collection("Informacoes").document(usuarioID);
            documentReference.set(dados).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    Log.d("db", "Sucesso ao salvar os dados");
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("erro", "Erro ao salvar os dados" + e.toString());
                }
            });
        }
        catch(Exception e){
            Toast.makeText(this, "Insira um dado numérico", Toast.LENGTH_SHORT).show();
        }
    }

    public void Componentes(){
        nicotinac = findViewById(R.id.nicotina);
        eletronicoc = findViewById(R.id.eletronico);
        charutoc = findViewById(R.id.charuto);
        tabacoc = findViewById(R.id.tabaco);
        narguilec = findViewById(R.id.narguile);
        maconhac = findViewById(R.id.maconha);
        palhac = findViewById(R.id.palha);
        entrar_info = findViewById(R.id.entrar_info);
    }
}