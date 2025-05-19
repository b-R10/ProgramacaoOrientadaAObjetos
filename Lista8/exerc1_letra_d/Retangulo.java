package exerc1_letra_d;

public class Retangulo extends TwoDShape {

  public Retangulo(double altura, double largura) {
    super(largura, altura);
  }

  public boolean isQuadrado(){
    return (getAltura() == getLargura());
  }

  public double calcArea(){
    return (getAltura() * getLargura());
  }
}