package lanchonete;

public class Estoque {
    int cod_prod;
    String cod_filial;

    public Estoque(int cod_prod, String cod_filial) {
        this.cod_prod = cod_prod;
        this.cod_filial = cod_filial;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getCod_filial() {
        return cod_filial;
    }

    public void setCod_filial(String cod_filial) {
        this.cod_filial = cod_filial;
    }
}
