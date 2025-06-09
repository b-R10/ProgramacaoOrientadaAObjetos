package Lista1;

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {

      int num1;
      int num2;
      try (Scanner scanner = new Scanner(System.in)) {
          num1 = scanner.nextInt();
          num2 = scanner.nextInt();
      }

    int soma = num1 + num2;
    int subtracao = num1 - num2;
    int multiplicacao = num1 * num2;
    int divisao = num1 / num2;

    System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(multiplicacao);
    System.out.println(divisao);

  }
}
