package Controller.Factory;

import Controller.Mineiro.Cristal;
import Controller.Mineiro.GuaranaMineiro;
import Interface.IAgua;
import Interface.IFactory;
import Interface.IRefrigerante;

public class Mineiro implements IFactory {
  @Override
  public IAgua createAgua() {
    return new Cristal();
  }

  @Override
  public IRefrigerante createRefrigerante() {
    return new GuaranaMineiro();
  }
}
