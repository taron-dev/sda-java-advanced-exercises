package sk.taron.sdaexample.comparator;

public class ComparatorMain {
  public static void main(String[] args) {
//    Person p1 = new Person("Sheldon",24, 185);
//    Person p2 = new Person("Leonard",24, 165);
//    Person p3 = new Person("Sheldon",24, 185);
//    System.out.println(p1.equals(p2));
//    System.out.println(p2.equals(p3));
//    System.out.println(p1.equals(p3));
//    System.out.println(p1.hashCode());
//    System.out.println(p2.hashCode());
//    System.out.println(p3.hashCode());
//    System.out.println("----------------------------");
    Person2 p2_1 = new Person2("Sheldon",24, 185);
    Person2 p2_2 = new Person2("Leonard",24, 165);
    Person2 p2_3 = new Person2("Sheldon",24, 185);
//
    System.out.println(p2_1.equals(p2_2));
    System.out.println(p2_2.equals(p2_3));
    System.out.println(p2_1.equals(p2_3));
//    System.out.println(p2_1.hashCode());
//    System.out.println(p2_2.hashCode());
//    System.out.println(p2_3.hashCode());



  }
}
