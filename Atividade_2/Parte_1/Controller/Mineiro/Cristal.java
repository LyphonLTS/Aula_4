package Controller.Mineiro;

import Interface.IAgua;

public class Cristal implements IAgua {
  private boolean isGaseificada;
  private double price;

  public Cristal() {
    this.isGaseificada = false;
    this.price = 3.89;
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
