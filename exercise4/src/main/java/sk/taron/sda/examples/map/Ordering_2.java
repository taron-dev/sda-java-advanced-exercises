package sk.taron.sda.examples.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ordering_2 {
  public static void main(String[] args) {
    HashMap<String, Integer> cityPopulation = new HashMap<>();
    cityPopulation.put("New York", 8419600);
    cityPopulation.put("Los Angeles", 3980400);
    cityPopulation.put("Chicago", 2716000);
    cityPopulation.put("Houston", 2328000);

    // 1. Iterate using entrySet()
    Set<Map.Entry<String, Integer>> setOfValues = cityPopulation.entrySet();
    List<Map.Entry<String, Integer>> listOfValues = new ArrayList<>(cityPopulation.entrySet());

    setOfValues.forEach(entry -> System.out.println("City: " + entry.getKey() + " Population: " + entry.getValue()));
    System.out.println("--------------------------------------");
    // 2. Iterate using keySet()
    Set<String> setOfKeys = cityPopulation.keySet();

    setOfKeys.forEach(key -> {
      Integer population = cityPopulation.get(key);
      System.out.println("City: " + key + " Population: " + population);
    });
    System.out.println("--------------------------------------");
    // 3. Iterate using forEach()

    cityPopulation.forEach((key, value) -> System.out.println("City: " + key + " Population: " + value));
  }
}
