package com.geometria.formas;

public class Quadrado {

  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  public double cacularArea(double lado) {
    return lado * lado;
  }

}