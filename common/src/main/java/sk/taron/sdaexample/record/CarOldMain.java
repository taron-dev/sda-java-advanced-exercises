package sk.taron.sdaexample.record;

public class CarOldMain {

  public static void main(String[] args) {
    CarOld carOld = new CarOld("Skoda", "Octavia", 1992);

    CarOld car2 = new CarOld(carOld.getBrand(), carOld.getModel(), 1993);

    System.out.println("Ukladam do db: " + car2);
  }
}
