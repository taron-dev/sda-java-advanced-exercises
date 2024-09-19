package sk.taron.sdaexample.record;

public class RecordMain {
  public static void main(String[] args) {
    Person person = new Person("Tatko Smolko", 180);
    Person person1 = new Person("Smolinka");
    System.out.println(person.name());
    System.out.println(person.age());
    System.out.println(person1);

    Car car = new Car("Skoda", "Octavia", 1992);
    System.out.println(car);
    Car car1 = new Car("Skoda", "Octavia Old", 1960);
    System.out.println(car1);
  }
}
