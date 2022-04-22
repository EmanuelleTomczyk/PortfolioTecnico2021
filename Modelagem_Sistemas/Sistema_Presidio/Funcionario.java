public class Funcionario extends Pessoa{
  private String cargo;
  private int carga_horaria;
  private boolean bateu_ponto;
  private String pis;
  private float salario;
  private float vale_transporte;
  private float vale_alimentacao;

  public Funcionario(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco, String cargo, int carga_horaria, boolean bateu_ponto, String pis, float salario, float vale_transporte, float vale_alimentação){
    super(nome, cpf, data_nascimento, contato, genero, endereco);
    this.cargo = cargo;
    this.carga_horaria = carga_horaria;
    this.bateu_ponto = bateu_ponto;
    this.pis = pis;
    this.salario = salario;
    this.vale_transporte = vale_transporte;
    this.vale_alimentacao = vale_alimentacao;
  }

  public boolean bater_ponto(){
    return true;
  }

  public boolean aumentar_salario(float salario, String nome){
    return true;
  }

  public boolean aumentar_salario(float salario, String nome, int carga_horaria){
    return true;
  }

  public boolean receber_salario(){
    return true;
  }
  
  public boolean recarregar_vale(String pis){
    return true;
  }

  public boolean ter_ferias(String pis){
    return true;
  }

  public void trabalhar(){
  }

  public int fazer_hora_extra(){
    return carga_horaria;
  }

  public boolean ser_transferido(Pavilhao pavilhao){
    return true;
  }

  public void ser_demitido(String nome, String pis, String cargo){
  }

  public void pedir_demissao(String nome, String pis, String cargo){
  }
}