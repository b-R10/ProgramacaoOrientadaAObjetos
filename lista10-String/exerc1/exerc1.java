public class exerc1 {

  public static void metodo(String str) {
    System.out.println("a) " + str.length());
    int vogais = 0;
    String vgs = "aeiou";
    for (int i = 0; i < str.length(); ++i) {
      char c = Character.toLowerCase(str.charAt(i));
      for (int j = 0; j < 5; ++j) {
        if (c == vgs.charAt(j)) {
          vogais++;
        }
      }
    }
    System.out.println("b) " + vogais);
  }

  public static void main(String[] args) {
    metodo("Estudante");
    metodo("Sou estudante");
    metodo("Unicentro");
  }

}