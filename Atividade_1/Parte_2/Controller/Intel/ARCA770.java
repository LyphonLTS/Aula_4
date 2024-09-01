package Controller.Intel;

import Interface.IRTX;

public class ARCA770 implements IRTX {
  private String name;
  private boolean hasRTX;

  public ARCA770() {
    this.name = "A770";
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
