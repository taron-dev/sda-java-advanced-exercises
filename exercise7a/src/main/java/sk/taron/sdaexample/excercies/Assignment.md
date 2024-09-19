# Exercise 7a assignment

Implement Weapon interface for different weapons:
- bow
- pistol
- machine gun

## TODOs
1. Each weapon should keep information about deterioration of the weapon.
It's increased by every loaded bullet by one.
In order to print message with number when shooting e.g. "Bullet 1", "Bullet 2".

2. Update shot method in Weapon interface to following:
    ```
   /**
   * Each call shots one bullet (prints string value in console).
   * If there are no more cartridges, it throws exception with appropriate message.
   *
   * @return damage
   */
    int shot() throws IllegalArgumentException;
    ```
3. Create class `Player` implementing `PlayerBehaviour` and `Oponent` interface.
In order to `Player` be created it requires **name** and **weapon**.  
After instantiation every player has health value set to **3**.