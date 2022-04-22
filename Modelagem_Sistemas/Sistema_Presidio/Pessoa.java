public class Pessoa{
  private String nome;
  private String cpf; 
  private String data_nascimento;
  private String contato;
  private String genero;
  private String endereco;

  public Pessoa(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco){
    this.nome = nome;
    this.cpf = cpf;
    this.data_nascimento = data_nascimento;
    this.contato = contato;
    this.genero = genero; 
    this.endereco = endereco;
  }
  
  public void registrar(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco){
  }

  public boolean verificar_presenca(String nome, String cpf){
    return true; 
  }
}