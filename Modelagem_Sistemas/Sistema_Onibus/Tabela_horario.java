public class Tabela_horario{
  private Onibus onibus; 
  private String horario_saida_terminal;
  private String horario_saida_bairro;
  private String previsao_tempo_rota;
  private String empresa;
  private Rota rota;
  private String dia_semana;

  public Tabela_horario(Onibus onibus, String horario_saida_terminal, String horario_saida_bairro, String previsao_tempo_rota, String empresa, Rota rota,  String dia_semana){
    this.onibus = onibus;
    this.horario_saida_terminal = horario_saida_terminal;
    this.horario_saida_bairro = horario_saida_bairro;
    this.previsao_tempo_rota = previsao_tempo_rota; 
    this.empresa = empresa;
    this.rota = rota; 
    this.dia_semana = dia_semana;
   }
}