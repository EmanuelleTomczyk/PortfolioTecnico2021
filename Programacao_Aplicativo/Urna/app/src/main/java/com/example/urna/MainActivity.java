package com.example.urna;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.security.cert.PolicyNode;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText cpf, num_candidato;
    ArrayList<Candidato> lista_candidato = new ArrayList<>();
    TextView nome_candidato, cargo, cargo_topo;
    ImageView foto;
    Button confirma, verifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        cpf = findViewById(R.id.cpf_ele);
        num_candidato = findViewById(R.id.num_candidato);
        nome_candidato = findViewById(R.id.nome);
        cargo = findViewById(R.id.cargo);
        cargo_topo = findViewById(R.id.cargo_topo);
        foto = findViewById(R.id.foto);
        confirma = findViewById(R.id.confirma);
        verifica = findViewById(R.id.bt_verifica);
        verifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifica();
            }
        });
        cria_candidatos();
        nome_candidato.setVisibility(View.INVISIBLE);
        cargo.setVisibility(View.INVISIBLE);
        foto.setVisibility(View.INVISIBLE);
    }

    public void cria_candidatos() {
        Candidato batata = new Candidato("Batata", "Presidente", "27", 0);
        Candidato milkshake = new Candidato("Milk Shake", "Presidente", "70", 0);
        Candidato cupcake = new Candidato("CupCake", "Presidente", "88", 0);
        Candidato refri = new Candidato("Refri", "Presidente", "15", 0);
        Candidato hotdog = new Candidato("Hot Dog", "Presidente", "19", 0);
        Candidato nulo = new Candidato("Nulo", "Presidente", "===", 0);
        lista_candidato.add(batata);
        lista_candidato.add(milkshake);
        lista_candidato.add(cupcake);
        lista_candidato.add(refri);
        lista_candidato.add(hotdog);
        lista_candidato.add(nulo);
        cpf.getText().toString();
    }

    public void verifica() {
        if (cpf.equals(null) || num_candidato.equals(null)) {
            Toast.makeText(this, "Preencha os dados", Toast.LENGTH_LONG).show();
        }
        String numero_ = num_candidato.getText() + "";
        foto.setVisibility(View.VISIBLE);
        nome_candidato.setVisibility(View.VISIBLE);
        cargo.setVisibility(View.VISIBLE);
        for (Candidato c : lista_candidato) {
            if (numero_.equals(c.numero)) {
                nome_candidato.setText(c.getNome());
                cargo.setText(c.getCargo());
                if (numero_.equals("27")) {
                    foto.setImageResource(R.drawable.__batatinha);
                } else if (numero_.equals("70")) {
                    foto.setImageResource(R.drawable.__milkshake);
                } else if (numero_.equals("88")) {
                    foto.setImageResource(R.drawable.__cupcake_);
                } else if (numero_.equals("15")) {
                    foto.setImageResource(R.drawable.__refri);
                } else if (numero_.equals("19")) {
                    foto.setImageResource(R.drawable.__hotdog);
                }
                break;
            } else {
                nome_candidato.setText("Nulo");
                cargo.setText("Presidente");
                foto.setImageResource(R.drawable.nuloo);
            }
        }
    }

    public void candidato() {
        for (Candidato c : lista_candidato) {
            String num = num_candidato.getText().toString();
            String nome_cdt = c.getNome();
            String cargo_cdt = c.getCargo();
            String numero_cdt = c.getNumero();
            int votos_cdt = c.getQuantidade_votos();
            votos_cdt = votos_cdt + 1;

            if (num.equals(c.numero)) {
                Candidato cdt = new Candidato(nome_cdt, cargo_cdt, numero_cdt, votos_cdt);
                c.quantidade_votos++;
                cdt.salvar_candidato();
                nome_candidato.setVisibility(View.VISIBLE);
                cargo.setVisibility(View.VISIBLE);
                nome_candidato.setText(c.getNome());
                cargo.setText(c.getCargo());
                foto.setVisibility(View.VISIBLE);
            }
        }
    }

    public void cpf_eleitor() {
        if (cpf.getText().toString().equals("")) {
        } else {
            String cpf_elt = cpf.getText().toString();
            Eleitor elt = new Eleitor(cpf_elt);
            elt.salvar_cpf();
        }
    }

    public void print(String n) {
        Toast.makeText(this, n, Toast.LENGTH_SHORT).show();
    }

    public void votar(View v) {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Eleitor");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String cpf_elt = cpf.getText().toString();
                boolean teste = false;
                cpf_eleitor();

                for (DataSnapshot eleitor : snapshot.getChildren()) {
                    if (eleitor.getValue(Eleitor.class).getCpf().equals(cpf_elt)) {
                        teste = true;
                    }
                }
                if (teste == false) {
                    if (cpf_elt.equals("") || num_candidato.equals("")) {
                        print("Preencha os dados corretamente");
                    } else if (teste == false) {
                        candidato();
                        verifica();
                    }
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    public void ver_candidatos(View view){
        Intent vc = new Intent(this, Nossos_candidatos.class);
        startActivity(vc);
    }
}