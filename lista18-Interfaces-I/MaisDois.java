public class MaisDois implements Series {
  private int inicio;
  private int valor;

  public MaisDois() {
    this.inicio = 0;
    this.valor = 0;
  }

  @Override
  public int getNext() {
    int atual = this.valor;
    this.valor += 2;
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
