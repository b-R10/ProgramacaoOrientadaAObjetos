public class PrazoDevolucaoExcedidoException extends Exception {
  private int diasAtraso;

  public PrazoDevolucaoExcedidoException(String mensagem, int diasAtraso) {
    super(mensagem);
    this.diasAtraso = diasAtraso;
  }

  public int getDiasAtraso() {
    return diasAtraso;
  }
}
