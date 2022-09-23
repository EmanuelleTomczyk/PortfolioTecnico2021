package com.example.teste_fumator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    private EditText email_lg, senha_lg;
    Button entrar, google;
    MainActivity mainActivity = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        componentes();
        String[] mensagem = {"Preencha todos os campos!"};

        google.setOnClickListener(view -> mainActivity.signIn());

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email_lg.getText().toString();
                String senha = senha_lg.getText().toString();

                if (email.isEmpty() || senha.isEmpty()){
                    Snackbar snackbar = Snackbar.make(v, mensagem[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    Autenticar_usuario(v);
                }
            }
        });
    }

    private void Autenticar_usuario(View v){
        String email = email_lg.getText().toString();
        String senha = senha_lg.getText().toString();

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent l = new Intent(Login.this, Fragment.class);
                    startActivity(l);
                } else {
                    String erro;
                    try {
                        throw task.getException();
                    } catch (Exception e){
                        erro = "Erro ao logar usuário!";
                        Snackbar snackbar = Snackbar.make(v, erro, Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser usuario = FirebaseAuth.getInstance().getCurrentUser();
        if(usuario != null){
            Intent intent = new Intent(Login.this, Fragment.class);
        }
    }

    private void componentes(){
        email_lg = findViewById(R.id.email_login);
        senha_lg = findViewById(R.id.senha_login);
        entrar = findViewById(R.id.entrar);
        google = findViewById(R.id.google);
    }
}