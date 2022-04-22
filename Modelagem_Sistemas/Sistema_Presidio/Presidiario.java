public class Presidiario extends Pessoa{
  private int codigo;
  private String crime;
  private int num_cela;
  private String advogado;
  private int tempo_sentenca;
  private boolean julgamento;
  private boolean fianca;
  private String atividade;

  
  public Presidiario(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco, int codigo, String crime, int num_cela, String advogado){
    super(nome, cpf, data_nascimento, contato, genero, endereco);
    this.codigo = codigo;
    this.crime = crime;
    this.num_cela = num_cela;
    this.advogado = advogado;
}
  public void tatuar(String nome){
  }

  public boolean receber_visita(String nome, String cpf, String contato){
    return true;
  }

  public boolean receber_ligacao(String nome, String cpf, String contato, String endereco){
    return true;
  }

  public boolean fazer_ligacao(String nome, String cpf, int codigo, String endereco){
    return true;
  }

  public void ser_liberado(String nome, String crime){
  }

  public boolean ser_tranferido(int codigo, Pavilhao pavilhao, Funcionario funcionario){
    return true; 
  }

  public void sair_presidio(String nome, String contato, String endereco){
  }

  public boolean comparecer_julgamento(String nome, String crime, String advogado, Funcionario funcionario){
    return true;
  }

  public boolean banho_de_sol(){
    return true;
  }
  
  public boolean recolher(int codigo){
    return true;
  }
  
  public boolean ir_para_solitaria(String crime, int codigo, String nome){
    return true;
  }
  
}