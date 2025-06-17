import java.util.Scanner;

public class Teste {

  public static void main(String[] args) {

    int opcao = 0;
    int i = 0;
    Pedido[] pedidos = new Pedido[30];
    Scanner scan = new Scanner(System.in);
    
    while (opcao != -1) {
      
      System.out.println("Iniciar um pedido");
      System.out.println("Insira uma opcao: ");
      System.out.println("1 - Adicionar uma moto");
      System.out.println("2 - Adicionar um carro");
      System.out.println("3 - Imprimir pedidos");
      System.out.println("0 - Sair");
      opcao = scan.nextInt();
      scan.nextLine();

      switch (opcao) {
        case 1 -> {
          System.out.println("Nome: ");
          String nomeCliente = scan.nextLine();
          System.out.println("CPF do cliente: ");
          String cpfCliente = scan.nextLine();
          System.out.println("Modelo da moto:");
          String modeloMoto = scan.nextLine();
          System.out.println("Preco da moto:");
          double precoMoto = scan.nextDouble();
          System.out.println("Km da moto:");
          double kmMoto = scan.nextDouble();

          Cliente clienteMoto = new Cliente(nomeCliente, cpfCliente);
          Moto moto = new Moto(modeloMoto, precoMoto, kmMoto);
          pedidos[i] = new Pedido(i + 1, clienteMoto, moto);
          i++;
          System.out.println("Moto adicionada ao pedido.");
        }
        case 2 -> {
          System.out.println("Nome: ");
          String nomeCliente = scan.nextLine();
          System.out.println("CPF do cliente: ");
          String cpfCliente = scan.nextLine();
          System.out.println("Modelo do carro:");
          String modeloCarro = scan.nextLine();
          System.out.println("Preco do carro:");
          double precoCarro = scan.nextDouble();
          System.out.println("Ano do carro:");
          int anoCarro = scan.nextInt();
          scan.nextLine();
          Cliente clienteCarro = new Cliente(nomeCliente, cpfCliente);
          Carro carro = new Carro(modeloCarro, precoCarro, anoCarro);
          pedidos[i] = new Pedido(i + 1, clienteCarro, carro);
        }
        case 3 -> {
          System.out.println("Pedidos: ");
          int j = 0;
          while(pedidos[j] != null) {
            pedidos[j].printDados();
            j++;
          }
        }
        case 0 -> {
          scan.close();
          System.out.println("Fim das entradas.");
          opcao = -1;
        }
        default -> System.out.println("Insira novamente.");
      }
    }

  }

}
