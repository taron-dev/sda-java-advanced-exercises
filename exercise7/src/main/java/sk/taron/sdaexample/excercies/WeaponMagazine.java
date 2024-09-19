package sk.taron.sdaexample.excercies;

import java.util.Stack;

public class WeaponMagazine implements Weapon {

  private final int size;
  private final Stack<String> magazine;

  // Constructor to set the magazine capacity
  public WeaponMagazine(int size) {
    this.size = size;
    this.magazine = new Stack<>();
  }

  // Method to load a bullet into the magazine
  public void loadBullet(String bullet) {
    if (magazine.size() < size) {
      magazine.push(bullet);
      System.out.println("Loaded: " + bullet);
    } else {
      System.out.println("Magazine is full, cannot load more bullets.");
    }
  }

  // Method to check if there is at least one bullet loaded
  public boolean isLoaded() {
    return !magazine.isEmpty();
  }

  // Method to shoot a bullet (removes the last loaded bullet)
  public void shot() {
    if (isLoaded()) {
      System.out.println("Shot: " + magazine.pop());
    } else {
      System.out.println("Empty magazine");
    }
  }

  // Main method for testing
  public static void main(String[] args) {
    WeaponMagazine wm = new WeaponMagazine(5);

    wm.loadBullet("Bullet 1");
    wm.loadBullet("Bullet 2");
    wm.loadBullet("Bullet 3");

    System.out.println("Is loaded? " + wm.isLoaded());

    wm.shot();
    wm.shot();
    wm.shot();
    wm.shot();  // This should print "Empty magazine"
  }
}
