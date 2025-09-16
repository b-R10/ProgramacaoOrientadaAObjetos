public class MaisTres implements Series {
  private int inicio;
  private int valor;

  public MaisTres() {
    this.inicio = 0;
    this.valor = 0;
  }

  @Override
  public int getNext() {
    int atual = valor;
    this.valor += 3;
    return atual;
  }

  @Override
  public void reset() {
    this.valor = this.inicio;
  }

  @Override
  public void setStart(int x) {
    this.inicio = x;
    this.valor = this.inicio;
  }

}
