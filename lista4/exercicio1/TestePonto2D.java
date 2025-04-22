public class TestePonto2D {
  public static void main(String[] args) {
    Ponto2D ponto1 = new Ponto2D();

    System.out.println("Numero de pontos: " + Ponto2D.contador);
    
    Ponto2D ponto2 = new Ponto2D(5.0, 7.0);
    
    System.out.println("Numero de pontos: " + Ponto2D.contador);

    System.out.print("Ponto 1\n\t");
    ponto1.exibeDados();

    System.out.print("Ponto 2\n\t");
    ponto2.exibeDados();

    ponto1.setX(ponto2.getY());
    ponto1.setY(ponto2.getX());

    System.out.print("Ponto 1\n\t");
    ponto1.exibeDados();

    System.out.print("Ponto 2\n\t");
    ponto2.exibeDados();

  }
}
