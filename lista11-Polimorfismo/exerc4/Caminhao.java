package exerc4;

public class Caminhao extends Veiculo {

  public Caminhao() {
    System.out.println("é um caminhao");
  }

  @Override
  public void verificar() {
    System.out.println("verificar caminhao");
  }

  @Override
  public void ajustar() {
    System.out.println("ajustar caminhao");
  }

  @Override
  public void limpar() {
    System.out.println("limpar caminhao");
  }

}
