package exerc1_letra_a;

public class Shapes {
  public static void main(String[] args) {
    Triangulo t1 = new Triangulo();
    Triangulo t2 = new Triangulo();
    t1.largura = 4.0;
    t1.altura = 4.0;

    t1.setEstilo("cheio");

    t2.largura = 8.0;
    t2.altura = 12.0;

    t2.setEstilo("contorno");

    System.out.println("Info para t1: ");
    t1.mostraEstilo();
    t1.mostraDim();
    System.out.println("Area = " + t1.area());
    System.out.println();
    System.out.println("Info para t2: ");
    t2.mostraEstilo();
    t2.mostraDim();
    System.out.println("Area = " + t2.area());
  }
}