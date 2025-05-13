package exercicio3;

public class Exerc3 {
    public static void main(String[] args) {
        double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double media = 0;
        for (double numero : array) {
            media += numero;
        }
        media /= array.length;
        System.out.println("Media: " + media);
    }
}
