package ex1;

public class TestePessoa {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.nome = "Breno";
    p1.telefone = "3333-4444";
    p1.exibeDados();
    Pessoa p2 = new Pessoa();
    p2.nome = "Carlos";
    p2.telefone = "2222-3333";
    p2.exibeDados();
  }
}