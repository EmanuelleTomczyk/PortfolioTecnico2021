public class Cobrador extends Funcionario{

  public Cobrador(String nome, String cpf, String data_nascimento, String endereco, boolean genero, int id, String cargo, int carga_horaria, String pis, float salario, float vale_transporte, float vale_alimentacao){
    super(nome, cpf, data_nascimento, endereco, genero, id, cargo, carga_horaria, pis, salario, vale_transporte, vale_alimentacao);
  }

  public void cobrar(Passageiro passageiro, Rota rota){
  }

  public void dar_troco(Passageiro passageiro){
  }

  public boolean auxiliar_passageiro(Passageiro passageiro, Rota rota){
    return true;
  }
}