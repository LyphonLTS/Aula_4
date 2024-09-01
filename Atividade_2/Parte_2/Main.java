import Controller.Factory.CocaColaFactory;
import Controller.Factory.Mineiro;
import Controller.Factory.AntarcticaFactory;
import Interface.IAgua;
import Interface.IFactory;
import Interface.IRefrigerante;

class Main {
  public static void main(String[] args) {
    IFactory cocacolaFactory = new CocaColaFactory();
    IFactory mineiroFactory = new Mineiro();
    IFactory antarcticaFactory = new AntarcticaFactory();

    IAgua cielAgua = cocacolaFactory.createAgua();
    IAgua cristalAgua = mineiroFactory.createAgua();
    IAgua polusAgua = antarcticaFactory.createAgua();

    IRefrigerante cocacolaRefrigerante = cocacolaFactory.createRefrigerante();
    IRefrigerante mineiroRefrigerante = mineiroFactory.createRefrigerante();
    IRefrigerante antarcticaRefrigerante = antarcticaFactory.createRefrigerante();

    System.out.println(cielAgua.toString());
    System.out.println(cristalAgua.toString());
    System.out.println(polusAgua.toString());
    System.out.println(cocacolaRefrigerante.toString());
    System.out.println(mineiroRefrigerante.toString());
    System.out.println(antarcticaRefrigerante.toString());
  }
}