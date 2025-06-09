package exerc1;

public class ContaCorrente {
  private double saldo;

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  // para cada saque será debitado uma taxa de operacao de 0.5% do valor sacado
  // devera ser criado um metodo que retorne essa taxa de operacao
  // cada vez que for realizado o saque, esse metodo devera ser chamado
  public double taxaDeOperacao(double valor) {
    valor = 0.005 * valor;
    return valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
    this.saldo -= taxaDeOperacao(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

}