
import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private String cpf;
  private String numeroCadastro;
  private List<Emprestimo> emprestimosAtivos;

  public Cliente(String nome, String cpf, String numeroCadastro) {
    this.nome = nome;
    this.cpf = cpf;
    this.numeroCadastro = numeroCadastro;
    this.emprestimosAtivos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCadastro() {
    return numeroCadastro;
  }

  public void setNumeroCadastro(String numeroCadastro) {
    this.numeroCadastro = numeroCadastro;
  }

  public List<Emprestimo> getEmprestimosAtivos() {
    return emprestimosAtivos;
  }

  public void adicionarEmprestimo(Emprestimo emprestimo) {
    this.emprestimosAtivos.add(emprestimo);
  }

  public void removerEmprestimo(Emprestimo emprestimo) {
    this.emprestimosAtivos.remove(emprestimo);
  }

  public void listarEmprestimosAtivos() {
    System.out.println("Empréstimos ativos de " + getNome() + ":");
    if (emprestimosAtivos.isEmpty()) {
      System.out.println("Nenhum emprestimo ativo.");
    } else {
      for (Emprestimo emp : emprestimosAtivos) {
        System.out.println("- " + emp.getLivro().getTitulo() + " (" + emp.getStatus() + ")");
      }
    }
  }

  @Override
  public String toString() {
    return "Cliente: " + nome + " | CPF: " + getCpf() + " | Cadastro: " + getNumeroCadastro();
  }

}
