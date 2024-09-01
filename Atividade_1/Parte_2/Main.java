import Controller.Factory.AMDFactory;
import Controller.Factory.IntelFactory;
import Controller.Factory.NVIDIAFactory;
import Interface.IFactory;
import Interface.INORTX;
import Interface.IRTX;

class Main {
  public static void main(String[] args) {
    IFactory amdFactory = new AMDFactory();
    IFactory intelFactory = new IntelFactory();
    IFactory nvidiaFactory = new NVIDIAFactory();

    INORTX rx580 = amdFactory.createGPUWithNORTX();
    INORTX a380 = intelFactory.createGPUWithNORTX();
    INORTX gtx1660 = nvidiaFactory.createGPUWithNORTX();

    IRTX rx6600 = amdFactory.createGPUWithRTX();
    IRTX a770 = intelFactory.createGPUWithRTX();
    IRTX rtx4060 = nvidiaFactory.createGPUWithRTX();

    System.out.println(rx580.toString());
    System.out.println(a380.toString());
    System.out.println(gtx1660.toString());
    System.out.println(rx6600.toString());
    System.out.println(a770.toString());
    System.out.println(rtx4060.toString());
  }
}