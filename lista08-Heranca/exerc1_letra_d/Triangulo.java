package exerc1_letra_d;

public class Triangulo extends TwoDShape {
  private String estilo;

  public Triangulo(double altura, double largura) {
    super(largura, altura);
  }

  public double area() {
    return (getLargura() * getAltura()) / 2;
  }

  public void setEstilo(String estilo) {
    this.estilo = estilo;
  }

  public void mostraEstilo() {
    System.out.println("Triangulo = " + estilo);
  }

}