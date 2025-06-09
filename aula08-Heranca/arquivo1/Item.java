public class Item {
  private String titulo;
  private int tempoDuracao;

  public Item(String titulo, int tempoDuracao) {
    this.titulo = titulo;
    this.tempoDuracao = tempoDuracao;
  }

  public void print() {
    System.out.println("Titulo: " + this.titulo + " - Duracao: " + this.tempoDuracao);
  }
}