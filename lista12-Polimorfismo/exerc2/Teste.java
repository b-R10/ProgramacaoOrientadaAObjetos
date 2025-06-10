package exerc2;

public class Teste {
  
  public static void main(String[] args) {
      
    Pessoa p1 = new Pessoa("Breno");
    Funcionario f1 = new Funcionario("Pamela", 1000.00);
    Gerente g1 = new Gerente("Mateus", 1500.00, 1);
    
    System.out.println(p1);
    System.out.println(f1);
    System.out.println(g1);

  }
  
}
