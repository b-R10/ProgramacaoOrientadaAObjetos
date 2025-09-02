package exerc2;

public class Metodos {

  public static void throwExceptionB() throws ExceptionB {
    try {
      throw new ExceptionB();
    } catch (ExceptionB exc) {
      throw exc;
    }
  }

  public static void throwExceptionC() throws ExceptionC {
    try {
      throw new ExceptionC();
    } catch (ExceptionC exc) {
      throw exc;
    }
  }
}
