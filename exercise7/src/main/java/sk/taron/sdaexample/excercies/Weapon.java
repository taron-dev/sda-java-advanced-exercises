package sk.taron.sdaexample.excercies;

public interface Weapon {

  /**
   * Adding a cartridge to the magazine,
   * does not allow loading more cartridges than the capacity of the magazine.
   * @param bullet the name of the bullet
   */
  void loadBullet(String bullet);

  /**
   * Weapon is loaded if at least one cartridge is in magazine.
   * @return true if weapon is loaded false otherwise
   */
  boolean isLoaded();

  /**
   * Each call shots one bullet (prints string value in console)
   * and prepares the next one.
   * If there are no more cartridges, it prints "empty magazine" in the console.
   */
  void shot();
}
