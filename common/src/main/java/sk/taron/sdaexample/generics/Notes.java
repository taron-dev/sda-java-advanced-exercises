package sk.taron.sdaexample.generics;

public class Notes {
  public static void main(String[] args) {

    class IntegerBox {
      private Integer value;
      public IntegerBox(Integer value) {
        this.value = value;
      }
      public void set(Integer value) { this.value = value; }
      public Integer get() { return value; }
    }

    class StringBox {
      private String value;
      public StringBox(String value) {
        this.value = value;
      }
      public void set(String value) { this.value = value; }
      public String get() { return value; }
    }

    class BoolBox {
      private Boolean value;
      public BoolBox(Boolean value) {
        this.value = value;
      }
      public void set(Boolean value) { this.value = value; }
      public Boolean get() { return value; }
    }

    class Box<Y> {
      private Y value;
      public Box(Y value) {
        this.value = value;
      }
      public void set(Y value) { this.value = value; }
      public Y get() { return value; }
    }


















    Box<Integer> intBox = new Box<>(123);
    System.out.println("Integer value: " + intBox.get());

    Box<String> strBox = new Box<>("Hello");
    System.out.println("String value: " + strBox.get());
  }
}
