package com.example.urna;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Eleitor {
    String cpf;

    public Eleitor() {
    }

    public Eleitor(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void salvar_cpf(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Eleitor").child(cpf).setValue(this);
    }
}
