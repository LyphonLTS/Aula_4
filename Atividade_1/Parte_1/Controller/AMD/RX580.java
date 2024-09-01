package Controller.AMD;

import Interface.INORTX;

public class RX580 implements INORTX {
  private String name;
  private int qtdCores;

  public RX580() {
    this.name = "RX580";
    this.qtdCores = 8;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getQtdCores() {
    return this.qtdCores;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nQuantidade de cores: " + this.qtdCores;
  }
}
