package exercicio5;

public class UsaFatura {
  public static void main(String[] args) {
    Fatura fatura1 = new Fatura("1", "celular", 2, 1000.00);
    Fatura fatura2 = new Fatura("1", "celular", 2, 1000.00);

    // testando getters
    System.out.println("Imprimir dados da fatura 1");
    System.out.println(
        "numero: " + fatura1.getNumero()
            + "\ndescricao: " + fatura1.getDescricao()
            + "\nquantidade: " + fatura1.getQuantidadeCompradaDoItem()
            + "\npreco: " + fatura1.getPreco()
            + "\nquantidade fatura: " + fatura1.getQtdeFatura());

    System.out.println("Imprimir dados da fatura 2");
    System.out.println(
        "numero: " + fatura2.getNumero()
            + "\ndescricao: " + fatura2.getDescricao()
            + "\nquantidade: " + fatura2.getQuantidadeCompradaDoItem()
            + "\npreco: " + fatura2.getPreco()
            + "\nquantidade fatura: " + fatura2.getQtdeFatura());

    // testando setters
    fatura2.setNumero("3");
    fatura2.setDescricao("Fone de ouvido");
    fatura2.setQuantidadeCompradaDoItem(3);
    fatura2.setPreco(150.00);

    System.out.println("Imprimir dados da fatura 2 alterada");
    System.out.println(
        "numero: " + fatura2.getNumero()
            + "\ndescricao: " + fatura2.getDescricao()
            + "\nquantidade: " + fatura2.getQuantidadeCompradaDoItem()
            + "\npreco: " + fatura2.getPreco()
            + "\nquantidade fatura: " + fatura2.getQtdeFatura());
    
  }
}
