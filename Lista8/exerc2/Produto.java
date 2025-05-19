package exerc2;

public class Produto {
  protected String nome;
  protected double preco;

  public Produto(String nome){
    this.nome = nome;
    this.preco = 0.0;
  }

  public Produto(double preco){
    this.nome = "sem nome";
    this.preco = preco;
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public boolean ehCaro() {
    return (preco > 50.0);
  }

  public void print() {
    System.out.println("Nome: " + nome + ", preco: " + preco);
  }

}