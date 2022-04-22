public class Motorista extends Funcionario{
  private String cnh_d; 
  private String linha; 
  private String empresa;

  public Motorista(String nome, String cpf, String data_nascimento, String endereco, boolean genero, int id, String cargo, int carga_horaria, String pis, float salario, float vale_transporte, float vale_alimentacao, String cnh_d, String linha, String empresa){
    super(nome, cpf, data_nascimento, endereco, genero, id, cargo, carga_horaria, pis, salario, vale_transporte, vale_alimentacao);
    this.cnh_d = cnh_d;
    this.linha = linha;
    this.empresa = empresa;
  }

  public boolean dirigir(String cnh_d, String linha){
    return true;
  }

  public boolean auxiliar_passageiro(Passageiro passageiro, Rota rota){
    return true;
  }

  public void mudar_linha(String linha, String empresa){
  }

  public boolean cobrar(String linha, String empresa){
    return true;
  }
}