package com.geometria.formas;

public class Circulo {

  private final double PI = 3.1415;
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double calcularArea(double raio) {
    return PI * raio * raio;
  }

}