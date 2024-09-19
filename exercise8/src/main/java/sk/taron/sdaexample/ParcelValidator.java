package sk.taron.sdaexample;

public class ParcelValidator implements Validator {

  @Override
  public boolean validate(Parcel input) {
    StringBuilder errorMessages = new StringBuilder();
    boolean isValid = true;

    // Check if any dimension is less than 30
    if (input.getX() < 30 || input.getY() < 30 || input.getZ() < 30) {
      errorMessages.append("Each dimension must be at least 30.\n");
      isValid = false;
    }

    // Check if the sum of dimensions exceeds 300
    if (input.getX() + input.getY() + input.getZ() > 300) {
      errorMessages.append("The sum of dimensions (x + y + z) must not exceed 300.\n");
      isValid = false;
    }

    // Check the weight limit based on isExpress
    if (input.isExpress()) {
      if (input.getWeight() > 15.0) {
        errorMessages.append("For express parcels, the weight must not exceed 15.0.\n");
        isValid = false;
      }
    } else {
      if (input.getWeight() > 30.0) {
        errorMessages.append("For non-express parcels, the weight must not exceed 30.0.\n");
        isValid = false;
      }
    }

    // Print errors if any
    if (!isValid) {
      System.out.println("Validation failed for the following reasons:");
      System.out.println(errorMessages);
    }

    return isValid;
  }
}
