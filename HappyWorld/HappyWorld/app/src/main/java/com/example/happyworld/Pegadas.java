package com.example.happyworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Pegadas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pegadas extends Fragment {
    TextView nova, ola_nome;
    ImageView mundo, eco, hidrica, carbono;
    Button site;
    static String nome_pegadas;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String usuarioID;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Pegadas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pegadas.
     */
    // TODO: Rename and change types and number of parameters
    public static Pegadas newInstance(String param1, String param2) {
        Pegadas fragment = new Pegadas();
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
        View v = inflater.inflate(R.layout.fragment_pegadas, container, false);
        mundo = v.findViewById(R.id.mundo);
        site = v.findViewById(R.id.login_google);
        nova = v.findViewById(R.id.novamente);
        ola_nome = v.findViewById(R.id.ola_nome);
        eco = v.findViewById(R.id.ecologica);
        hidrica = v.findViewById(R.id.hidrica);
        carbono = v.findViewById(R.id.carbono);
        nome_email();
        site.setOnClickListener(view ->
                site());
        mundo.setOnClickListener(view ->
                perfil());
        nova.setOnClickListener(view ->
                perfil());
        ola_nome.setOnClickListener(view ->
                perfil());
        eco.setOnClickListener(view ->
                teste_eco());
        hidrica.setOnClickListener(view ->
                teste_hid());
        carbono.setOnClickListener(view ->
                teste_carb());
        return v;
    }

    public void perfil() {
        Intent m = new Intent(getActivity(), Perfil.class);
        startActivity(m);
    }

    public void teste_eco() {
        Intent te = new Intent(getActivity(), Tela_teste.class);
        startActivity(te);
        Resultado.tipo_pegada = 1;
    }

    public void teste_hid() {
        Intent te = new Intent(getActivity(), Teste_Phidrica1.class);
        startActivity(te);
        Resultado.tipo_pegada = 2;
    }

    public void teste_carb() {
        Intent tc = new Intent(getActivity(), Teste_Carbono1.class);
        startActivity(tc);
        Resultado.tipo_pegada = 3;
    }

    public void site(){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void nome_email() {
        onStart();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("HappyWorld").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    ola_nome.setText("Olá "+documentSnapshot.getString("nome_user")+"→");
                }
            }
        });
    }
}