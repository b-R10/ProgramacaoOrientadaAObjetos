public class Moto extends Veiculo {

  private double km;

  public Moto(String n, double p, double k) {
    super(n, p);
    this.km = k;
  }

  @Override
  public double getPreco() {
    return super.getPreco();
  }

  public void setKm(double km) {
    this.km = km;
  }

  public void printDados() {
    super.printDados();
    System.out.println("Km: " + km);
  }
}