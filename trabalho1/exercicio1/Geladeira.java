package exercicio1;

public class Geladeira {
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
    System.out.println(isLigado() ? "Geladeira ligada" : "Geladeira desligada");
  }
  
}
