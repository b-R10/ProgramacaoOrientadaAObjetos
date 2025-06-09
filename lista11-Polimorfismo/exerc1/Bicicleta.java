public class Bicicleta extends Veiculo {

  public Bicicleta() {
    System.out.println("é um bicicleta");
  }

  @Override
  public void verificar() {
    System.out.println("verificar bicicleta");
  }

  @Override
  public void ajustar() {
    System.out.println("ajustar bicicleta");
  }

  @Override
  public void limpar() {
    System.out.println("limpar bicicleta");
  }

}
