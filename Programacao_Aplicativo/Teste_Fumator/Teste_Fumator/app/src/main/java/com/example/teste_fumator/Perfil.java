package com.example.teste_fumator;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.time.LocalDateTime;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Perfil extends Fragment {
    Button maleficios, informacoes;
    Registro registro;
    static TextView nome, email, tvdias, dinheiro;
    static int s;
    static int rchar, rnic, relet, rmac, rtab, rpal, rnarg;
    int res = 0;
    ImageView sair;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String usuarioID;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Object Intent;

    public Perfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Perfil.
     */
    // TODO: Rename and change types and number of parameters
    public static Perfil newInstance(String param1, String param2) {
        Perfil fragment = new Perfil();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        maleficios = v.findViewById(R.id.bmaleficios);
        tvdias = v.findViewById(R.id.tvdias);
        dinheiro = v.findViewById(R.id.dinheiro);
        nome_email();
        informacoes = v.findViewById(R.id.b_atualizar);
        informacoes.setOnClickListener(view ->
                mudar_info());
        maleficios.setOnClickListener(view ->
                mudar_mal());
        nome = v.findViewById(R.id.nome);
        email = v.findViewById(R.id.email);
        sair = v.findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent sair = new Intent(getActivity(), MainActivity.class);
                startActivity(sair);
            }
        });
        contaDias();
        gastos();
        return v;
    }

    public void nome_email() {
        onStart();
        String email_ = FirebaseAuth.getInstance().getCurrentUser().getEmail();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("Usuarios").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    nome.setText(documentSnapshot.getString("nome"));
                    email.setText(email_);
                }
            }
        });
    }

    public void mudar_mal() {
        Intent m = new Intent(getActivity(), Maleficios.class);
        startActivity(m);
    }

    public void mudar_info() {
        Intent i = new Intent(getActivity(), Informacoes.class);
        startActivity(i);
    }

    public void print(String n){
        Toast.makeText(getActivity(), n, Toast.LENGTH_SHORT);
    }

    public void contaDias() {
        print(Registro.minuto_+"");
        int da = LocalDateTime.now().getMinute();
        Toast.makeText(getActivity(), (res)+"", Toast.LENGTH_SHORT);
        String resp = Integer.toString(res);
        if (res > 0) {
            res = (da - Registro.minuto_);
            tvdias.setText(resp + "min");
        } else if (s == 1 || res <= 0) {
            res = (Registro.minuto_ - da);
            tvdias.setText(resp + "min");
        }
    }

    public void gastos() {
        int total = relet + rpal + rmac + rnarg + rnic + rtab + rchar;
        try {
            if (total == 0) {
                Perfil.dinheiro.setText("R$" + (0 + ""));
                print("==0");
            } else if (total > 0){
                Perfil.dinheiro.setText("R$" + (total + ""));
                print(">0");
            }
        } catch (Exception e) {
            Perfil.dinheiro.setText("R$" + (0 + ""));
            print("oi");
        }
    }
}