package exerc3;

public class Cliente {
  
  private double conta;
  
  public Cliente(double conta) {
    this.conta = conta;
  }

  public double getConta() {
    return conta;
  }
  
  public void setConta(double conta) {
    this.conta = conta;
  }
  
  public double calcularDesconto(double valor) {
    return (valor * 0.9);
  }

}
