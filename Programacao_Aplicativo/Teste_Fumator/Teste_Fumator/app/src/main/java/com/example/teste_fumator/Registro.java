package com.example.teste_fumator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Registro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Registro extends Fragment {
    TextView soma_narg, soma_mac, soma_nic, soma_elet, soma_char, soma_tab, soma_palha;
    TextView sub_narg, sub_mac, sub_nic, sub_elet, sub_char, sub_tab, sub_palha;
    TextView res_nic, res_elec, res_char, res_tab, res_narg, res_mac, res_pal;
    int res_nicotina, res_eletronico, res_charuto, res_tabaco, res_narguile, res_maconha, res_palha;
    static  int minuto_;
    int s = 0;
    static String nicotina_, eletronico_, charuto_, tabaco_, narguile_, maconha_, palha_;
    int notificacao = res_nicotina + res_eletronico + res_charuto + res_tabaco + res_narguile + res_maconha + res_palha;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    ArrayList<Integer> dias_p = new ArrayList<Integer> ();
    int dias, total;
    String usuarioID;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Registro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Registro.
     */
    // TODO: Rename and change types and number of parameters
    public static Registro newInstance(String param1, String param2) {
        Registro fragment = new Registro();
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
        View v = inflater.inflate(R.layout.fragment_registro, container, false);
        res_nic = v.findViewById(R.id.res_nic);
        res_elec = v.findViewById(R.id.res_elet);
        res_char = v.findViewById(R.id.res_char);
        res_tab = v.findViewById(R.id.res_tab);
        res_narg = v.findViewById(R.id.res_narg);
        res_mac = v.findViewById(R.id.res_mac);
        res_pal = v.findViewById(R.id.res_palha);
        soma_nic = v.findViewById(R.id.soma_nic);
        soma_elet = v.findViewById(R.id.soma_elet);
        soma_char = v.findViewById(R.id.soma_char);
        soma_tab = v.findViewById(R.id.soma_tab);
        soma_narg = v.findViewById(R.id.soma_narg);
        soma_mac = v.findViewById(R.id.soma_mac);
        soma_palha = v.findViewById(R.id.soma_palha);
        sub_nic = v.findViewById(R.id.sub_nic);
        sub_elet= v.findViewById(R.id.sub_elet);
        sub_char = v.findViewById(R.id.sub_char);
        sub_tab = v.findViewById(R.id.sub_tab);
        sub_narg = v.findViewById(R.id.sub_narg);
        sub_mac = v.findViewById(R.id.sub_mac);
        sub_palha = v.findViewById(R.id.sub_palha);
        soma_nic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (nicotina_ == ""){
                    print_inf("Você não possue informações sobre o uso de cigarro de nicotina");
                }
                else {
                    if (nicotina_ != null){
                        contar_nic();
                        int nic = Integer.parseInt(nicotina_ + "");
                    }
                }
            }
        });
        sub_nic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_nic();
            }
        });
        soma_elet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (eletronico_ == ""){
                    print_inf("Você não possue informações sobre o uso de cigarro elétrico");
                }
                else {
                    if (eletronico_ != null){
                        contar_elec();
                    }
                }
            }
        });
        sub_elet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_elet();
            }
        });
        soma_char.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (charuto_ == "") {
                    print_inf("Você não possue informações sobre o uso de charuto");
                }
                else {
                    if (charuto_ != null){
                        conta_charuto();
                    }
                }
            }
        });
        sub_char.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_charuto();
            }
        });
        soma_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (tabaco_ == ""){
                    print_inf("Você não possue informações sobre o uso de tabaco");
                }
                else {
                    if (tabaco_ != null){
                        conta_tabaco();
                    }
                }
            }
        });
        sub_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_tabaco();
            }
        });
        soma_narg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (narguile_ == ""){
                    print_inf("Você não possue informações sobre o uso de narguile");
                }
                else {
                    if (narguile_ != null){
                        conta_narguile();
                    }
                }
            }
        });
        sub_narg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_narguile();
            }
        });
        soma_mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (maconha_ == ""){
                    print_inf("Você não possue informações sobre o uso de maconha");
                }
                else {
                    if (maconha_ != null){
                        conta_maconha();
                    }
                }
            }
        });
        sub_mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_maconha();
            }
        });
        soma_palha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                exibe_informacoes();
                if (palha_ == ""){
                    print_inf("Você não possue informações sobre o uso de cigarro de palha");
                }
                else {
                    if (palha_ != null){
                        conta_palha();
                    }
                }
            }
        });
        sub_palha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantidade();
                subtrair_palha();
            }
        });
        exibe();
        novoDia();
        return v;
    }

    public void exibe_informacoes() {
        onStart();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("Informacoes").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    nicotina_ = documentSnapshot.getString("nicotina");
                    eletronico_ = documentSnapshot.getString("eletronico");
                    charuto_ = documentSnapshot.getString("charuto");
                    tabaco_ = documentSnapshot.getString("tabaco");
                    narguile_ = documentSnapshot.getString("narguile");
                    maconha_ = documentSnapshot.getString("maconha");
                    palha_ = documentSnapshot.getString("palha");
                }
            }
        });
    }

    private void Quantidade() {
        int minuto_ = LocalDateTime.now().getMinute();
        int dias = LocalDateTime.now().getDayOfYear();
        total = res_nicotina + res_eletronico + res_charuto + res_tabaco + res_narguile + res_maconha + res_palha;
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        Map<String, Object> quantidades = new HashMap<>();
        quantidades.put("nicotina_qtd", res_nicotina);
        quantidades.put("dias", dias);
        quantidades.put("minuto", minuto_);
        quantidades.put("total", total);
        quantidades.put("eletronico_qtd", res_eletronico);
        quantidades.put("charuto_qtd", res_charuto);
        quantidades.put("tabaco_qtd", res_tabaco);
        quantidades.put("narguile_qtd", res_narguile);
        quantidades.put("maconha_qtd", res_maconha);
        quantidades.put("palha_qtd", res_palha);

        usuarioID = FirebaseAuth.getInstance().getUid();
        DocumentReference documentReference = db.collection("Dados").document(usuarioID);
        documentReference.set(quantidades).addOnSuccessListener(new OnSuccessListener<Void>() {
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

    public void exibe() {
        onStart();
        Quantidade();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("Dados").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    minuto_ = Math.toIntExact((Long) documentSnapshot.getData().get("minuto"));
                    res_nicotina = Math.toIntExact((Long) documentSnapshot.getData().get("nicotina_qtd"));
                    res_eletronico = Math.toIntExact((Long) documentSnapshot.getData().get("eletronico_qtd"));
                    res_charuto = Math.toIntExact((Long) documentSnapshot.getData().get("charuto_qtd"));
                    res_tabaco = Math.toIntExact((Long) documentSnapshot.getData().get("tabaco_qtd"));
                    res_narguile = Math.toIntExact((Long) documentSnapshot.getData().get("narguile_qtd"));
                    res_maconha = Math.toIntExact((Long) documentSnapshot.getData().get("maconha_qtd"));
                    res_palha = Math.toIntExact((Long) documentSnapshot.getData().get("palha_qtd"));
                    notificacoes();
                    res_nic.setText((res_nicotina) + "");
                    res_elec.setText((res_eletronico) + "");
                    res_char.setText((res_charuto) + "");
                    res_narg.setText((res_narguile) + "");
                    res_mac.setText((res_maconha) + "");
                    res_pal.setText((res_palha) + "");
                }
            }
        });
    }

    public void print(){
        Toast.makeText(this.getActivity(), "Você não pode fumar menos que 0 cigarros", Toast.LENGTH_SHORT).show();
    }

    public void print_inf(String n){
        Toast.makeText(this.getActivity(), n, Toast.LENGTH_SHORT).show();
    }

    public void contar_nic() {
        s = 1;
        Perfil.s = s;
        res_nic.setText((res_nicotina++) + "");
        int nic = Integer.parseInt(nicotina_+"");
        if (res_nicotina <= 1){
            Perfil.rnic = nic*1-nic;
        }
        if (res_nicotina >= 2){
            Perfil.rnic = nic*res_nicotina-nic;
            Toast.makeText(getActivity(), Perfil.rnic +"", Toast.LENGTH_SHORT);
        }
    }

    public void subtrair_nic() {
        if (res_nicotina <= 0){
            print();
        }
        else {
            res_nic.setText((res_nicotina--) + "");
        }
    }

    public void contar_elec() {
        s = 1;
        Perfil.s = s;
        res_elec.setText((res_eletronico++) + "");
        int ele = Integer.parseInt(eletronico_+"");
        if (res_eletronico <= 1){
            Perfil.relet = ele*1-ele;
        }
        if (res_eletronico >= 2){
            Perfil.relet = ele*res_eletronico-ele;
        }
    }

    public void subtrair_elet() {
        if (res_eletronico <= 0){
            print();
        }
        else {
            res_elec.setText((res_eletronico--) + "");
        }
    }

    public void conta_charuto() {
        exibe_informacoes();
        s = 1;
        Perfil.s = s;
        res_char.setText((res_charuto++) + "");
        int charu = Integer.parseInt(charuto_+"");
        if (res_charuto <= 1){
            Perfil.rchar = charu*1-charu;
        }
        if (res_charuto >= 2){
            Perfil.rchar = charu*res_charuto-charu;
        }
    }

    public void subtrair_charuto() {
        if (res_charuto <= 0){
            print();
        }
        else {
            res_char.setText((res_charuto--) + "");
        }
    }

    public void conta_tabaco() {
        s = 1;
        Perfil.s = s;
        res_tab.setText((res_tabaco++) + "");
        int tab = Integer.parseInt(tabaco_+"");
        if (res_tabaco <= 1){
            Perfil.rtab = tab*1-tab;
        }
        if (res_tabaco >= 2){
            Perfil.rtab = tab*res_charuto-tab;
        }
    }

    public void subtrair_tabaco() {
        if (res_tabaco <= 0){
            print();
        }
        else {
            res_tab.setText((res_tabaco--) + "");
        }
    }

    public void conta_narguile() {
        s = 1;
        Perfil.s = s;
        res_narg.setText((res_narguile++) + "");
        int nar = Integer.parseInt(narguile_+"");
        if (res_narguile <= 1){
            Perfil.rnarg = nar*1-nar;
        }
        if (res_narguile >= 2){
            Perfil.rnarg = nar*res_narguile-nar;
        }
    }

    public void subtrair_narguile() {
        if (res_narguile <= 0){
            print();
        }
        else {
            res_narg.setText((res_narguile--) + "");
        }
    }

    public void conta_maconha() {
        s = 1;
        Perfil.s = s;
        res_mac.setText((res_maconha++) + "");
        int mac = Integer.parseInt(maconha_+"");
        if (res_maconha <= 1){
            Perfil.rmac = mac*1-mac;
        }
        if (res_maconha >= 2){
            Perfil.rmac = mac*res_maconha-mac;
        }
    }

    public void subtrair_maconha() {
        if (res_maconha <= 0){
            print();
        }
        else {
            res_mac.setText((res_maconha--) + "");
        }
    }

    public void conta_palha() {
        s = 1;
        Perfil.s = s;
        res_pal.setText((res_palha++) + "");
        int pal = Integer.parseInt(palha_+"");
        if (res_palha <= 1){
            Perfil.rpal = pal*1-pal;
        }
        if (res_palha >= 2){
            Perfil.rpal = pal*res_palha-pal;
        }
    }

    public void subtrair_palha() {
        if (res_palha <= 0){
            print();
        }
        else {
            res_pal.setText((res_palha--) + "");
        }
    }

    public void notificacoes(){
        notificacao = res_nicotina + res_eletronico + res_charuto + res_tabaco + res_narguile + res_maconha + res_palha;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Aviso");
        builder.setMessage((notificacao)+"");
        if (notificacao == 1){
            builder.setMessage("Com o uso de um único cigarro você corre maior risco de desenvolver uma doença coronariana e sofrer um acidente vascular cerebral.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if (notificacao == 10){
            builder.setMessage("Você tem 87% mais riscos de morte prematura que os não fumantes.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if(notificacao == 12){
            builder.setMessage("Você tem 6 vezes mais chances de morrer por doenças respiratórias e 1,5 vezes mais de ter doenças cardiovasculares.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if(notificacao == 18){
            builder.setMessage("Você ultrapassou a média de cigarros consumidos por dia pela população brasileira.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if(notificacao == 20){
            builder.setMessage("O cigarro mata 5 milhões de pessoas por ano. Esse valor é maior que os acidentes de trânsito, o HIV e o suicído juntos.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if(notificacao == 30){
            builder.setMessage("Não esqueça, seu hábito prejudica todos a seu redor.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
        else if(notificacao == 40){
            builder.setMessage("Você poderia comprar uma casa de R$100 mil em 20 anos caso parasse de fumar.");
            AlertDialog alerta = builder.create();
            alerta.show();
        }
    }

    public boolean novoDia() {
        dias = LocalDateTime.now().getDayOfYear();
        if (dias != LocalDateTime.now().getDayOfYear()){
            int gd = dias;
            int gqnic = res_nicotina;
            int gqele = res_eletronico;
            int gqtab = res_tabaco;
            int gqchar = res_charuto;
            int gqmac = res_maconha;
            int gqpal = res_palha;
            int gqnar = res_narguile;
            dias_p.add(gd);
            dias_p.add(gqnic);
            dias_p.add(gqele);
            dias_p.add(gqtab);
            dias_p.add(gqchar);
            dias_p.add(gqmac);
            dias_p.add(gqpal);
            dias_p.add(gqnar);
            res_nicotina = 0;
            res_eletronico = 0;
            res_charuto = 0;
            res_tabaco = 0;
            res_narguile = 0;
            res_maconha = 0;
            res_palha = 0;
            return false;
        }
            return true;
    }
}