package exerc2;

import java.util.Random;

public class TesteAnimais {

  public static void main(String[] args) {

    Random rand = new Random();
    Animal[] animais = new Animal[5];

    for (int i = 0; i < animais.length; ++i) {
      int sorteio = rand.nextInt(3);
      switch (sorteio) {
        case 0:
          animais[i] = new Cachorro();
          break;
        case 1:
          animais[i] = new Gato();
          break;
        case 2:
          animais[i] = new Preguica();
          break;
        default:
          throw new AssertionError();
      }
    }

    for (Animal animal : animais) {
      animal.emitirSom();
    }

  }

}
