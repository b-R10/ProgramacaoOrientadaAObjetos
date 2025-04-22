package exercicio2;

public class TesteRetangulo {
  public static void main(String[] args) {
    Retangulo retangulo1 = new Retangulo();
    Retangulo retangulo2 = new Retangulo(3, 4);

    Retangulo.imprimirPerimetro(retangulo1.calcularPerimetro());
    Retangulo.imprimirArea(retangulo1.calcularArea());

    Retangulo.imprimirPerimetro(retangulo2.calcularPerimetro());
    Retangulo.imprimirArea(retangulo2.calcularArea());
  }
}
