package exercicio2;

public class HomeTheater {
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
    System.out.println(isLigado() ? "HomeTheater está ligado" : "HomeTheater está desligado");
  }
  
}
