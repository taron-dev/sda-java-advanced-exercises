package sk.taron.sdaexample.excercies;

import java.util.LinkedList;
import java.util.Queue;

public class MachineGun implements Weapon{

  Queue<String> magazine;
  final int magazineCapacity = 500;

  public MachineGun() {
    this.magazine =new LinkedList<>();
  }

  @Override
  public void loadBullet(String bullet) {
    if(magazine.size()<magazineCapacity){
      magazine.add(bullet);
    }
  }

  @Override
  public boolean isLoaded() {
    if(magazine.isEmpty()){
      return false;
    }
    return true;
  }

  @Override
  public void shot() {
    if(magazine.isEmpty()){
      System.out.println("Out of Pew Pews");
    } else {
      System.out.println("Many Pew Pews");
      for (int i = 0; i <25 ; i++) {
        magazine.remove();
      }
    }
  }

  @Override
  public String toString() {
    return "MachineGun{" +
        "magazine=" + magazine +
        ", magazineCapacity=" + magazineCapacity +
        '}';
  }
}
