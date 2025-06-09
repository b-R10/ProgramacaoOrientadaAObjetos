public class ItemApp {
  public static void main(String[] args) {
    Video v1 = new Video("titulo1", "diretor1", 3);
    CD cd1 = new CD("titulo2", "artista2", 5);
    System.out.println("filme");
    v1.print();
    cd1.print();
  }
}
