package exerc1_letra_a;

public class Triangulo extends TwoDShape {
  private String estilo;

  public double area() {
    return (largura * altura) / 2;
  }

  public void setEstilo(String estilo){
    this.estilo = estilo;
  }

  public void mostraEstilo() {
    System.out.println("Triangulo = " + estilo);
  }

}