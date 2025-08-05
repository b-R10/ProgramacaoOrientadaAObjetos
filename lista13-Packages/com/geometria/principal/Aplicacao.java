package com.geometria.principal;

import com.geometria.formas.Circulo;
import com.geometria.formas.Quadrado;

public class Aplicacao {

  public static void main(String[] args) {
    Quadrado quadrado1 = new Quadrado(3.0);
    Circulo circulo1 = new Circulo(5.0);

    System.out.println("Area do quadrado: " + quadrado1.calcularArea());
    System.out.println("Area do circulo: " + circulo1.calcularArea());
  }

}
