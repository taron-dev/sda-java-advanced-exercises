package sk.taron.sdaexample.record;

public record Car(String brand, String model, int year) {
  public Car {
    if (year() < 1990) {
      throw new IllegalArgumentException("Invalid year for a car!");
    }
  }
}
