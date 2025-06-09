package exerc5;

import java.util.ArrayList;
import java.util.Random;

public class UsaOficina {

  public static void main(String[] args) {

    ArrayList<Veiculo> lista = new ArrayList<>();
    Random rand = new Random();

    for (int i = 0; i < 5; ++i) {
      int sorteio = rand.nextInt(3);
      switch (sorteio) {
        case 0 -> lista.add(new Automovel());
        case 1 -> lista.add(new Bicicleta());
        case 2 -> lista.add(new Caminhao());
      }
    }

    for (Veiculo v : lista) {
      Oficina.consertar(v);
      System.out.println("---");
    }

  }

}
