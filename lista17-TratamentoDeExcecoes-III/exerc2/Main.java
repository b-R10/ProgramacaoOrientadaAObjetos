package exerc2;

public class Main {

  public static void main(String[] args) {

    try {
      Metodos.throwExceptionB();
    } catch (ExceptionA exc) {
      System.out.println(exc);
    }

    try {
      Metodos.throwExceptionC();
    } catch (ExceptionA exc) {
      System.out.println(exc);
    }

  }

}
