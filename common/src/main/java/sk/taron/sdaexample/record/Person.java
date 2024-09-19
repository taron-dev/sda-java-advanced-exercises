package sk.taron.sdaexample.record;

public record Person(String name, int age) {
  public Person(String name) {
    this(name, 18);
  }

  public boolean isAdult(){
    return age >= 18;
  }
}
