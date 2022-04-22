public class Usuario extends Passageiro{
  private int id;

  public Usuario(String nome, String cpf, String data_nascimento, String endereco, boolean genero, Carteirinha carteirinha, String destino, int id){
    super(nome, cpf, data_nascimento, endereco, genero, carteirinha, destino); 
    this.id = id;
  }

    public void ver_tabela_horario(Tabela_horario tabela_horario){
    }

    public void conferir_tempo_chegada(Tabela_horario tabela_horario){
    }

  public void conferir_rota(Tabela_horario tabela_horario){
  }
}