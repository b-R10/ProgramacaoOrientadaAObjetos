package exerc3;

public class Mensagem {
  private String mensagem;

  public Mensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String toString() {
    return ("Mensagem: " + getMensagem());
  }

}
