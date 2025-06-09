package exerc1;


public class TesteConta {
  public static void main(String[] args) {
    
    ContaCorrente cc1 = new ContaCorrente(1000.00);
    System.out.println("saldo: " + cc1.getSaldo());
    cc1.sacar(100.0);
    System.out.println("saldo: " + cc1.getSaldo());
    cc1.depositar(100.0);
    System.out.println("saldo: " + cc1.getSaldo());
    
    ClienteEspecial ce1 = new ClienteEspecial(1000.0);
    System.out.println("saldo: " + ce1.getSaldo());
    ce1.sacar(100.0);
    System.out.println("saldo: " + ce1.getSaldo());
    ce1.depositar(100.0);
    System.out.println("saldo: " + ce1.getSaldo());

  }
}