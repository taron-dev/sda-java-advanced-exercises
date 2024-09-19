package sk.taron.sdaexample.excercies;

public class Bow_1 implements Weapon{
  private boolean isLoaded;
  private int deterioration;

  //constructor
  public Bow_1() {
    this.isLoaded = false;
    this.deterioration = 0;
  }

  @Override
  public void loadBullet() {
    isLoaded = true;
    incrementDeterioration();
  }

  @Override
  public boolean isLoaded() {
    return isLoaded;
  }

  @Override
  public int shot() throws IllegalStateException {
    if (isLoaded) {
      System.out.println("Bow " + deterioration + ": Shot");
      isLoaded = false;
    } else {
      throw new IllegalStateException("Not loaded");
    }
    return 1;
  }

  @Override
  public int incrementDeterioration() {
    deterioration++;
    return deterioration;
  }

  @Override
  public int actualMagazineSize() {
    return isLoaded ? 1 : 0;
  }
}
