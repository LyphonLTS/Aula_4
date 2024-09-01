package Controller.Factory;

import Controller.AMD.RX580;
import Controller.AMD.RX6600;
import Interface.IFactory;
import Interface.INORTX;
import Interface.IRTX;

public class AMDFactory implements IFactory {
  @Override
  public INORTX createGPUWithNORTX() {
    return new RX580();
  }

  @Override
  public IRTX createGPUWithRTX() {
    return new RX6600();
  }
}
