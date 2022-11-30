package com.example.happyworld;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Metas extends AppCompatActivity {
    ProgressBar progressBar_ali, progressBar_mor, progressBar_trans, progressBar_cons, progressBar_res, progressBar_hig;
    ArrayList<String> alimentacao = new ArrayList<String>();
    ArrayList<String> transporte = new ArrayList<String>();
    ArrayList<String> moradia = new ArrayList<String>();
    ArrayList<String> residuo = new ArrayList<String>();
    ArrayList<String> consumo = new ArrayList<String>();
    ArrayList<String> higiene = new ArrayList<String>();
    ImageView sim_ali, nao_ali, sim_trans, nao_trans, sim_mor, nao_mor, sim_res, nao_res, sim_cons, nao_cons, sim_hig, nao_hig;
    int contador_ali = 0;
    int contador_mor = 0;
    int contador_trans = 0;
    int contador_res = 0;
    int contador_cons = 0;
    int contador_hig = 0;
    String usuarioID;
    TextView meta_alimentacao, concluido, meta_transporte, meta_moradia, concluido_trans, concluido_mor,
            meta_cons, meta_res, meta_hig, concluido_cons, concluido_res, concluido_hig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metas);
        getSupportActionBar().hide();
        contadores();
        alimentacao.add("Beba água da torneira (filtrada)");
        alimentacao.add("Reduza o desperdício alimentar");
        alimentacao.add("Reduza o consumo de café em 50%");
        alimentacao.add("Reduza o consumo de carne em 50%");
        alimentacao.add("Consuma alimentos locais e sazonais");
        alimentacao.add("Prefira alimentos a base de plantas");
        alimentacao.add("Reduza o consumo de processados em 60%");
        alimentacao.add("Diminua o consumo de laticínios em 50%");
        transporte.add("Utilize majoritariamente transportes coletivos");
        transporte.add("Desloque-se de bicicleta ou a pé quando possível");
        transporte.add("Realize o máximo das suas tarefas em apenas um deslocamento");
        transporte.add("Utilize carro apenas 5 vezes por semana");
        transporte.add("Não acelere o carro constantemente");
        transporte.add("Desligue o ar condicionado do carro");
        moradia.add("Não lave louça em água corrente");
        moradia.add("Plante um jardim");
        moradia.add("Reaproveite água de outras atividades");
        moradia.add("Reutilize água da chuva");
        moradia.add("Instale reguladores de vazão nas torneiras");
        moradia.add("Não utilize mangueiras para as atividades");
        moradia.add("Esvazie a piscina 50% menos vezes");
        moradia.add("Regue seu jardim com regador");
        moradia.add("Não utilize concreto");
        residuo.add("Recicle");
        residuo.add("Utilize produtos reutilizáveis");
        residuo.add("Diminua o uso de produtos descartáveis");
        residuo.add("Consuma apenas o necessário");
        residuo.add("Opte sempre por produtos ecológicos");
        residuo.add("Recicle o óleo de cozinha");
        consumo.add("Reaproveite papel ao máximo antes de reciclar");
        consumo.add("Evite comprar fast-fashion");
        consumo.add("Reduza o consumo de eletrônicos em 30%");
        consumo.add("Compre em segunda mão");
        consumo.add("Desligue os eletrodomésticos da tomada");
        consumo.add("Recicle e doe tudo o que não quer");
        consumo.add("Não utilize poliésteres");
        consumo.add("Opte sempre por produtos ecológicos");
        consumo.add("Consuma produtos orgânicos");
        consumo.add("Não consuma produtos testados em animais");
        consumo.add("Não consuma roupas feitas de partes animais");
        consumo.add("Compre produtos a granel");
        higiene.add("Lave roupa com menos frequência");
        higiene.add("Tome duchas de menos de 10 minutos");
        higiene.add("Adquira uma descarga dupla");
        higiene.add("Utilize produtos de limpeza naturais");
        higiene.add("Adquira uma escova de dente de bambu");
        higiene.add("Tome duchas de 5 minutos");
        higiene.add("Não escove os dentes em água corrente");
        higiene.add("Não utilize desodorante aerosol");
        higiene.add("Utilize cosméticos biodegradáveis");
        sim_ali = findViewById(R.id.sim_ali);
        nao_ali = findViewById(R.id.nao_ali);
        sim_trans = findViewById(R.id.sim_t);
        nao_trans = findViewById(R.id.nao_t);
        sim_mor = findViewById(R.id.sim_m);
        nao_mor = findViewById(R.id.nao_m);
        sim_res = findViewById(R.id.sim_r);
        nao_res = findViewById(R.id.nao_r);
        sim_cons = findViewById(R.id.sim_c);
        nao_cons = findViewById(R.id.nao_c);
        sim_hig = findViewById(R.id.sim_h);
        nao_hig = findViewById(R.id.nao_h);
        concluido = findViewById(R.id.concluido_ali);
        concluido_mor = findViewById(R.id.concluido_m);
        concluido_cons = findViewById(R.id.concluido_c);
        concluido_res = findViewById(R.id.concluido_r);
        concluido_hig = findViewById(R.id.concluido_h);
        concluido_trans = findViewById(R.id.concluido_t);
        meta_cons = findViewById(R.id.meta_consumo);
        meta_res = findViewById(R.id.meta_residuo);
        meta_hig = findViewById(R.id.meta_h);
        meta_alimentacao = findViewById(R.id.meta1);
        meta_moradia = findViewById(R.id.meta_moradia);
        meta_transporte = findViewById(R.id.meta_transporte);
        progressBar_cons = findViewById(R.id.pb_cons);
        progressBar_cons.setMax(11);
        progressBar_cons.setProgress(0);
        progressBar_res = findViewById(R.id.pb_res);
        progressBar_res.setMax(6);
        progressBar_res.setProgress(0);
        progressBar_hig = findViewById(R.id.pb_hig);
        progressBar_hig.setMax(8);
        progressBar_hig.setProgress(0);
        progressBar_ali = findViewById(R.id.pb_ali);
        progressBar_ali.setMax(8);
        progressBar_ali.setProgress(0);
        progressBar_trans = findViewById(R.id.pb_trans);
        progressBar_trans.setMax(6);
        progressBar_trans.setProgress(0);
        progressBar_mor = findViewById(R.id.pb_mor);
        progressBar_mor.setMax(8);
        progressBar_mor.setProgress(0);
        meta_alimentacao.setText(alimentacao.get(0));
        meta_transporte.setText(transporte.get(0));
        meta_moradia.setText(moradia.get(0));
        meta_res.setText(transporte.get(0));
        meta_cons.setText(consumo.get(0));
        meta_hig.setText(higiene.get(0));
        concluido.setVisibility(View.INVISIBLE);
        concluido_hig.setVisibility(View.INVISIBLE);
        concluido_cons.setVisibility(View.INVISIBLE);
        concluido_res.setVisibility(View.INVISIBLE);
        concluido_mor.setVisibility(View.INVISIBLE);
        concluido_trans.setVisibility(View.INVISIBLE);
    }

    public void mexe_ali(View v) {
        if (sim_ali.isClickable() || nao_ali.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_ali.incrementProgressBy(progress_bar_increment);
            contador_ali++;
            if (contador_ali < 8) {
                String a = alimentacao.get(contador_ali);
                meta_alimentacao.setText(a);
            } else {
                meta_alimentacao.setVisibility(View.GONE);
                sim_ali.setVisibility(View.GONE);
                nao_ali.setVisibility(View.GONE);
                concluido.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mexe_trans(View v){
        if (sim_trans.isClickable() || nao_trans.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_trans.incrementProgressBy(progress_bar_increment);
            contador_trans++;
            if (contador_trans < 6) {
                String a = transporte.get(contador_trans);
                meta_transporte.setText(a);
            } else {
                meta_transporte.setVisibility(View.GONE);
                sim_trans.setVisibility(View.GONE);
                nao_trans.setVisibility(View.GONE);
                concluido_trans.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mexe_mor(View v){
        if (sim_mor.isClickable() || nao_mor.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_mor.incrementProgressBy(progress_bar_increment);
            contador_mor++;
            if (contador_mor < 9) {
                String a = moradia.get(contador_mor);
                meta_moradia.setText(a);
            } else {
                meta_moradia.setVisibility(View.GONE);
                sim_mor.setVisibility(View.GONE);
                nao_mor.setVisibility(View.GONE);
                concluido_mor.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mexe_res(View v){
        if (sim_res.isClickable() || nao_res.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_res.incrementProgressBy(progress_bar_increment);
            contador_res++;
            if (contador_res < 6) {
                String a = residuo.get(contador_res);
                meta_res.setText(a);
            } else {
                meta_res.setVisibility(View.GONE);
                sim_res.setVisibility(View.GONE);
                nao_res.setVisibility(View.GONE);
                concluido_res.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mexe_cons(View v) {
        if (sim_cons.isClickable() || nao_cons.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_cons.incrementProgressBy(progress_bar_increment);
            contador_cons++;
            if (contador_cons < 12) {
                String a = consumo.get(contador_cons);
                meta_cons.setText(a);
            } else {
                meta_cons.setVisibility(View.GONE);
                sim_cons.setVisibility(View.GONE);
                nao_cons.setVisibility(View.GONE);
                concluido_cons.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mexe_hig(View v) {
        if (sim_hig.isClickable() || nao_hig.isClickable()) {
            final int progress_bar_increment = 1;
            progressBar_hig.incrementProgressBy(progress_bar_increment);
            contador_hig++;
            if (contador_hig < 8) {
                String a = higiene.get(contador_hig);
                meta_hig.setText(a);
            } else {
                meta_hig.setVisibility(View.GONE);
                meta_hig.setVisibility(View.GONE);
                meta_hig.setVisibility(View.GONE);
                concluido_hig.setVisibility(View.VISIBLE);
            }
        }
    }

    public void perfil(View v) {
        Intent p = new Intent(this, Perfil.class);
        startActivity(p);
    }

    private void contadores() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        Map<String, Object> contagem = new HashMap<>();
        contagem.put("contador_residuos", contador_res);
        contagem.put("contador_alimentacao", contador_ali);
        contagem.put("contador_moradia", contador_mor);
        contagem.put("contador_trans", contador_trans);
        contagem.put("contador_consumo", contador_cons);
        contagem.put("contador_higiene", contador_hig);

        usuarioID = FirebaseAuth.getInstance().getUid();
        DocumentReference documentReference = db.collection("Contadores").document(usuarioID);
        documentReference.set(contagem).addOnSuccessListener(new OnSuccessListener<Void>() {
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
}