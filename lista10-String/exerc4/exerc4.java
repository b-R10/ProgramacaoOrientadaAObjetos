package exerc4;

public class exerc4 {

  public static String processar(String str) {
    if (str == null) {
      return null;
    } else {
      return str.toUpperCase();
    }
  }

  public static void main(String[] args) {
    System.out.println(processar("Caramba"));
    System.out.println(processar("Pernambuco"));
    System.out.println(processar(""));

  }
}
