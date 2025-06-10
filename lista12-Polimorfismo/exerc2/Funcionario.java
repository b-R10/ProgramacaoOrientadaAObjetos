package exerc2;

public class Funcionario extends Pessoa {

  private double salario;

  public Funcionario(String nome, double salario) {
    super(nome);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return (super.toString() + "; Salario: " + getSalario());
  }

}
