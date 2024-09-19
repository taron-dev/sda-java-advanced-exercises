package sk.taron.sdaexample;

import java.util.Map;

public class Example3_1 {

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
    int size = map.size();
    int count = 0;

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      count++;
      if (count < size) {
        // Print with a comma at the end
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ",");
      } else {
        // Print the last element with a period at the end
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ".");
      }
    }
  }
}
