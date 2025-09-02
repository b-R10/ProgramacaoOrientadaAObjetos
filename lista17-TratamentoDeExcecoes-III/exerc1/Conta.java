package exerc1;

public class Conta {
  private int saldo;

  public Conta() {
    this.saldo = 100;
  }

  public void sacar(int valor) throws ValorNegativoException {
    if (saldo - valor < 0) {
      throw new ValorNegativoException();
    }
    saldo -= valor;
    System.out.println(saldo);
  }
}
