public class Ebook extends Livro implements Emprestavel {
  private int copiasEmUso;

  public Ebook(String titulo, String autor, String identificador, String categoria) {
    super(titulo, autor, identificador, categoria);
    this.copiasEmUso = 0;
  }

  @Override
  public boolean emprestar() throws LivroIndisponivelException {
    // está sempre disponivel
    copiasEmUso++;
    return true;
  }

  @Override
  public void devolver() {
    if (copiasEmUso > 0) {
      copiasEmUso--;
    }
  }

  @Override
  public boolean isDisponivel() {
    // está sempre disponivel
    return true;
  }

    public int getCopiasEmUso() {
        return copiasEmUso;
    }

    @Override
    public String toString() {
        return super.toString() + 
        " [Ebook - em uso: " + copiasEmUso + " livros]";
    }

    
}
