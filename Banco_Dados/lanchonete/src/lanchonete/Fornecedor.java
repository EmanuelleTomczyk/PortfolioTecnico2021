package lanchonete;

public class Fornecedor {
    String cnpj;
    String nome;
    String email;
    String estado;
    String produto;	

    public Fornecedor(String cnpj, String nome, String email, String estado, String produto) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.produto = produto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
