public class Funcionario extends Pessoa{
  private int id;
  private String cargo; 
  private int carga_horaria;
  private String pis;
  private float salario;
  private float vale_transporte;
  private float vale_alimentacao;

  public Funcionario(String nome, String cpf, String data_nascimento, String endereco, boolean genero, int id, String cargo, int carga_horaria, String pis, float salario, float vale_transporte, float vale_alimentacao){
    super(nome, cpf, data_nascimento, endereco, genero);
    this.id = id; 
    this.cargo = cargo;
    this.carga_horaria = carga_horaria;
    this.pis = pis;
    this.salario = salario;
    this.vale_transporte = vale_transporte;
    this.vale_alimentacao = vale_alimentacao;
  }

  public boolean receber_salario(){
    return true;
  }

  public void trabalhar(){
  }

  public boolean ter_ferias(String pis){
    return true;
  }
}


