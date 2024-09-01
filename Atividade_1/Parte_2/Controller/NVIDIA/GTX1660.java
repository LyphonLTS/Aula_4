package Controller.NVIDIA;

import Interface.INORTX;

public class GTX1660 implements INORTX {
  private String name;
  private int qtdCores;

  public GTX1660() {
    this.name = "GTX1660";
    this.qtdCores = 6;
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
