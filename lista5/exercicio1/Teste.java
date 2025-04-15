public class Teste {
  public static void main(String[] args) {
    Usuario usuario1 = new Usuario(1, "Breno");
    Dispositivo dispositivo1 = new Dispositivo(1, "Celular");

    dispositivo1.setNome("Notebook");
    usuario1.setNome("Theodoro");
    usuario1.setDispositivo(dispositivo1);
    usuario1.trabalhar();
    
    Usuario usuario2 = new Usuario(2, "Ana");
    Dispositivo dispositivo2 = new Dispositivo(1, "Desktop");

    usuario2.setDispositivo(dispositivo2);
    usuario2.trabalhar();

  }
}
