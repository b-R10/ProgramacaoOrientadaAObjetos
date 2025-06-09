package exerc3;

public class TestaCliente {
  
  public static void main(String[] args) {
    
    Cliente[] clientes = new Cliente[3];
    clientes[0] = new Cliente(1000.0);
    clientes[1] = new Cliente(10000.0);
    clientes[2] = new Cliente(100000.0);

    double descontado;

    for(int i=0; i<clientes.length; ++i) {
      descontado = clientes[i].calcularDesconto(clientes[i].getConta());
      
      System.out.println("-------");
      System.out.println("Valor da conta: " + clientes[i].getConta());
      System.out.println("Valor com desconto: " + descontado);
    }

    ClienteEspecial[] clientesEsp = new ClienteEspecial[3];
    clientesEsp[0] = new ClienteEspecial(1000.0);
    clientesEsp[1] = new ClienteEspecial(10000.0);
    clientesEsp[2] = new ClienteEspecial(100000.0);

    for(int i=0; i<clientesEsp.length; ++i) {
      descontado = clientesEsp[i].calcularDesconto(clientesEsp[i].getConta());
      
      System.out.println("-------");
      System.out.println("Valor da conta: " + clientesEsp[i].getConta());
      System.out.println("Valor com desconto: " + descontado);
    }
    

  }

}
