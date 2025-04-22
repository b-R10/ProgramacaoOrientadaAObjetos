import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int idade = scanner.nextInt();
    scanner.close();

    System.out.println((idade >= 18) ? "maior de idade" : "menor de idade");
  }
}
