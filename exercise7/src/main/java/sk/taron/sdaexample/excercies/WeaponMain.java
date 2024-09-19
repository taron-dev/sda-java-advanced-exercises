package sk.taron.sdaexample.excercies;

import java.util.List;

public class WeaponMain {
  public static void main(String[] args) {
    Weapon weapon1 = new Bow();
    Weapon weapon2 = new Pistol();
    Weapon weapon3 = new MachineGun();

    List.of(weapon1,weapon2,weapon3).forEach(weapon -> {
      weapon.loadBullet("Bullet 1");
      weapon.loadBullet("Bullet 2");
      weapon.loadBullet("Bullet 3");

      System.out.println("Is loaded? " + weapon.isLoaded());

      weapon.shot();
      weapon.shot();
      weapon.shot();
      weapon.shot();
      System.out.println("Is loaded? " + weapon.isLoaded());
    });
  }
}
