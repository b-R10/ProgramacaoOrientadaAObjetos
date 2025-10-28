public class Livro {
  private String titulo;
  private String autor;
  private String identificador;
  private String categoria;

  public Livro(String titulo, String autor, String identificador, String categoria) {
    this.titulo = titulo;
    this.autor = autor;
    this.identificador = identificador;
    this.categoria = categoria;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public String toString() {
    return "Titulo: " + titulo +
        ", Autor: " + autor +
        ", Categoria: " + categoria +
        ", ID: " + identificador;
  }


  // metodo para busca (manipulacao de strings)
  public boolean contemTermo(String termo) {
    if (termo == null || termo.trim().isEmpty())
    return false;
    String termoLower = termo.toLowerCase();
    return titulo.toLowerCase().contains(termoLower) ||
    autor.toLowerCase().contains(termoLower) ||
    categoria.toLowerCase().contains(termoLower) ||
    identificador.toLowerCase().contains(termoLower);
  }
  
}
