public class Arquivo {

  public static void main(String[] args) {

    Transporte tp;

    tp = Transporte.AVIAO;

    System.out.println("Valor de tp: " + tp);
    System.out.println();

    tp = Transporte.TREM;

    if (tp == Transporte.TREM)
      System.out.println("tp contem trem.\n");

    switch (tp) {
      case CARRO -> System.out.println("Meio de transporte: carro;\\n" + //
          "velocidade: " + Transporte.CARRO.getVelocidade());
      case CAMINHAO -> System.out.println("Meio de transporte: caminhao;\\n" + //
          " velocidade: " + Transporte.CARRO.getVelocidade());
      case AVIAO -> System.out.println("Meio de transporte: aviao;\\n" + //
          " velocidade: " + Transporte.AVIAO.getVelocidade());
      case TREM -> System.out.println("Meio de transporte: trem;\\n" + //
          " velocidade: " + Transporte.CARRO.getVelocidade());
      case BARCO -> System.out.println("Meio de transporte: barco;\\n" + //
          " velocidade: " + Transporte.CARRO.getVelocidade());
      default -> throw new AssertionError();
    }

    System.out.println("Velocidade de todos os meios ");
    for (Transporte t : Transporte.values())
      System.out.println(t + " - velocidade é de " + t.getVelocidade() + "km por hora");

  }

}