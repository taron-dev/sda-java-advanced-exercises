package sk.taron.sdaexample.comparator;

public class Person {
  String name;
  int age;
  double height;

  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Person{name='" + name + "', age=" + age + ", height=" + height + "}";
  }
}
