package sk.taron.sda.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage implements StorageManager {
  public static void main(String[] args) {
    StorageManager storage = new Storage();
    storage.addToStorage("Slovensko", "Mala Fatra");
    storage.printValues("Slovensko");
    storage.addToStorage("Slovensko", "Vysoke Tatry");
    storage.addToStorage("Slovensko", "Rysy");
    storage.printValues("Slovensko");
    storage.addToStorage("Cesko", "Milesovka");
    storage.addToStorage("Polsko", "Rysy");

    System.out.println("Milesovka");
    System.out.println(storage.findValues("Milesovka"));
    System.out.println("Rysy");
    System.out.println(storage.findValues("Rysy"));
  }


  // Private Map to store multiple values for each key
  private final Map<String, Collection<String>> storage;

  // Public constructor to initialize the storage map
  public Storage() {
    this.storage = new HashMap<>();
  }

  // Method to add a value to the storage under a specific key
  public void addToStorage(String key, String value) {
    // If the key doesn't exist, initialize a new list for it
    //storage.computeIfAbsent(key, k -> new ArrayList<>()).add(value);

    Collection<String> current = storage.get(key);
    if(current == null) {
      current = new ArrayList<>();
    }
    current.add(value);
    storage.put(key, current);
  }

  // Method to print all values stored under a given key
  public void printValues(String key) {
    Collection<String> values = storage.get(key);
    if (values != null) {
      System.out.println("Values under key \"" + key + "\": " + values);
    } else {
      System.out.println("No values found for key \"" + key + "\".");
    }
  }

  // Method to find and print all keys that have a specific value
  public Collection<String> findValues(String value) {
    List<String> keysWithValue = new ArrayList<>();

    // Iterate through the map to find keys that contain the specified value
    for (Map.Entry<String, Collection<String>> entry : storage.entrySet()) {
      if (entry.getValue().contains(value)) {
        keysWithValue.add(entry.getKey());
      }
    }

    if (!keysWithValue.isEmpty()) {
      System.out.println("Keys containing the value \"" + value + "\": " + keysWithValue);
    } else {
      System.out.println("No keys found with the value \"" + value + "\".");
    }

    return keysWithValue;
  }
}
