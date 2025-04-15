public class Usuario {
  Dispositivo dispositivo;
  int matricula;
  String nome;

  public Usuario(int matricula, String nome){
    this.matricula = matricula;
    this.nome = nome;
  }

  public void setDispositivo(Dispositivo dispositivo){
    this.dispositivo = dispositivo;
  }

  public Dispositivo getDispositivo(){
    return this.dispositivo;
  }

  public void setMatricula(int matricula){
    this.matricula = matricula;
  }

  public int getMatricula(){
    return this.matricula;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void trabalhar(){
    System.out.println(this.nome + " está usando o dispositivo " + this.dispositivo.getNome());
  }
}