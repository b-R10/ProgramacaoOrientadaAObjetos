package exercicio2;

public class CarroApp {
  public static void main(String[] args) {
    Motor m1 = new Motor("3.8L V6");
    Bancos b1 = new Bancos("FabriBancos");
    Carro c1 = new Carro("Mustang", "Conversivel", "Ford", m1, b1);
    
    Motor m2 = new Motor("Zetec Roçam 1.0");
    Bancos b2 = new Bancos("FabriBancos1");
    Carro c2 = new Carro("Ka", "Popular", "Ford", m2, b2);

    Motor m3 = new Motor("2.4 Ecotec");
    Bancos b3 = new Bancos("FabriBancos2");
    Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3, b3);

    System.out.println(
      c1.getFabricante() + " " +
      c1.getMarca() + " " +
      c1.getModelo() + " " +
      c1.getTipoMotor() + " " +
      c1.getBancoFabricante()
    );

    System.out.println(
      c2.getFabricante() + " " +
      c2.getMarca() + " " +
      c2.getModelo() + " " +
      c2.getTipoMotor() + " " +
      c2.getBancoFabricante()
    );

    System.out.println(
      c3.getFabricante() + " " +
      c3.getMarca() + " " +
      c3.getModelo() + " " +
      c3.getTipoMotor() + " " +
      c3.getBancoFabricante()
    );
  }
}
