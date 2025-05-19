package exerc2;


public class Livro extends Produto {
  private String autor;
  private int paginas;

  public Livro(String autor, double preco, String nome){
    super(nome, preco);
    this.autor = autor;
    this.paginas = 100;
  }

  public Livro(int paginas, String autor, double preco, String nome) {
    super(nome, preco);
    this.autor = autor;
    this.paginas = paginas;
  }

  public boolean ehExtenso() {
    return (paginas > 100);
  }

  @Override
  public void print() {
    System.out.println("nome: " + nome +
        ", preco: " + preco +
        ", autor: " + autor +
        ", paginas: " + paginas);
  }

}
