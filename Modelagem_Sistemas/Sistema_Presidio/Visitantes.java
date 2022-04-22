import java.util.ArrayList;

public class Visitantes extends Pessoa{
  private String data_visita;
  private int hora_visita;
  private int min_visita;
  private int hora_saida;
  private int min_saida;
  private ArrayList<String> pertences;
  private String tipo_visita;
  private ArrayList<String> presente;
  private String relacao;

  public Visitantes(String nome, String cpf, String data_nascimento, String contato, String genero, String endereco, String data_visita, int hora_visita, int min_visita, int hora_saida, int min_saida, String tipo_visita, String relacao){
    super(nome, cpf, data_nascimento, contato, genero, endereco);
    this.data_visita = data_visita;
    this.hora_visita = hora_visita;
    this.min_visita = min_visita;
    this.hora_saida = hora_saida;
    this.min_saida = min_saida;
    this.tipo_visita = tipo_visita;
    this.relacao = relacao; 
  }
  
  public String revistar(String pertences, String presente){
    return pertences;
  }
  
  public boolean agendar_visita(String nome, String cpf, String contato, String data_visita, int hora_visita, int hora_saida, String tipo_visita, String relacao){
    return true;
  }

  public boolean presentear(ArrayList<String> presente){
    return true;
  }
  
}