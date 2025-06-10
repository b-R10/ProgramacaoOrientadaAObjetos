package exerc1;

public class Produto {

  private String nome;
  private double valor;

  public Produto(String nome, double valor) {
    this.nome = nome;
    this.valor = valor;
  }
  
  @Override
  public String toString() {
    return ("Nome: " + nome + "; " + "Valor: " + valor);
  }

}
