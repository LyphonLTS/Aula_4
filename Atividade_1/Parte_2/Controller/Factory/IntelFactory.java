package Controller.Factory;

import Controller.Intel.ARCA380;
import Controller.Intel.ARCA770;
import Interface.IFactory;
import Interface.INORTX;
import Interface.IRTX;

public class IntelFactory implements IFactory {
  @Override
  public INORTX createGPUWithNORTX() {
    return new ARCA380();
  }

  @Override
  public IRTX createGPUWithRTX() {
    return new ARCA770();
  }
}
