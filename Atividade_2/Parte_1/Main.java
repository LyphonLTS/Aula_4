import Controller.Factory.CocaColaFactory;
import Controller.Factory.Mineiro;
import Interface.IAgua;
import Interface.IFactory;
import Interface.IRefrigerante;

class Main {
  public static void main(String[] args) {
    IFactory cocacolaFactory = new CocaColaFactory();
    IFactory mineiroFactory = new Mineiro();

    IAgua cielAgua = cocacolaFactory.createAgua();
    IAgua cristalAgua = mineiroFactory.createAgua();

    IRefrigerante cocacolaRefrigerante = cocacolaFactory.createRefrigerante();
    IRefrigerante mineiroRefrigerante = mineiroFactory.createRefrigerante();

    System.out.println(cielAgua.toString());
    System.out.println(cristalAgua.toString());
    System.out.println(cocacolaRefrigerante.toString());
    System.out.println(mineiroRefrigerante.toString());
  }
}