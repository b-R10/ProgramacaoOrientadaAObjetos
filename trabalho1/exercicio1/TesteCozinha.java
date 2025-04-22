package exercicio1;

public class TesteCozinha {
  public static void main(String[] args) {

    Liquidificador liquidificador1 = new Liquidificador();
    Geladeira geladeira1 = new Geladeira();
    Microondas microondas1 = new Microondas();
    
    Cozinha cozinha1 = new Cozinha(liquidificador1, geladeira1, microondas1);
    
    cozinha1.ligar();
    liquidificador1.observar();
    geladeira1.observar();
    microondas1.observar();
    
    cozinha1.desligar();
    liquidificador1.observar();
    geladeira1.observar();
    microondas1.observar();

  }
  
}
