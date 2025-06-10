package exerc3;

public class MensagemImagem extends Mensagem {
  private boolean ehImagem;

  public MensagemImagem(String mensagem) {
    super(mensagem);
    ehImagem = true;
  }

  @Override
  public String toString() {
    return (super.toString() + "; É imagem? " + ehImagem);
  }

}
