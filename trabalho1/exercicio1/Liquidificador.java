package exercicio1;

public class Liquidificador {
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
    System.out.println(isLigado() ? "Liquidificador ligado" : "Liquidificador desligado");
  }
  
}
