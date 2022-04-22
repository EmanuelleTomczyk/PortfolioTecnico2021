public class AgentePenal extends Funcionario{
  
  public AgentePenal(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco, String cargo, int carga_horaria, boolean bateu_ponto, String pis, float salario, float vale_transporte, float vale_alimentacao){
    super(nome, cpf, data_nascimento, contato, genero, endereco, cargo, carga_horaria, bateu_ponto, pis, salario, vale_transporte, vale_alimentacao);
  }

  public boolean vigiar(Pavilhao pavilhao){
    return true;
  }
  
  public boolean acompanharPresidiario(Presidiario presidiario){
    return true;
  }

  public boolean tranferir_presidiario(Presidiario presidiario){
    return true;
  }

  public void advertir(Presidiario presidiario, String nome){
  }

  public void advertir(Visitantes visitantes, String nome){ 
  }

  public void advertir(Presidiario presidiario, Visitantes visitantes, String nome){
  }

  public boolean conferir(Presidiario presidiario){
    return true;
  }

  public boolean conferir(Pavilhao pavilhao){
    return true; 
  }

  public boolean revistar(Presidiario presidiario){
    return true;
  }

  public boolean revistar(Visitantes visitantes){
    return true;
  }
}