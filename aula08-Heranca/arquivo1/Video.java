public class Video extends Item {
  private String diretor;

  public Video(String titulo, String diretor, int tempo) {
    super(titulo, tempo);
    this.diretor = diretor;
  }
}