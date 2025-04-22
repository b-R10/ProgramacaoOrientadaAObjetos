package exercicio2;

public class Sala {
  TV televisao;
  HomeTheater homeTheater;
  VideoGame videoGame;

  public Sala(TV tv, HomeTheater homeTheater, VideoGame videoGame) {
    this.televisao = tv;
    this.homeTheater = homeTheater;
    this.videoGame = videoGame;
  }

  public void ligar() {
    this.televisao.ligar();
    this.homeTheater.ligar();
    this.videoGame.ligar();
  }

  public void desligar() {
    this.televisao.desligar();
    this.homeTheater.desligar();
    this.videoGame.desligar();
  }

  public void observar() {
    this.televisao.observar();
    this.homeTheater.observar();
    this.videoGame.observar();

    
  }

}
