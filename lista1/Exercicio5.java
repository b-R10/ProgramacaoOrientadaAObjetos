
import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    scanner.close();
    int resultado = 1;
    for (int i = 1; i <= numero; ++i) {
      resultado *= i;
    }
    System.out.println(resultado);
  }
}
