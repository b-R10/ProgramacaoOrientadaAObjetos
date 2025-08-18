package exercicio_simulacao;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {

  private final ArrayList<Carta> cartas = new ArrayList<>();

  public Baralho() {
    for (EnumNaipe n : EnumNaipe.values()) {
      for (EnumValor v : EnumValor.values()) {
        cartas.add(new Carta(v, n));
      }
    }
  }

  // gerar baralho limpo
  public Baralho(int i) {
  }

  public String getCarta(int idx) {
    if (idx >= 0 && idx < cartas.size()) {
      Carta c = cartas.get(idx);
      return c != null ? c.toString() : "Carta vazia";
    }
    return "Carta vazia";
  }

  public static void imprimirBaralho(Baralho b) {
    for (int idx = 0; idx < b.cartas.size(); idx++) {
      System.out.println((idx + 1) + " - " + b.getCarta(idx));
    }
  }

  public static void embaralhar(Baralho b) {
    Random random = new Random();
    for (int i = b.cartas.size() - 1; i > 0; --i) {
      int j = random.nextInt(i + 1);
      Carta temp = b.cartas.get(i);
      b.cartas.set(i, b.cartas.get(j));
      b.cartas.set(j, temp);
    }
  }

  public static Carta comprar(Baralho b) {
    if (!b.cartas.isEmpty()) {
      return b.cartas.remove(0);
    }
    return null;
  }

  public static int cartasRestantes(Baralho b) {
    if (!b.cartas.isEmpty()) {
      return b.cartas.size();
    } else {
      return 0;
    }
  }

}