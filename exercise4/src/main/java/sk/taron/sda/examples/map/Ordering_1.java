package sk.taron.sda.examples.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ordering_1 {

  public static void main(String[] args) {
    Map<String, Integer> productPrices = new HashMap<>();
    productPrices.put("Laptop", 1500);
    productPrices.put("Smartphone", 900);
    productPrices.put("Tablet", 400);
    productPrices.put("Smartwatch", 200);
    productPrices.put("Monitor", 300);

    // TODO: Sort the map by price in ascending order.
    // TODO: Print the sorted map.

    // 1. Sort map by values (price)
    List<Map.Entry<String, Integer>> list = new ArrayList<>(productPrices.entrySet());
    list.sort(Map.Entry.comparingByValue());

    // 2. Print sorted map
    System.out.println("Products sorted by price:");
    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(entry.getKey() + ": $" + entry.getValue());
    }
  }
}
