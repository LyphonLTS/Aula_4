package Controller.Antarctica;

import Interface.IAgua;

public class Polus implements IAgua {
  private boolean isGaseificada;
  private double price;

  public Polus() {
    this.isGaseificada = true;
    this.price = 4.99;
  }

  @Override
  public boolean isGaseificada() {
    return this.isGaseificada;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Com gás: " + this.isGaseificada + "\nPreço: " + this.price;
  }
}
