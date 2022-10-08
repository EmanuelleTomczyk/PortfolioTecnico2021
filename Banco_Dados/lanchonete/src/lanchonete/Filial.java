package lanchonete;

public class Filial {
    String cod;
    String nome;
    String cidade;
    String estado;

    public Filial(String cod, String nome, String cidade, String estado) {
        this.cod = cod;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}