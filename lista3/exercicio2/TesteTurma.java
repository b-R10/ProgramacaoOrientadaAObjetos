package exercicio2;

public class TesteTurma {
  public static void main(String[] args) {
    Turma turma1 = new Turma();
    Turma turma2 = new Turma();

    turma1.setCurso("CC");
    turma1.setDisciplina("Redes");
    turma2.setCurso("MAC");
    turma2.setDisciplina("Calculo");

    turma1.imprimir(turma1.getCurso(), turma1.getDisciplina());
    turma1.imprimir(turma2.getCurso(), turma2.getDisciplina());
  }
}
