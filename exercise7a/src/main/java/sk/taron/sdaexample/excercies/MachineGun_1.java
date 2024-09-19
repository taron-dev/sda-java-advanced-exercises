package sk.taron.sdaexample.excercies;

import java.util.LinkedList;
import java.util.Queue;

public class MachineGun_1 implements Weapon {

  private Queue<String> magazine;
  final int magazineCapacity = 500;
  private String bullet = "Bullet ";
  private int incrementDeterioration = 0;

  public MachineGun_1() {
    this.magazine = new LinkedList<>();
  }

  public Queue<String> getMagazine() {
    return magazine;
  }

  public int getIncrementDeterioration() {
    return incrementDeterioration;
  }

  @Override
  public void loadBullet() {
    if (magazine.size() < magazineCapacity) {
      magazine.add(bullet + incrementDeterioration());
    }
  }

  @Override
  public boolean isLoaded() {
    if (magazine.isEmpty()) {
      return false;
    }
    return true;
  }

  @Override
  public int shot() throws IllegalStateException {
    if (magazine.isEmpty()) {
      throw new IllegalStateException();
    } else if (magazine.size()==1) {
      System.out.println(magazine.poll());
      return 1;
    } else {
      for (int i = 0; i < 2; i++) {
        System.out.println(magazine.poll());
      }
      return 2;
    }
  }

  @Override
  public int incrementDeterioration() {
    incrementDeterioration++;
    return incrementDeterioration;
  }

  @Override
  public int actualMagazineSize() {
    return magazine.size();
  }

  @Override
  public String toString() {
    return "MachineGun{" +
        "magazine=" + magazine +
        ", magazineCapacity=" + magazineCapacity +
        '}';
  }
}
