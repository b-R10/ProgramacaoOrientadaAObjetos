
public class Dispositivo {
  int codigo;
  String nome;

  public Dispositivo(int codigo, String nome){
    this.codigo = codigo;
    this.nome = nome;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public int getCodigo(){
    return this.codigo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void usar(){
    System.out.println("Usando o dispositivo: " + this.nome);
  }
}
