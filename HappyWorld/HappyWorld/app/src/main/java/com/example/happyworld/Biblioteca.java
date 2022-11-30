package com.example.happyworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Biblioteca#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Biblioteca extends Fragment {
    ImageView alimentacao, sobre, impactos, pegadas, perfil;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Biblioteca() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Biblioteca.
     */
    // TODO: Rename and change types and number of parameters
    public static Biblioteca newInstance(String param1, String param2) {
        Biblioteca fragment = new Biblioteca();
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
        View v = inflater.inflate(R.layout.fragment_biblioteca, container, false);
        pegadas = v.findViewById(R.id.pegadas);
        sobre = v.findViewById(R.id.sobre);
        alimentacao = v.findViewById(R.id.sustentavel);
        impactos = v.findViewById(R.id.impactos);
        perfil = v.findViewById(R.id.perfil);
        pegadas.setOnClickListener(view ->
                pegada());
        alimentacao.setOnClickListener(view ->
                alimentacao());
        impactos.setOnClickListener(view ->
                impactos());
        sobre.setOnClickListener(view ->
                sobre());
        perfil.setOnClickListener(view ->
                perfil());
        return v;
    }

    public void sobre(){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/sobre-mim/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void impactos(){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/impactos/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void alimentacao(){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/alimentacao-sustentavel/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void pegada(){
        Uri webpage = Uri.parse("https://happyworld-biblio-com.webnode.page/pegadas/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void perfil(){
        Intent perfil = new Intent(getActivity(), Perfil.class);
        startActivity(perfil);
    }
}