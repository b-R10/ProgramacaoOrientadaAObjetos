

public class Teste {
  public static void main(String[] args) {
    Usuario usuario1 = new Usuario(1, "Breno");
    Dispositivo dispositivo1 = new Dispositivo(1, "Celular");

    usuario1.setDispositivo(dispositivo1);
    usuario1.trabalhar();
    
    Usuario usuario2 = new Usuario(1, "Onerb");
    Dispositivo dispositivo2 = new Dispositivo(1, "Computador");

    usuario2.setDispositivo(dispositivo2);
    usuario2.trabalhar();

    usuario1.setDispositivo(usuario2.getDispositivo());
    usuario1.setNome(usuario2.getNome());

    usuario1.trabalhar();
  }
}
