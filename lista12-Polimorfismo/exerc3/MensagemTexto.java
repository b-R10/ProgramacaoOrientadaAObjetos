package exerc3;

public class MensagemTexto extends Mensagem {
  private boolean ehTexto;

  public MensagemTexto(String mensagem) {
    super(mensagem);
    ehTexto = true;
  }

  @Override
  public String toString() {
    return (super.toString() + "; É texto? " + ehTexto);
  }

}
