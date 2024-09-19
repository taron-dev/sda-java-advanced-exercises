package sk.taron.sdaexample.excercies;

import java.util.Stack;

public class Pistol implements Weapon {

  private final int size;
  private final Stack<String> magazine;
  private int numberOfAlreadyLoadedBullets;

  public Pistol() {
    this.size = 6;
    this.magazine = new Stack<>();
  }

  @Override
  public void loadBullet() {
    if (magazine.size() < size) {
      String bullet = "Pistol bullet " + incrementDeterioration();
      magazine.push(bullet);
      System.out.println("Loaded bullet: " + bullet);
    } else {
      System.out.println("Magazine is full. Cannot load more bullets.");
    }
  }

  @Override
  public boolean isLoaded() {
    return !magazine.isEmpty();
  }

  @Override
  public int shot() {
    if (isLoaded()) {
      System.out.println("Shot: " + magazine.pop());
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
    return magazine.size();
  }

}
