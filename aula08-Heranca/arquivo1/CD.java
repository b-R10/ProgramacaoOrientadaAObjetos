public class CD extends Item {
  private String artista;

  public CD(String titulo, String artista, int tempo) {
    super(titulo, tempo);
    this.artista = artista;
  }
}