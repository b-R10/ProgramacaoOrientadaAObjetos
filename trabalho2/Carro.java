
public class Carro extends Veiculo {
  private int ano;

  public Carro(String n, double p, int a) {
    super(n, p);
    this.ano = a;
  }

  @Override
  public double getPreco() {
    return super.getPreco();
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void printDados() {
    super.printDados();
    System.out.println("Ano: " + ano);
  }

}
