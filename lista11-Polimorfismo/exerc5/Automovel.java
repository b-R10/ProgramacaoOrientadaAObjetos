package exerc5;
 
public class Automovel extends Veiculo {

  public Automovel() {
    System.out.println("é um automóvel");
  }

  @Override
  public void verificar() {
    System.out.println("verificar automóvel");
  }

  @Override
  public void ajustar() {
    System.out.println("ajustar automóvel");
  }

  @Override
  public void limpar() {
    System.out.println("limpar automóvel");
  }

}
