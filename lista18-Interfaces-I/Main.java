public class Main {
  public static void main(String[] args) {
    // O polimorfismo neste exercício ocorre ao usarmos o mesmos métodos mas com
    // aplicacoes diferentes.
    // Neste caso, são os métodos getNext(), reset() e setStart()

    MaisDois serieDois = new MaisDois();

    for (int i = 0; i < 5; i++) {
      System.out.println(serieDois.getNext());
    }
    System.out.println();

    serieDois.reset();
    for (int i = 0; i < 5; i++) {
      System.out.println(serieDois.getNext());
    }
    System.out.println();

    serieDois.setStart(100);
    for (int i = 0; i < 5; i++) {
      System.out.println(serieDois.getNext());
    }
    System.out.println();

    MaisTres serieTres = new MaisTres();

    for (int i = 0; i < 5; i++) {
      System.out.println(serieTres.getNext());
    }
    System.out.println();

    serieTres.reset();
    for (int i = 0; i < 5; i++) {
      System.out.println(serieTres.getNext());
    }
    System.out.println();

    serieTres.setStart(100);
    for (int i = 0; i < 5; i++) {
      System.out.println(serieTres.getNext());
    }
    System.out.println();

  }
}
