package sk.taron.sdaexample.excercies;

public class Bow implements Weapon {

  private boolean isLoaded;
  private String arrow;
  private int numberOfAlreadyLoadedBullets;

  public Bow() {
    this.isLoaded = false;
    numberOfAlreadyLoadedBullets = 0;
  }

  public void loadBullet() {
    if (isLoaded) {
      System.out.println("Magazine is full, cannot load more bullets.");
    } else {
      arrow = "Arrow " + ++numberOfAlreadyLoadedBullets;
      isLoaded = true;
    }
  }

  public boolean isLoaded() {
    return isLoaded;
  }

  public int shot() {
    if (isLoaded()) {
      System.out.println("Shot: " + arrow);
      isLoaded = false;
      arrow = null;
      return 1;
    } else {
      throw new IllegalStateException("Empty magazine");
    }
  }

  @Override
  public int incrementDeterioration() {
    return ++numberOfAlreadyLoadedBullets;
  }

  @Override
  public int actualMagazineSize() {
    return isLoaded ? 1 : 0;
  }
}
