package Controller.AMD;

import Interface.IRTX;

public class RX6600 implements IRTX {
  private String name;
  private boolean hasRTX;

  public RX6600() {
    this.name = "RX6600";
    this.hasRTX = true;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public boolean hasRTX() {
    return this.hasRTX;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nTem RTX: " + this.hasRTX;
  }
}
