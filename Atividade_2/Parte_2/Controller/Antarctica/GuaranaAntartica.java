package Controller.Antarctica;

import Interface.IRefrigerante;

public class GuaranaAntartica implements IRefrigerante {
  private String name;
  private double qtdAcucar;
  private double price;

  public GuaranaAntartica() {
    this.name = "GuaranaAntartica";
    this.qtdAcucar = 37;
    this.price = 7.5;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getAcucar() {
    return this.qtdAcucar;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nQuantidade de açúcar: " + this.qtdAcucar + "mg/L" + "\nPreço: " + this.price;
  }
}
