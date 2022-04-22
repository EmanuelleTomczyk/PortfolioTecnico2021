import java.util.ArrayList;

public class Pavilhao extends Presidio{
  private int cela;
  private int refeitorio; 
  private int banheiro;
  private int solitaria; 
  private ArrayList<Presidiario> presidiario;
  private ArrayList<Funcionario> funcionario; 
  private int id;
  private String tipo; 
  private int patio;
  private int biblioteca;
  private int lavanderia;
  private int sala_de_aula; 
  private ArrayList<String> sala_tecnico;
  private int capela;
  private ArrayList<String> sala_visita;
  private boolean loja_conveniencia;

  public Pavilhao(String nome, String local, String contato, float despesa, float orcamento, int lotacao, int cela, int refeitorio, int banheiro, int solitaia, int id, String tipo, int patio, int biblioteca, int lavanderia, int sala_de_aula, int capela, boolean loja_conveniencia){
    super(nome, local, contato, despesa, orcamento, lotacao);
    this.cela = cela;
    this.refeitorio = refeitorio; 
    this.banheiro = banheiro; 
    this.solitaria = solitaria;
    this.id = id;
    this.tipo = tipo;
    this.patio = patio;
    this.biblioteca = biblioteca;
    this.lavanderia = lavanderia; 
    this.sala_de_aula = sala_de_aula;
    this.capela = capela;
    this.loja_conveniencia = loja_conveniencia;
  }
}