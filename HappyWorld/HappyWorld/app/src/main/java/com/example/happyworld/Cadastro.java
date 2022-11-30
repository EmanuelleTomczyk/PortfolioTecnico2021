package com.example.happyworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Cadastro extends AppCompatActivity {
    EditText email, senha, senha_confirma, nome;
    Button cadastrar_bt;
    String usuarioID;
    String[] mensagem = {"Preencha todos os campos!", "Cadastro realizado com sucesso!", "Senha não confirmada!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        email = findViewById(R.id.email_cad);
        cadastrar_bt = findViewById(R.id.entrar_login);
        senha = findViewById(R.id.senha_cad);
        senha_confirma = findViewById(R.id.senhacad_confirma);
        nome = findViewById(R.id.nome_cadastro);
        Componentes();
        cadastrar_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome_cadastro = nome.getText().toString();
                String email_cadastro = email.getText().toString();
                String senha_cadastro = senha.getText().toString();
                String confirmar_cadastro = senha_confirma.getText().toString();
                if(nome_cadastro.isEmpty() || email_cadastro.isEmpty() || senha_cadastro.isEmpty() || confirmar_cadastro.isEmpty()){
                    Snackbar snackbar = Snackbar.make(v, mensagem[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else if(senha_cadastro.equals(confirmar_cadastro)){
                    Cadastrar_usuario(v);
                }
                else {
                    Snackbar snackbar = Snackbar.make(v, mensagem[2], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }
            }
        });
    }

    private void Cadastrar_usuario(View v){
        String email_cad = email.getText().toString();
        String senha_cad = senha.getText().toString();
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email_cad, senha_cad).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Salvar_dados();
                    Snackbar snackbar = Snackbar.make(v, mensagem[1], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                    Intent l = new Intent(Cadastro.this, Fragment.class);
                    startActivity(l);
                } else{
                    String erro;
                    try {
                        throw  task.getException();
                    } catch (FirebaseAuthWeakPasswordException e){
                        erro = "Digite uma senha com no mínimo 6 caracteres!";
                    } catch (FirebaseAuthUserCollisionException e){
                        erro = "Essa conta já foi cadastrada!";
                    } catch (FirebaseAuthInvalidCredentialsException e){
                        erro = "E-mail inválido!";
                    }
                    catch (Exception e) {
                        erro = "Erro ao cadastrar usuário!";
                    }
                    Snackbar snackbar = Snackbar.make(v, erro, Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }
            }
        });
    }

    private void Salvar_dados(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String nome_usu = nome.getText().toString();

        Map<String, Object> nomes_usuarios = new HashMap<>();
        nomes_usuarios.put("nome_user", nome_usu);

        usuarioID = FirebaseAuth.getInstance().getUid();
        DocumentReference documentReference = db.collection("HappyWorld").document(usuarioID);
        documentReference.set(nomes_usuarios).addOnSuccessListener(new OnSuccessListener<Void>() {
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

    private void Componentes(){
        nome = findViewById(R.id.nome_cadastro);
        email = findViewById(R.id.email_cad);
        senha = findViewById(R.id.senha_cad);
        senha_confirma = findViewById(R.id.senhacad_confirma);
    }

    public void log(View v){
        Intent log = new Intent(Cadastro.this, Login.class);
        startActivity(log);
    }
}