package lanchonete;

public class Funcionario_lanchonete {
    String pis;
    String nome;
    double salario;
    String cargo;
    int carga_horaria;
    String cod_filial;

    public Funcionario_lanchonete(String pis, String nome, double salario, String cargo, int carga_horaria, String cod_filial) {
        this.pis = pis;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.carga_horaria = carga_horaria;
        this.cod_filial = cod_filial;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getCod_filial() {
        return cod_filial;
    }

    public void setCod_filial(String cod_filial) {
        this.cod_filial = cod_filial;
    }
}