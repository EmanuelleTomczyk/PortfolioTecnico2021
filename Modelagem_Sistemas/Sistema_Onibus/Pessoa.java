public class Pessoa{
  private String nome;
  private String cpf;
  private String data_nascimento;
  private String endereco;
  private boolean genero;

  public Pessoa(String nome, String cpf, String data_nascimento, String endereco, boolean genero){
    this.nome = nome;
    this.cpf = cpf;
    this.data_nascimento = data_nascimento;
    this.endereco = endereco;
    this.genero = genero;
  }
}