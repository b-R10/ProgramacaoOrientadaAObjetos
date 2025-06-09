
import java.util.Random;

public class UsaOficina {

  public static void main(String[] args) {

    Random rand = new Random();
    Veiculo[] veiculos = new Veiculo[5];

    for (int i = 0; i < veiculos.length; ++i) {
      if (rand.nextBoolean()) {
        veiculos[i] = new Automovel();
      } else {
        veiculos[i] = new Bicicleta();
      }
    }

    for (Veiculo v : veiculos) {
      Oficina.consertar(v);
      System.out.println("---");
    }

  }

}
