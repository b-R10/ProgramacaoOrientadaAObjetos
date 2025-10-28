public interface Emprestavel {
  boolean emprestar() throws LivroIndisponivelException;
  void devolver();
  boolean isDisponivel();
}
