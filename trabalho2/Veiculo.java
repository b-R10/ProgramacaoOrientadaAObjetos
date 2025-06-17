public class Veiculo {

  private String modelo;
  private double preco;

  public Veiculo(String n, double p) {
    this.modelo = n;
    this.preco = p;
  }

  public double getPreco() {
    return preco;
  }

  public void printDados() {
    System.out.println("Modelo: " + modelo + ", Preco: " + preco);
  }

}