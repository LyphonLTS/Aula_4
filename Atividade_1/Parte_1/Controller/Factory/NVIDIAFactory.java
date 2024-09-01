package Controller.Factory;

import Controller.NVIDIA.GTX1660;
import Controller.NVIDIA.RTX4060;
import Interface.IFactory;
import Interface.INORTX;
import Interface.IRTX;

public class NVIDIAFactory implements IFactory {
  @Override
  public INORTX createGPUWithNORTX() {
    return new GTX1660();
  }

  @Override
  public IRTX createGPUWithRTX() {
    return new RTX4060();
  }
}
