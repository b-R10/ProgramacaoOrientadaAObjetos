package exercicio2;

public class TesteSala {
  public static void main(String[] args) {
    TV tv1 = new TV();
    HomeTheater homeTheater1 = new HomeTheater();
    VideoGame videoGame1 = new VideoGame();
    Sala sala1 = new Sala(tv1, homeTheater1, videoGame1);
    
    sala1.ligar();
    sala1.observar();

    sala1.desligar();
    sala1.observar();

    

  }
}