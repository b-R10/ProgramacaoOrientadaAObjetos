public class Ex08 {
  public static void main(String[] args) {

    int i = 0;
    int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 };

    try {
      for (i = 0; i < 12; i++) {
        System.out.println(vetor[i]);
      }
    } catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println("A posição " + i + " não existe no vetor");
    }

  }
}