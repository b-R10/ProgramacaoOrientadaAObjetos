package exerc1_letra_d;

public class Shapes {
  public static void main(String[] args) {
    Triangulo t1 = new Triangulo(4.0,4.0);
    t1.setEstilo("cheio");
    
    Triangulo t2 = new Triangulo(8.0,12.0);
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

    System.out.println("//////////////////");

    Retangulo r1 = new Retangulo(3.0, 4.0);
    System.out.println(r1.isQuadrado() ? "Quadrado" : "Nao é quadrado");
    System.out.println("Area: " + r1.calcArea());
  }
}