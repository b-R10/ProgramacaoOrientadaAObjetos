package exercicio_simulacao;

public class Carta {
  private EnumNaipe naipe;
  private EnumValor valor;

  public Carta(EnumValor valor, EnumNaipe naipe) {
    this.naipe = naipe;
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Carta: " + this.valor.name() + " de " + this.naipe.name();
  }

  public void setNaipe(EnumNaipe naipe) {
    this.naipe = naipe;
  }

  public void setValor(EnumValor valor) {
    this.valor = valor;
  }

  public EnumNaipe getNaipe() {
    return naipe;
  }

  public EnumValor getValor() {
    return valor;
  }

}
