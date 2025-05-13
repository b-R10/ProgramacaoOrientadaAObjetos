public class Array {
    public static void main(String[] args) {
        int[] array = { 32, 10, 50, 2, 20, 15, 12, 28, 15, 45 };
        System.out.println("Indice  Valor");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(i + "\t" + array[i]);
        }
    }
}