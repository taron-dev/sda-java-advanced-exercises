package sk.taron.sdaexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2_2 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "orange", "Banana", "kiwi");
    System.out.println(caseInsensitiveSortListDescending(strings));
  }

  public static List<String> caseInsensitiveSortListDescending(List<String> stringList) {
    stringList.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    return stringList;
  }


}