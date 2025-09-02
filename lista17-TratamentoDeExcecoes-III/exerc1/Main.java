package exerc1;
public class Main {

  public static void main(String[] args) {

    Conta conta1 = new Conta();
    Conta conta2 = new Conta();

    try {
      conta1.sacar(10);
    } catch(ValorNegativoException exc) {
      System.out.println(exc);
    }

    try {
      conta2.sacar(150);
    } catch(ValorNegativoException exc) {
      System.out.println(exc);
    }

  }

}
