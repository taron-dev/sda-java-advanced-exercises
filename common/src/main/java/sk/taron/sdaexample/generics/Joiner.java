package sk.taron.sdaexample.generics;

public class Joiner<T extends Number> {
  private final String separator;

  public Joiner(String separator) {
    this.separator = separator;
  }

  public final String join(T... elements) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < elements.length; i++) {
      if (i > 0) {
        result.append(separator);
      }
      result.append(elements[i]);
    }
    return result.toString();
  }
}
