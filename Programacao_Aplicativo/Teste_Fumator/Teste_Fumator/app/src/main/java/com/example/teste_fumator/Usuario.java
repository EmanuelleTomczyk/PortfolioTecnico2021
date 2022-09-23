package com.example.teste_fumator;

public class Usuario {
    int dia;
    int hora;
    int qtd;

    public Usuario(int dia, int hora, int qtd) {
        this.dia = dia;
        this.hora = hora;
        this.qtd = qtd;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
