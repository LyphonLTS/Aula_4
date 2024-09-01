package Controller.Mineiro;

import Interface.IRefrigerante;

public class GuaranaMineiro implements IRefrigerante {
  private String name;
  private double qtdAcucar;
  private double price;

  public GuaranaMineiro() {
    this.name = "Mineiro";
    this.qtdAcucar = 40;
    this.price = 6.9;
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
