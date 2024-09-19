package sk.taron.sdaexample.excercies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WeaponMain {
  private static final List<Player> PLAYERS_LIST = new ArrayList<>();

  public static void main(String[] args) {
    String weaponOptions = " (Bow [0], Pistol [1], MachineGun [2]): ";
    String moveOption = "(Load [0], Shot [1]): ";

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of players: ");
    int players = scanner.nextInt();

    for (int i = 0; i < players; i++) {
      System.out.print("Choose number of weapon for Player " + (i + 1) + weaponOptions);
      int weaponNumber = scanner.nextInt();
      PLAYERS_LIST.add(new Player("Player " + (i + 1), getWeaponForNumber(weaponNumber)));
    }
    boolean isEnoughPlayersAlive = true;

    while (isEnoughPlayersAlive){
      PLAYERS_LIST.forEach(player -> {
        if(player.getHealth() < 1){
          return;
        }
        System.out.println(player.getName() + " select move " + moveOption);
        int moveNumber = scanner.nextInt();
        executeMove(scanner, player, moveNumber);
        System.out.println(getCurrentStatus());
      });
      isEnoughPlayersAlive = PLAYERS_LIST.stream().filter(p -> p.getHealth() > 0).count() > 1;
    }
  }

  private static Weapon getWeaponForNumber(int number) {
    switch (number) {
      case 1: return new Pistol_1();
      case 2: return new MachineGun_1();
      default: return new Bow_1();
    }
  }

  private static void executeMove(Scanner scanner, Player player, int moveNumber){
    switch (moveNumber) {
      case 1: performShot(scanner, player); break;
      default: player.loadWeapon();
    }
  }

  private static void performShot(Scanner scanner, Player player){
    System.out.println(player.getName() + " select oponent " + getOponentOffer());
    int oponentNumber = scanner.nextInt();
    player.shot(PLAYERS_LIST.get(oponentNumber-1));
  }

  private static String getOponentOffer(){
    return  "(" + IntStream.range(0, PLAYERS_LIST.size())
        .mapToObj(index -> PLAYERS_LIST.get(index).getName() + "[" + (index + 1) + "]")
        .collect(Collectors.joining(", ")) + ")";
  }

  private static String getCurrentStatus(){
    return PLAYERS_LIST.stream().map(Player::getStatus)
        .collect(Collectors.joining(", "));
  }
}
