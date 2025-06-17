public class Pedido {

  private int numero;
  private Cliente cliente;
  private Veiculo veiculo;

  public Pedido(int n, Cliente c, Veiculo v) {
    this.numero = n;
    this.cliente = c;
    this.veiculo = v;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public void printDados() {
    System.out.println("Numero: " + getNumero());
    System.out.println("Cliente:");
    cliente.printDados();
    System.out.println("Veiculo:");
    veiculo.printDados();
    System.out.println("---------------------------");
  }

}