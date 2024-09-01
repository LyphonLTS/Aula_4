package Controller.CocaCola;

import Interface.IAgua;

public class Ciel implements IAgua {
  private boolean isGaseificada;
  private double price;

  public Ciel() {
    this.isGaseificada = false;
    this.price = 3.99;
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
