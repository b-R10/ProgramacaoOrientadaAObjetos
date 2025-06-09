package exerc3;

public class ClienteEspecial extends Cliente {

  public ClienteEspecial(double conta) {
    super(conta);
  }
  
  @Override
  public double calcularDesconto(double valor) {
    return (valor * 0.8);
  }

}
