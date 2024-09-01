package Controller.NVIDIA;

import Interface.IRTX;

public class RTX4060 implements IRTX {
  private String name;
  private boolean hasRTX;

  public RTX4060() {
    this.name = "GTX4060";
    this.hasRTX = false;
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
