public class LivroFisico extends Livro implements Emprestavel {
  private int totalExemplares;
  private int exemplaresDisponiveis;

  public LivroFisico(String titulo, String autor, String identificador, String categoria, int totalExemplares) {
    super(titulo, autor, identificador, categoria);
    this.totalExemplares = totalExemplares;
    this.exemplaresDisponiveis = totalExemplares;
  }

  @Override
  public boolean emprestar() throws LivroIndisponivelException {
    if (exemplaresDisponiveis <= 0) {
      throw new LivroIndisponivelException("Não há exemplares disponíveis do livro: " + getTitulo());
    }
    exemplaresDisponiveis--;
    return true;
  }

  @Override
  public void devolver() {
    if (exemplaresDisponiveis < totalExemplares) {
      exemplaresDisponiveis++;
    }
  }

  @Override
  public boolean isDisponivel() {
    return (exemplaresDisponiveis > 0);
  }

  public int getTotalExemplares() {
    return totalExemplares;
  }

  public int getExemplaresDisponiveis() {
    return exemplaresDisponiveis;
  }

  @Override
  public String toString() {
    return super.toString() + "[Físico - Disponíveis: " + getExemplaresDisponiveis() + "/" + getTotalExemplares() + "]";
  }

}
