package exercicio1;

public class Livro {
  // Atributos
  private String titulo;
  private String autor;

  // Getters e setters
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  // Metodos
  public void imprimeNoConsole() {
    System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor);
  }
}