package sk.taron.sdaexample.excercies;

/**
 * Describes player behaviour.
 */
public interface PlayerBehaviour {

  /**
   * Loads weapon.
   */
  void loadWeapon();

  /**
   * Hits the oponent.
   *
   * @param oponent oponent to hit
   */
  void shot(Oponent oponent);

  /**
   * Gets current health value.
   */
  Integer getHealth();

  /**
   * Gets the name.
   */
  String getName();

  String getStatus();
}
