package exercicio_simulacao;

public class Main {

  public static void main(String[] args) {
    Baralho baralho1 = new Baralho();

    // imprimir o baralho todo
    Baralho.imprimirBaralho(baralho1);

    Baralho.embaralhar(baralho1);
    Baralho.imprimirBaralho(baralho1);

    for (int i = 0; i < 5; i++) {
      Carta carta = Baralho.comprar(baralho1);
      System.out.println(carta);
    }

    System.out.println(Baralho.cartasRestantes(baralho1));

  }

}