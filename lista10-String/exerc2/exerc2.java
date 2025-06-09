public class exerc2 {
  
  public static void metodo(String str){
    if(str.length() < 8){
      System.out.println("Erro!");
      return;
    }
    String newStr = str.substring(0, 2) + str.substring(str.length()-2, str.length());
    System.out.println("Nova string: " + newStr);
  }

  public static void main(String[] args) {
    metodo("Paranoia");
    metodo("jogo");
    metodo("Onomatopéia");
  }
}
