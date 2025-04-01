package exercicio4;

public class Conta {
  private double saldo;

  public Conta(double saldoInicial){
    if(saldoInicial > 0.0)
      this.saldo = saldoInicial;
    else
      this.saldo = 0.0;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void creditar(double quantia){
    saldo += quantia;
  }

  // insira aqui o método debitar
  public void debitar(double quantia) {
    if (this.saldo < quantia)
      System.out.println("Quantia de débito excedeu o saldo da conta");
    else 
      this.saldo -= quantia;
  }
}
