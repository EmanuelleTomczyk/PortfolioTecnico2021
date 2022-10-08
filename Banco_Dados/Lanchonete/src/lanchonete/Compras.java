package lanchonete;

public class Compras {
    String cpf_cliente;
    String data_compra;
    double total;
    String cod_func;

    public Compras(String cpf_cliente, String data_compra, double total, String cod_func) {
        this.cpf_cliente = cpf_cliente;
        this.data_compra = data_compra;
        this.total = total;
        this.cod_func = cod_func;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCod_func() {
        return cod_func;
    }

    public void setCod_func(String cod_func) {
        this.cod_func = cod_func;
    }
}
