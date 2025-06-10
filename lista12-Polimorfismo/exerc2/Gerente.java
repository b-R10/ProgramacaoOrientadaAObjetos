package exerc2;

public class Gerente extends Pessoa {

  private double bonus;
  private double salario;

  public Gerente(String nome, double salario, double bonus) {
    super(nome);
    this.salario = salario;
    this.bonus = bonus;
  }

  public double getSalario() {
    return salario;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return (super.toString() + "; Salario: " + getSalario() + "; Bonus: " + getBonus() + "%");
  }

}
