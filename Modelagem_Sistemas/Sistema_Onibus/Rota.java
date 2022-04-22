import java.util.ArrayList;

public class Rota{
  private String ponto_final; 
  private String ponto_inicial; 
  private ArrayList<String> paradas;

  public Rota(String ponto_final, String ponto_inicial){
    this.ponto_final = ponto_final;
    this.ponto_inicial = ponto_inicial;
  }
}
