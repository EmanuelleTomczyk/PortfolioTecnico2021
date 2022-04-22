public class Passageiro extends Pessoa{
  private Carteirinha carteirinha; 
  private String destino;

  public Passageiro(String nome, String cpf, String data_nascimento, String endereco, boolean genero, Carteirinha carteirinha, String destino){
    super(nome, cpf, data_nascimento, endereco, genero);
    this.carteirinha = carteirinha;
    this.destino = destino;
  }

  public Passageiro(String nome, String cpf, String data_nascimento, String endereco, boolean genero, String destino){
    super(nome, cpf, data_nascimento, endereco, genero);
    this.destino = destino;
  }

  public boolean regarregar_carteirinha(Carteirinha carteirinha){
    return true;
  }

  public boolean pegar_onibus(Carteirinha carteirinha, Onibus onibus, Rota rota){
    return true;
  }

  public boolean pegar_onibus(Onibus onibus, Rota rota){
    return true;
  }
}