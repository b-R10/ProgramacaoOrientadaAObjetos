package exercicio5;

public class Exerc5 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 7, 12, 15, 34, 23, 7, 8, 10 };
        // int[] array = { 1, 3, 7, 7, 8, 10, 12, 15, 23, 34 };
        // int[] array = { 34, 23, 15, 12, 10, 8, 7, 7, 3, 1 };
        int x = 7;
        int diferenca, posicao, aux;
        diferenca = posicao = aux = 0;
        boolean flagCrescente, flagDecrescente;
        flagCrescente = flagDecrescente = false;
        int contadorMaior, contadorIgual, contadorMenor;
        contadorIgual = contadorMaior = contadorMenor = 0;

        // verifica qual a maior diferenca entre os inteiros do vetor
        // (considerando uma posicao e a proxima a ela)
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] < array[i]) {
                aux = (array[i] - array[i - 1]);
                flagCrescente = true;
            } else if (array[i - 1] > array[i]) {
                aux = (array[i - 1] - array[i]);
                flagDecrescente = true;
            }
            if (diferenca < aux) {
                diferenca = aux;
                posicao = i;
            }
        }

        for (int numero : array) {
            if (numero > x) {
                contadorMaior++;
            } else if (numero < x) {
                contadorMenor++;
            } else {
                contadorIgual++;
            }
        }

        System.out.println("O par é: " + array[posicao - 1] + ", " + array[posicao]);

        if (flagCrescente && flagDecrescente) {
            System.out.println("Nao ordenado");
        } else if (flagCrescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }

        System.out.println(
                "Numeros maiores: " + contadorMaior +
                        ", iguais: " + contadorIgual +
                        ", menores: " + contadorMenor);
    }
}
