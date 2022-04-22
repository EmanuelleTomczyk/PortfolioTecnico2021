public class Carteirinha{
  private double saldo;
  private String tipo_carteirinha;
  private double desconto;
  private String empresa;
  private int numero;

  public Carteirinha(double saldo, String tipo_carteirinha, double desconto, String empresa, int numero){
    this.saldo = saldo;
    this.tipo_carteirinha = tipo_carteirinha;
    this.desconto = desconto;
    this.empresa = empresa; 
    this.numero = numero;
  }

  public void descontar_passagem(String tipo_carteirinha, double desconto, String empresa){
  }

  public boolean ser_atualizada(String empresa){
    return true;
  }

  public void fazer_2via(int numero){
  }
}