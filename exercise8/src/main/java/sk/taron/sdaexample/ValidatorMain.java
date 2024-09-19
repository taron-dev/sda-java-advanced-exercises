package sk.taron.sdaexample;

public class ValidatorMain {

  public static void main(String[] args) {
    // Example Parcel: dimensions sum exceeds 300, and weight is too high for express
    Parcel parcel = new Parcel(150, 100, 60, 16.0f, true);

    // Validator
    ParcelValidator validator = new ParcelValidator();

    // Validate the parcel
    if (validator.validate(parcel)) {
      System.out.println("Parcel is valid.");
    } else {
      System.out.println("Parcel is invalid.");
    }
  }
}
