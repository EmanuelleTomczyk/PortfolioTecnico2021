import java.util.ArrayList;

public class Presidio{
  private String nome;
  private String local;
  private ArrayList<Pavilhao> pavilhao; 
  private String contato;
  private ArrayList<Pessoa> pessoas;
  private ArrayList<String> estoque;
  private float despesa;
  private float orcamento;
  private ArrayList<String> transporte; 
  private int lotacao; 
  private ArrayList<String> sistema_seguranca;

  public Presidio(String nome, String local, String contato, float despesa, float orcamento, int lotacao){
    this.nome = nome; 
    this.local = local;
    this.contato = contato; 
    this.despesa = despesa;
    this.orcamento = orcamento; 
    this.lotacao = lotacao;
  }
}