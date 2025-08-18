enum Transporte {
  CARRO(65), CAMINHAO(55), AVIAO(600), TREM(70), BARCO(22);

  private final int velocidade;

  private Transporte(int v) {
    this.velocidade = v;
  }

  int getVelocidade() {
    return this.velocidade;
  }

}