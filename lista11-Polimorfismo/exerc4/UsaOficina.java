package exerc4;

import java.util.Random;

public class UsaOficina {

  public static void main(String[] args) {

    Random rand = new Random();
    Veiculo[] veiculos = new Veiculo[5];

    for (int i = 0; i < veiculos.length; ++i) {
      int sorteio = rand.nextInt(3);
      switch (sorteio) {
        case 0 -> veiculos[i] = new Automovel();
        case 1 -> veiculos[i] = new Bicicleta();
        case 2 -> veiculos[i] = new Caminhao();
        default -> {}
      }
    }

    for (Veiculo v : veiculos) {
      Oficina.consertar(v);
      System.out.println("---");
    }

  }

}
