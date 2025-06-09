package exerc1;

public class ClienteEspecial extends ContaCorrente {

  public ClienteEspecial(double saldo) {
    super(saldo);
  }

  @Override
  public double taxaDeOperacao(double valor) {
    valor = 0.001*valor;
    return valor;
  }
}
