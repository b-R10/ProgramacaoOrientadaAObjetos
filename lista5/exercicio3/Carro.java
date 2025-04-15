package exercicio3;

public class Carro {
  private String marca;
  private String modelo;
  private String fabricante;
  private Motor motor;
  private Bancos banco;

  public Carro(String marca, String modelo, String fabricante, Motor motor, Bancos banco) {
    this.marca = marca;
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.motor = motor;
    this.banco = banco;
  }

  public String getTipoMotor(){
    return this.motor.getTipo();
  }

  public String getBancoFabricante(){
    return this.banco.getFabricante();
  }

  @Override
  public String toString(){
    return (
      "Fabricante: " + this.fabricante +
      ", Marca: " + this.marca +
      ", Modelo: " + this.modelo + 
      ", Tipo de motor: " + this.motor.getTipo() +
      ", Fabricante dos bancos: " + this.banco.getFabricante()
    );
  }

}