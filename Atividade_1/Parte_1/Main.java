import Controller.Factory.AMDFactory;
import Controller.Factory.NVIDIAFactory;
import Interface.IFactory;
import Interface.INORTX;
import Interface.IRTX;

class Main {
  public static void main(String[] args) {
    IFactory amdFactory = new AMDFactory();
    IFactory nvidiaFactory = new NVIDIAFactory();

    INORTX rx580 = amdFactory.createGPUWithNORTX();
    INORTX gtx1660 = nvidiaFactory.createGPUWithNORTX();

    IRTX rx6600 = amdFactory.createGPUWithRTX();
    IRTX rtx4060 = nvidiaFactory.createGPUWithRTX();

    System.out.println(rx580.toString());
    System.out.println(gtx1660.toString());
    System.out.println(rx6600.toString());
    System.out.println(rtx4060.toString());
  }
}