package exerc1_letra_d;

public class TwoDShape {
  private double largura;
  private double altura;

  public TwoDShape(double largura, double altura){
    this.largura = largura;
    this.altura = altura;
  }

  public void mostraDim() {
    System.out.println("Largura e altura = " + largura + " e " + altura);
  }

  public void setLargura(double largura){
    this.largura = largura;
  }

  public double getLargura(){
    return this.largura;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public double getAltura(){
    return this.altura;
  }

}