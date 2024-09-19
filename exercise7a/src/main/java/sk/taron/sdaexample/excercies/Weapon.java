package sk.taron.sdaexample.excercies;

public interface Weapon {

  /**
   * Adding a cartridge to the magazine,
   * does not allow loading more cartridges than the capacity of the magazine.
   */
  void loadBullet();

  /**
   * Weapon is loaded if at least one cartridge is in magazine.
   * @return true if weapon is loaded false otherwise
   */
  boolean isLoaded();

  /**
   * Each call shots one bullet (prints string value in console).
   * If there are no more cartridges, it throws exception with appropriate message.
   *
   * @return damage
   */
  int shot() throws IllegalArgumentException;

  /**
   * Increment weapon deterioration.
   * @return new value
   */
  int incrementDeterioration();

  /**
   * Provides actual size of loaded magazine.
   */
  int actualMagazineSize();

}
