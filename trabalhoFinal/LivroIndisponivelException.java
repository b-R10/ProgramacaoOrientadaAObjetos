public class LivroIndisponivelException extends Exception {
  public LivroIndisponivelException(String mensagem) {
    // passa a mensagem para a classe mae
    super(mensagem);
  }
}