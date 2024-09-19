package sk.taron.sdaexample.record;

public record Rectangle(double width, double height) {

  public Rectangle {
    if(width <=0 || height <=0) {
      throw new IllegalArgumentException();
    }
  }

  public double area() {
    return width * height;
  }
}
