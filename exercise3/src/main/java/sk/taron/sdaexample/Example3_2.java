package sk.taron.sdaexample;

import java.util.Map;
import java.util.stream.Collectors;

public class Example3_2 {

  public static void main(String[] args) {
    Map<String, Integer> fruitPricesMap = Map.of(
        "apple", 10,
        "orange", 15,
        "banana", 5,
        "kiwi", 12
    );

    printMap(fruitPricesMap);
  }

  public static void printMap(Map<String, Integer> map) {
    // Convert each map entry to the desired format
    String result = map.entrySet().stream()
        .map(entry -> "Key: " + entry.getKey() + ", Value: " + entry.getValue())
        .collect(Collectors.joining(",\n", "", "."));

    // Print the result
    System.out.println(result);
  }
}
