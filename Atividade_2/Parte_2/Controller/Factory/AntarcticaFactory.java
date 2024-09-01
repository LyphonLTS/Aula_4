package Controller.Factory;

import Controller.Antarctica.Polus;
import Controller.Antarctica.GuaranaAntartica;
import Interface.IFactory;
import Interface.IAgua;
import Interface.IRefrigerante;

public class AntarcticaFactory implements IFactory {
  @Override
  public IAgua createAgua() {
    return new Polus();
  }

  @Override
  public IRefrigerante createRefrigerante() {
    return new GuaranaAntartica();
  }
}
