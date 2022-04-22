public class Onibus{
  private String empresa;
  private String linha;
  private Rota rota; 
  private String horario;
  private Motorista motorista;
  private double valor_passagem;
  private Passageiro passageiro;
  private Cobrador cobrador;

  public Onibus(String empresa, String linha, String horario, double valor_passagem, Passageiro passageiro, Cobrador cobrador){
    this.empresa = empresa; 
    this.linha = linha; 
    this.horario = horario; 
    this.valor_passagem = valor_passagem;
    this.passageiro = passageiro;
    this.cobrador = cobrador; 
  }

    public Onibus(String empresa, String linha, String horario, double valor_passagem, Passageiro passageiro){
    this.empresa = empresa; 
    this.linha = linha; 
    this.horario = horario; 
    this.valor_passagem = valor_passagem;
    this.passageiro = passageiro;  
    }

  public void chegar_ponto(String linha, Rota rota, Motorista motorista){
  }

  public boolean ir_conserto(String empresa){
    return true;
  }

  public boolean fazer_rota(String empresa, String linha, Rota rota, Motorista motorista){
    return true;
  }

  public void quebrar(String empresa, String linha, Motorista motorista, Passageiro passageiro){
  }
}

