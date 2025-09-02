package exerc1;

public class ValorNegativoException extends Exception {
  @Override
  public String toString() {
    return "Não é possível fazer o saque, pois, o saldo será negativo.";
  }
}
