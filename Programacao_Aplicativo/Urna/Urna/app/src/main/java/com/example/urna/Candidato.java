package com.example.urna;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Candidato {
    String nome, cargo, numero;
    int quantidade_votos=0;

    public Candidato() {
    }

    public Candidato(String nome, String cargo, String numero, int quantidade_votos) {
        this.nome = nome;
        this.cargo = cargo;
        this.numero = numero;
        this.quantidade_votos = quantidade_votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQuantidade_votos() {
        return quantidade_votos;
    }

    public void setQuantidade_votos(int quantidade_votos) {
        this.quantidade_votos = quantidade_votos;
    }

    public void salvar_candidato(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Canditados").child(nome).setValue(this);
    }
}