package sk.taron.sdaexample;

public class Parcel {
  private final int x;
  private final int y;
  private final int z;
  private final float weight;
  private final boolean isExpress;

  // Constructor
  public Parcel(int x, int y, int z, float weight, boolean isExpress) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.weight = weight;
    this.isExpress = isExpress;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  public float getWeight() {
    return weight;
  }

  public boolean isExpress() {
    return isExpress;
  }
}
