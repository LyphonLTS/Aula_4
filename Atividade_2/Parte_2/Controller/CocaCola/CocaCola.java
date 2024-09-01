package Controller.CocaCola;

import Interface.IRefrigerante;

public class CocaCola implements IRefrigerante {
  private String name;
  private double qtdAcucar;
  private double price;

  public CocaCola() {
    this.name = "CocaCola";
    this.qtdAcucar = 46;
    this.price = 9.9;
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
