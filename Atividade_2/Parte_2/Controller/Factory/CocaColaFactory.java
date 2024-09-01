package Controller.Factory;

import Controller.CocaCola.Ciel;
import Controller.CocaCola.CocaCola;
import Interface.IAgua;
import Interface.IFactory;
import Interface.IRefrigerante;

public class CocaColaFactory implements IFactory {
  @Override
  public IAgua createAgua() {
    return new Ciel();
  }

  @Override
  public IRefrigerante createRefrigerante() {
    return new CocaCola();
  }
}
