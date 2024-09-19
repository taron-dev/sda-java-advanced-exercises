package sk.taron.sdaexample.excercies;

import java.util.Stack;

public class Pistol_1 implements Weapon {

  private int magazineCapacity;
  private Stack magazineLoad;
  private int deterioration = 1;

  public Pistol_1() {
    this.magazineCapacity = 12;
    this.magazineLoad = new Stack<>();
  }

  public int getMagazineCapacity() {
    return magazineCapacity;
  }

  public void setMagazineCapacity(int magazineCapacity) {
    this.magazineCapacity = magazineCapacity;
  }

  public Stack getMagazineLoad() {
    return magazineLoad;
  }

  public void setMagazineLoad(Stack magazineLoad) {
    this.magazineLoad = magazineLoad;
  }

  public int getDeterioration() {
    return deterioration;
  }

  public void setDeterioration(int deterioration) {
    this.deterioration = deterioration;
  }

  @Override
  public void loadBullet() {
    if (magazineLoad.size() != magazineCapacity) {
      magazineLoad.push("bullet " + incrementDeterioration());
    } else System.out.println("magazine full - can't load bullet");
  }

  @Override
  public boolean isLoaded() {
    if (magazineLoad.isEmpty()) {
      return false;
    }
    return true;
  }

  @Override
  public int shot() throws IllegalStateException {
    if (!magazineLoad.isEmpty()) {
      System.out.println("firing " + magazineLoad.pop());
      return 1;
    } else throw new IllegalStateException();
  }

  @Override
  public int incrementDeterioration() {
    return deterioration++;
  }

  @Override
  public int actualMagazineSize() {
    return magazineLoad.size();
  }
}
