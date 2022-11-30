package com.example.happyworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Resultado extends AppCompatActivity {
    TextView res, pegada_m, sua_pegada;
    static int tipo_pegada;
    String Result;
    ImageView pegada, imagem_planeta;
    String usuarioID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_resultado);
        res = findViewById(R.id.res);
        Pagamento.tela = 2;
        pegada_m = findViewById(R.id.pegada_m);
        pegada = findViewById(R.id.pegada_tipo);
        sua_pegada = findViewById(R.id.sua_pegada);
        imagem_planeta = findViewById(R.id.planeta_res);

        if (tipo_pegada == 1) {
            Salvar_dados_eco();
            pegada.setImageResource(R.drawable.p_eco);
            pegada_m.setText("2.5ha");
            if (Somas.pegada_ecologica <= 200) {
                imagem_planeta.setImageResource(R.drawable.parabens);
                if (Somas.pegada_ecologica == 0) {
                    res.setText("0ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 0ha");
                } else if (Somas.pegada_ecologica <= 40) {
                    res.setText("0.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 0.5ha");
                } else if (Somas.pegada_ecologica <= 80) {
                    res.setText("1ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 1ha");
                } else if (Somas.pegada_ecologica <= 120) {
                    res.setText("1.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 1.5ha");
                } else if (Somas.pegada_ecologica <= 160) {
                    res.setText("2ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 2ha");
                } else if (Somas.pegada_ecologica <= 200) {
                    res.setText("2.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 2.5ha");
                }
            } else if (Somas.pegada_ecologica <= 320) {
                imagem_planeta.setImageResource(R.drawable.quase);
                if (Somas.pegada_ecologica <= 240) {
                    res.setText("3ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 3ha");
                } else if (Somas.pegada_ecologica <= 280) {
                    res.setText("3.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 3.5ha");
                } else if (Somas.pegada_ecologica <= 320) {
                    res.setText("4ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 4ha");
                }
            } else if (Somas.pegada_ecologica <= 480) {
                imagem_planeta.setImageResource(R.drawable.preocupante);
                if (Somas.pegada_ecologica <= 360) {
                    res.setText("4.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 4.5ha");
                } else if (Somas.pegada_ecologica <= 400) {
                    res.setText("5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 5ha");
                } else if (Somas.pegada_ecologica <= 440) {
                    res.setText("5.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 5.5ha");
                } else if (Somas.pegada_ecologica <= 480) {
                    res.setText("6ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 6ha");
                }
            } else if (Somas.pegada_ecologica <= 640) {
                imagem_planeta.setImageResource(R.drawable.horrivel);
                if (Somas.pegada_ecologica <= 520) {
                    res.setText("6.5ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 6.5ha");
                } else if (Somas.pegada_ecologica <= 560) {
                    res.setText("7ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 7ha");
                } else if (Somas.pegada_ecologica <= 600) {
                    res.setText("8ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 8ha");
                } else if (Somas.pegada_ecologica <= 640) {
                    res.setText("6ha");
                    sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 6ha");
                }
            } else if (Somas.pegada_ecologica <= 800) {
                imagem_planeta.setImageResource(R.drawable.alarmante);
                sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: 8.5-10ha");
                res.setText("8.5-10ha");
            } else if (Somas.pegada_ecologica > 800) {
                imagem_planeta.setImageResource(R.drawable.voce_perigo);
                sua_pegada.setText("SUA PEGADA ECOLÓGICA É DE: maior que 10ha");
                res.setText("maior que 10ha");
            }
            Result = res.getText().toString();
        }

        if (tipo_pegada == 2) {
            pegada.setImageResource(R.drawable.pegada_h_drica);
            pegada_m.setText("120l");
            if (Somas.pegada_hidrica <= 750000.0) {
                imagem_planeta.setImageResource(R.drawable.parabens);
                if (Somas.pegada_hidrica <= 5000.0) {
                    res.setText("0l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 0l/dia");
                } else if (Somas.pegada_hidrica <= 400000.0) {
                    res.setText("15l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 15l/dia");
                } else if (Somas.pegada_hidrica <= 500000.0) {
                    res.setText("30l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 30l/dia");
                } else if (Somas.pegada_hidrica <= 550000.0) {
                    res.setText("45l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 45l/dia");
                } else if (Somas.pegada_hidrica <= 600000.0) {
                    res.setText("60l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 60l/dia");
                } else if (Somas.pegada_hidrica <= 650000.0) {
                    res.setText("75l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 75l/dia");
                } else if (Somas.pegada_hidrica <= 700000.0) {
                    res.setText("90l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 90l/dia");
                } else if (Somas.pegada_hidrica <= 730000.0) {
                    res.setText("105l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 105l/dia");
                } else if (Somas.pegada_hidrica <= 750000) {
                    res.setText("120l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 120l/dia");
                }
            }
            if (Somas.pegada_hidrica <= 790000.0) {
                imagem_planeta.setImageResource(R.drawable.quase);
                if (Somas.pegada_hidrica <= 770000.0) {
                    res.setText("135l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 135l/dia");
                } else if (Somas.pegada_hidrica <= 790000.0) {
                    res.setText("150l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 150l/dia");
                }
            }
            if (Somas.pegada_hidrica <= 900000.0) {
                imagem_planeta.setImageResource(R.drawable.preocupante);
                if (Somas.pegada_hidrica <= 850000.0) {
                    res.setText("165l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 165l/dia");
                } else if (Somas.pegada_hidrica <= 900000.0) {
                    res.setText("180l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 180l/dia");
                }
            }
            if (Somas.pegada_hidrica <= 1000000.0) {
                imagem_planeta.setImageResource(R.drawable.horrivel);
                if (Somas.pegada_hidrica <= 950000.0) {
                    res.setText("200l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 200l/dia");
                } else if (Somas.pegada_hidrica <= 1000000.0) {
                    res.setText("250l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 250l/dia");
                }
            }
            if (Somas.pegada_hidrica <= 1500000.0) {
                imagem_planeta.setImageResource(R.drawable.alarmante);
                if (Somas.pegada_hidrica <= 1050000.0) {
                    res.setText("265l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 265l/dia");
                } else if (Somas.pegada_hidrica <= 1100000.0) {
                    res.setText("280l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 280l/dia");
                } else if (Somas.pegada_hidrica <= 1500000.0) {
                    res.setText("295l");
                    sua_pegada.setText("SUA PEGADA HÍDRICA É DE: 295l/dia");
                }
            } if (Somas.pegada_hidrica > 1500000.0) {
                imagem_planeta.setImageResource(R.drawable.voce_perigo);
                res.setText("Maior que 300l");
                sua_pegada.setText("SUA PEGADA HÍDRICA É DE: Maior que 300l/dia");
            }
        }

        if (tipo_pegada == 3){
            pegada.setImageResource(R.drawable.pegada_de_carbono);
            pegada_m.setText("2t");
            if (Somas.pegada_carbono <= 250) {
                imagem_planeta.setImageResource(R.drawable.parabens);
                if (Somas.pegada_carbono == 0) {
                    res.setText("0t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 0t/ano");
                } else if (Somas.pegada_carbono <= 50) {
                    res.setText("0.5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 0.5t/ano");
                } else if (Somas.pegada_carbono <= 90) {
                    res.setText("0.75t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 0.75t/ano");
                } else if (Somas.pegada_carbono <= 140) {
                    res.setText("1t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 1t/ano");
                } else if (Somas.pegada_carbono <= 190) {
                    res.setText("1.5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 1.5t/ano");
                } else if (Somas.pegada_carbono <= 230) {
                    res.setText("1.75t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 1.75t/ano");
                } else if (Somas.pegada_carbono <= 250) {
                    res.setText("2t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2t/ano");
                }
            } else if (Somas.pegada_carbono <= 275) {
                imagem_planeta.setImageResource(R.drawable.quase);
                if (Somas.pegada_carbono <=260) {
                    res.setText("2.2t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.2t/ano");
                } else if (Somas.pegada_carbono <= 275) {
                    res.setText("2.3t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.3t/ano");
                }
            } else if (Somas.pegada_carbono <= 365) {
                imagem_planeta.setImageResource(R.drawable.preocupante);
                if (Somas.pegada_carbono <=290) {
                    res.setText("2.4t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.4t/ano");
                } else if (Somas.pegada_carbono <= 320) {
                    res.setText("2.5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.5t/ano");
                } else if (Somas.pegada_carbono <= 340) {
                    res.setText("2.6t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.6t/ano");
                } else if (Somas.pegada_carbono <= 365) {
                    res.setText("2.7t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.7t/ano");
                }
            } else if (Somas.pegada_carbono <= 540) {
                imagem_planeta.setImageResource(R.drawable.horrivel);
                if (Somas.pegada_carbono <=390) {
                    res.setText("2.8t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 2.8t/ano");
                } else if (Somas.pegada_carbono <= 440) {
                    res.setText("3t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 3t/ano");
                } else if (Somas.pegada_carbono <= 500) {
                    res.setText("3.5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 3.5t/ano");
                } else if (Somas.pegada_carbono <= 540) {
                    res.setText("3.8t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 3.8t/ano");
                }
            } else if (Somas.pegada_ecologica <= 700) {
                if (Somas.pegada_carbono <=581) {
                    res.setText("4t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 4t/ano");
                } else if (Somas.pegada_carbono <= 640) {
                    res.setText("4.5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 4.5t/ano");
                } else if (Somas.pegada_carbono <= 700) {
                    res.setText("5t");
                    sua_pegada.setText("SUA PEGADA DE CARBONO É DE: 5t/ano");
                }
            } else if (Somas.pegada_ecologica > 700) {
                imagem_planeta.setImageResource(R.drawable.voce_perigo);
                res.setText("maior que 5t");
                sua_pegada.setText("SUA PEGADA DE CARBONO É DE: maior que 5t/ano");
            }
        }
    }

    public void info(View v){
        if (tipo_pegada == 1){
            Intent i = new Intent(this, Informacoes.class);
            startActivity(i);
        } if (tipo_pegada == 2){
            Intent ih = new Intent(this, Informacoes_hidrica.class);
            startActivity(ih);
        } if (tipo_pegada == 3){
            Intent ic = new Intent(this, Informacoes_carbono.class);
            startActivity(ic);
        }
    }

    public void pagamento(View v){
        Intent i = new Intent(this, Pagamento.class);
        startActivity(i);
    }

    public void inicio(View v){
        Intent i = new Intent(this, Fragment.class);
        startActivity(i);
    }

    public void metas(View v){
        Intent m = new Intent(this, Metas.class);
        startActivity(m);
    }

    public void Salvar_dados_eco(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String resultado_eco = Result;

        Map<String, Object> pegada_eco = new HashMap<>();
        pegada_eco.put("pegada_eco", resultado_eco);

        usuarioID = FirebaseAuth.getInstance().getUid();
        DocumentReference documentReference = db.collection("Resultado_eco").document(usuarioID);
        documentReference.set(pegada_eco).addOnSuccessListener(new OnSuccessListener<Void>() {
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