package exercicio1;

public class Cozinha {
  private Liquidificador liquidificador;
  private Geladeira geladeira;
  private Microondas microondas;

  public Cozinha(Liquidificador liquidificador, Geladeira geladeira, Microondas microondas) {
    this.liquidificador = liquidificador;
    this.geladeira = geladeira;
    this.microondas = microondas;
  }

  public void ligar(){
    this.liquidificador.ligar();
    this.geladeira.ligar();
    this.microondas.ligar();
  }

  public void desligar(){
    this.liquidificador.desligar();
    this.geladeira.desligar();
    this.microondas.desligar();
  }

  
}