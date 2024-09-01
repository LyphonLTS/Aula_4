package Controller.Intel;

import Interface.INORTX;

public class ARCA380 implements INORTX {
  private String name;
  private int qtdCores;

  public ARCA380() {
    this.name = "A380";
    this.qtdCores = 4;
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
