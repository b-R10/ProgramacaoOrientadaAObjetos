public class Ponto2D {
  private double x;
  private double y;
  public static int contador = 0;

  public Ponto2D() {
    this.x = 0;
    this.y = 0;
    contador++;
  }

  public Ponto2D(double x, double y) {
    this.x = x;
    this.y = y;
    contador++;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getX() {
    return this.x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getY() {
    return this.y;
  }
  
  public void exibeDados() {
    System.out.println("As coordenadas do ponto são: (" + this.x + "," + this.y + ").");
  }

}