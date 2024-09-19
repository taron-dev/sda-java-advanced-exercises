package sk.taron.sdaexample.generics;

public class JoinerMain {

  public static void main(String[] args) {
//    Joiner<String> stringJoiner = new Joiner<>(", ");
//    System.out.println(stringJoiner.join("apple", "banana", "cherry")); // Output: apple, banana, cherry

    Joiner<Integer> intJoiner = new Joiner<>("-");
    System.out.println(intJoiner.join(1, 2, 3, 4)); // Output: 1-2-3-4

    Joiner<Double> doubleJoiner = new Joiner<>("-");
    System.out.println(doubleJoiner.join(1d, 2d, 3d, 4d)); // Output: 1-2-3-4
  }
}
