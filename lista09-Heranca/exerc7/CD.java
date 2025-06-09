package exerc7;

public class CD extends Produto {
  private int numeroDeFaixas;

  public CD(String nome, double preco, int numeroDeFaixas) {
    super(nome, preco);
    this.numeroDeFaixas = numeroDeFaixas;
  }

  @Override
  public String toString() {
    return (getNome() + "; R$ " + getPreco() + "; numero de faixas:" + this.numeroDeFaixas);
  }
}
