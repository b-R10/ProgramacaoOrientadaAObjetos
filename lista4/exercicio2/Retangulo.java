package exercicio2;

public class Retangulo {
  private double comprimento;
  private double largura;
  
  public Retangulo() {
    this.comprimento = 1;
    this.largura = 1;
  }

  public Retangulo(double comprimento, double largura) {
    this.comprimento = comprimento;
    this.largura = largura;
  }

  public void setComprimento(double comprimento) {
    this.comprimento = comprimento;
  }

  public double getComprimento() {
    return this.comprimento;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getLargura() {
    return this.largura;
  }

  public double calcularPerimetro() {
    return (2*this.comprimento + 2*this.largura);
  }

  public double calcularArea() {
    return (this.comprimento*this.largura);
  }

  public static void imprimirPerimetro(double perimetro) {
    System.out.println("Perimetro: " + perimetro);
  }

  public static void imprimirArea(double area) {
    System.out.println("Area: " + area);
  }
}