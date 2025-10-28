
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
  private Cliente cliente;
  private Livro livro;
  private LocalDate dataEmprestimo;
  private LocalDate dataDevolucaoPrevista;
  private LocalDate dataDevolucaoReal;
  private StatusEmprestimo status;

  private static final int PRAZO_LIVRO_FISICO = 15;

  public Emprestimo(Cliente cliente, Livro livro) {
    this.cliente = cliente;
    this.livro = livro;
    this.dataEmprestimo = LocalDate.now();

    // define prazo baseado no tipo do livro (polimorfismo)
    if (livro instanceof LivroFisico) {
      this.dataDevolucaoPrevista = dataEmprestimo.plusDays(PRAZO_LIVRO_FISICO);
    } else {
      // ebook nao tem data de devolucao
      this.dataDevolucaoPrevista = null;
    }

    this.status = StatusEmprestimo.EM_ANDAMENTO;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Livro getLivro() {
    return livro;
  }

  public LocalDate getDataEmprestimo() {
    return dataEmprestimo;
  }

  public LocalDate getDataDevolucaoPrevista() {
    return dataDevolucaoPrevista;
  }

  public LocalDate getDataDevolucaoReal() {
    return dataDevolucaoReal;
  }

  public StatusEmprestimo getStatus() {
    return status;
  }

  public void devolver() throws PrazoDevolucaoExcedidoException {
    this.dataDevolucaoReal = LocalDate.now();

    // verifica a data (apenas para livros fisicos)
    if (livro instanceof LivroFisico && dataDevolucaoReal.isAfter(dataDevolucaoPrevista)) {
      long diasAtraso = ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucaoReal);
      this.status = StatusEmprestimo.ATRASADO;
      throw new PrazoDevolucaoExcedidoException("Devolução com atraso de " + diasAtraso + "dias", (int) diasAtraso);
    } else {
      this.status = StatusEmprestimo.DEVOLVIDO;
    }

    // devolve o livro (polimorfismo)
    if (livro instanceof Emprestavel emprestavel) {
      emprestavel.devolver();
    }
  }

  public boolean verificarAtraso() {
    if (status == StatusEmprestimo.EM_ANDAMENTO &&
        dataDevolucaoPrevista != null &&
        LocalDate.now().isAfter(dataDevolucaoPrevista)) {
      this.status = StatusEmprestimo.ATRASADO;
      return true;
    }
    return false;
  }

  public int getDiasAtraso() {
    if (status == StatusEmprestimo.ATRASADO) {
      return (int) ChronoUnit.DAYS.between(dataDevolucaoPrevista, LocalDate.now());
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Emprestimo: " + livro.getTitulo() +
        " para " + cliente.getNome() +
        " | Status: " + getStatus() +
        " | Devolucao: " + getDataDevolucaoPrevista() +
        (dataDevolucaoReal != null ? " | Devolvido: " + dataDevolucaoReal : "");
  }

}
