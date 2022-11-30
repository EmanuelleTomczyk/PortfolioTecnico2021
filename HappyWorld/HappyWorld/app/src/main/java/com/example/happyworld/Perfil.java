package com.example.happyworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Perfil extends AppCompatActivity {
    ImageView img, sair;
    static TextView nome_p, email_p;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String usuarioID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pagamento.tela = 1;
        setContentView(R.layout.activity_perfil);
        getSupportActionBar().hide();
        img = findViewById(R.id.foto);
        nome_p = findViewById(R.id.nome_perfil);
        email_p = findViewById(R.id.email_perfil);
        nome_email();
        img.setVisibility(View.VISIBLE);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},0);
        }
    }

    public void click(View v){
        Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, 0);
        ViewGroup.LayoutParams tamanho = img.getLayoutParams();
        tamanho.height = 600;
        tamanho.width = 600;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == RESULT_OK){
            Uri imagemselecionada = data.getData();
            String[] caminhoarquivo = {MediaStore.Images.Media.DATA};
            Cursor c = getContentResolver().query(imagemselecionada, caminhoarquivo,null,null, null);
            c.moveToFirst();
            int coluna = c.getColumnIndex(caminhoarquivo[0]);
            String caminhofoto = c.getString(coluna);
            c.close();
            Bitmap imagem = BitmapFactory.decodeFile(caminhofoto);
            img.setImageBitmap(imagem);
            sair = findViewById(R.id.sair);
        }
    }

    public void sair_perfil(View v){
        FirebaseAuth.getInstance().signOut();
        Intent sair = new Intent(Perfil.this, MainActivity.class);
        startActivity(sair);
    }

    public void site_perfil(View v){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void ir_pagamento(View v){
        Intent ip = new Intent(this, Pagamento.class);
        startActivity(ip);
    }

    public void ir_metas(View v){
        Intent im = new Intent(this, Metas.class);
        startActivity(im);
    }

    public void inicio(View v){
        Intent ip = new Intent(this, Fragment.class);
        startActivity(ip);
    }
    public void historico(View v){
        Intent h = new Intent(this, Historico.class);
        startActivity(h);
    }


    public void nome_email() {
        onStart();
        String email_ = FirebaseAuth.getInstance().getCurrentUser().getEmail();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("HappyWorld").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    nome_p.setText(documentSnapshot.getString("nome_user"));
                    email_p.setText(email_);
                }
            }
        });
    }
}