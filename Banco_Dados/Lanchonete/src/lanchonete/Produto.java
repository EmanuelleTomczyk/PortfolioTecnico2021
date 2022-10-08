package lanchonete;

public class Produto {
    String cod_fornecedor;
    int codigo_produto;
    String data_compra;
    int qtd;
    String marca;
    double preco;
    String validade;
    String descricao;

    public Produto(int codigo_produto, String validade, int qtd, String data_compra, String cod_fornecedor, String marca, double preco, String descricao) {
        this.codigo_produto = codigo_produto;
        this.validade = validade;
        this.qtd = qtd;
        this.data_compra = data_compra;
        this.cod_fornecedor = cod_fornecedor;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(String cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
