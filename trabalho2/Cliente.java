public class Cliente {
  private String nome;
  private String cpf;

  public Cliente(String n, String c) {
    this.nome = n;
    this.cpf = c;
  }

  public void printDados() {
    System.out.println("Nome: " + nome + ", CPF: " + cpf);
  }
}
