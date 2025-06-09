package exercicio4;

// Reescrevendo a classe MinMax da aula

public class Exerc4 {
    public static void main(String[] args) {
        int[] array = { 99, 42, 35, 1001, 299, 442, 29 };
        int min, max;
        min = max = array[0];
        for (int numero : array) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("Maximo: " + max + ", minimo: " + min);
    }
}
