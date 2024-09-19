package sk.taron.sdaexample;

import java.util.Arrays;
import java.util.List;

public class Example1_1 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "orange", "Banana", "kiwi");
    System.out.println(caseSensitiveSortListDescending(strings));
  }

  public static List<String> caseSensitiveSortListDescending(List<String> stringList) {
    // Implement a basic bubble sort algorithm to sort the list from Z to A
    int n = stringList.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (stringList.get(j).compareTo(stringList.get(j + 1)) < 0) {
          // Swap stringList[j] and stringList[j + 1]
          String temp = stringList.get(j);
          stringList.set(j, stringList.get(j + 1));
          stringList.set(j + 1, temp);
        }
      }
    }
    return stringList;
  }

}