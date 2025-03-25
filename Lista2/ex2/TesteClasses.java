package ex2;

public class TesteClasses {
  public static void main(String[] args) {
    Universidade universidade1 = new Universidade();
    Aluno aluno1 = new Aluno();

    universidade1.nome = "unicentro";
    universidade1.cidade = "guarapuava";
    universidade1.estado = "PR";

    aluno1.nome = "Breno";
    aluno1.curso = "MAC";

    universidade1.exibeDados();
    aluno1.exibeDados();

    Universidade universidade2 = new Universidade();
    Aluno aluno2 = new Aluno();

    universidade2.nome = "UTFPR";
    universidade2.cidade = "guarapuava";
    universidade2.estado = "PR";

    aluno2.nome = "Bruno";
    aluno2.curso = "CC";

    universidade2.exibeDados();
    aluno2.exibeDados();
  }
}
