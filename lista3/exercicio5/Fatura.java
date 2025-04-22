package exercicio5;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeCompradaDoItem;
    private double preco;

    public Fatura(String numero, String descricao, int quantidadeCompradaDoItem, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeCompradaDoItem = quantidadeCompradaDoItem;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeCompradaDoItem() {
        return quantidadeCompradaDoItem;
    }

    public void setQuantidadeCompradaDoItem(int quantidadeCompradaDoItem) {
        this.quantidadeCompradaDoItem = quantidadeCompradaDoItem;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtdeFatura() {
        return (quantidadeCompradaDoItem * preco);
    }

}
