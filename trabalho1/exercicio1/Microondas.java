package exercicio1;

public class Microondas {
  private boolean ligado;

  public void ligar(){
    this.ligado = true;
  }

  public void desligar(){
    this.ligado = false;
  }

  public boolean isLigado(){
    return this.ligado;
  }

  public void observar(){
    System.out.println(isLigado() ? "Microondas ligado" : "Microondas desligado");
  }
  
}
