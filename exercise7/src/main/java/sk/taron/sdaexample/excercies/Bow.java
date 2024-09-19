package sk.taron.sdaexample.excercies;

public class Bow implements Weapon {
  private boolean isLoaded;

  //constructor
  public Bow() {
    this.isLoaded = false;
  }

  @Override
  public void loadBullet(String bullet) {
    isLoaded = true;
  }

  @Override
  public boolean isLoaded() {
    return isLoaded;
  }

  @Override
  public void shot() {
    if (isLoaded) {
      System.out.println("Shot");
      isLoaded = false;
    } else {
      System.out.println("Not loaded");
    }
  }
}
