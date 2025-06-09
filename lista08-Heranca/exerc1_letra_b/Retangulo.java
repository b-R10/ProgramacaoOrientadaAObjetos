package exerc1_letra_b;

public class Retangulo extends TwoDShape {

  public Retangulo(double altura, double largura) {
    this.altura = altura;
    this.largura = largura;
  }

  public boolean isQuadrado(){
    return (this.altura == this.largura);
  }

  public double calcArea(){
    return (altura * largura);
  }
}