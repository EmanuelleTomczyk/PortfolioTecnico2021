public class Terminal{
  private String local;
  private String nome;
  private Onibus onibus; 
  private double tarifa_travessia;

  public Terminal(String local, String nome, Onibus onibus, double tarifa_travessia){
    this.local = local;
    this.nome = nome; 
    this.onibus = onibus;
    this.tarifa_travessia = tarifa_travessia; 
  }

  public Terminal(String local, String nome, Onibus onibus){
    this.local = local;
    this.nome = nome; 
    this.onibus = onibus;
    }
}