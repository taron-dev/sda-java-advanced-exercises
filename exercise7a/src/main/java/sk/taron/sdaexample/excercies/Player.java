package sk.taron.sdaexample.excercies;

public class Player implements PlayerBehaviour, Oponent {

  private final String name;
  private final Weapon weapon;
  private Integer health;

  public Player(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
    this.health = 2;
  }

  public void loadWeapon() {
     weapon.loadBullet();
  }

  public String getName() {
    return name;
  }

  public Integer getHealth() {
    return health;
  }

  public void shot(Oponent oponent) {
    oponent.hit(weapon.shot());
  }

  public void hit(int damage) {
    health -= damage;
  }

  public String getStatus() {
    return "[" + getName() + ": Health=" + getHealth() + ", Magazine size: "+ weapon.actualMagazineSize() +"]";
  }
}
