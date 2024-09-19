package sk.taron.sdaexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example1_2 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "orange", "Banana", "kiwi");
    System.out.println(caseSensitiveSortListDescending(strings));
  }

  public static List<String> caseSensitiveSortListDescending(List<String> stringList) {
    stringList.sort(Collections.reverseOrder());
    return stringList;
  }


}