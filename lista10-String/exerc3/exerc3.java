package exerc3;

public class exerc3 {
  
  public static void metodo(String str1, String str2){
    System.out.println("Comparacao equals)" + str1.equals(str2));
    System.out.println("Comparacao equalsIgnoreCase)" + str1.equals(str2));
  }

  public static void main(String[] args) {
    metodo("Medo", "Perola");
    metodo("Casa", "Casarao");
    metodo("Casa", "Casa");
    metodo("Rasa", "rasa");
  }
}
 