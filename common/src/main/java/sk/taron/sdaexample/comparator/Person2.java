package sk.taron.sdaexample.comparator;

import java.util.Objects;

public class Person2 {
  String name;
  int age;
  double height;

  public Person2(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Person2{name='" + name + "', age=" + age + ", height=" + height + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, height);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Person2)) {
      return false;
    }
    Person2 person2 = (Person2) obj;

    return Objects.equals(this.name, person2.name) &&
        Objects.equals(this.age, person2.age) &&
        Objects.equals(this.height, person2.height);
  }
}
