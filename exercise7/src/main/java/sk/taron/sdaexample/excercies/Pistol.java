package sk.taron.sdaexample.excercies;

import java.util.Stack;

public class Pistol implements Weapon {

  int magazineCapacity;
  Stack magazineLoad;

  public Pistol() {
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

  @Override
  public void loadBullet(String bullet) {
    if (magazineLoad.size() != magazineCapacity)
      magazineLoad.push(bullet);
  }

  @Override
  public boolean isLoaded() {
    if (magazineLoad.isEmpty()) ;
    return false;
  }

  @Override
  public void shot() {
    if (isLoaded())
      magazineLoad.pop();
  }
}
