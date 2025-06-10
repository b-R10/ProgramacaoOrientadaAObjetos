package exerc3;

import java.util.ArrayList;

public class Teste {

  public static void main(String[] args) {

    ArrayList<Mensagem> lista = new ArrayList<>();
    lista.add(new Mensagem("Breno"));
    lista.add(new MensagemTexto("Pamela"));
    lista.add(new MensagemImagem("imagem"));

    for (int i = 0; i < lista.size(); ++i) {
      System.out.println(lista.get(i));
    }
  }

}
