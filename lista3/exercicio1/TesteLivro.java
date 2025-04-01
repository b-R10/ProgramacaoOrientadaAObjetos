package exercicio1;

public class TesteLivro {
  public static void main(String[] args) {
    Livro livro1 = new Livro();
    Livro livro2 = new Livro();

    livro1.setTitulo("Titulo1");
    livro1.setAutor("Autor1");

    livro2.setTitulo("Titulo2");
    livro2.setAutor("Autor2");

    livro1.imprimeNoConsole();
    livro2.imprimeNoConsole();
  }
}
