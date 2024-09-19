package sk.taron.sdaexample.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalMain {

  public static void main(String[] args) {
    // Instantiate cars for different models
    Car car1 = new Car("Car A", "A sleek coupe", CarType.COUPE);
    Car car2 = new Car("Car B", "A stylish cabrio", CarType.CABRIO);
    Car car3 = new Car("Car C", "A modern sedan", CarType.SEDAN);
    Car car4 = new Car("Car D", "A compact hatchback", CarType.HATCHBACK);
    Car car5 = new Car("Car E", "Another sedan", CarType.SEDAN);

    // Instantiate models for different manufacturers
    Model model1 = new Model("Model X", 2020, Arrays.asList(car1, car2));  // Model with even year
    Model model2 = new Model("Model Y", 2021, Arrays.asList(car3));  // Model with odd year
    Model model3 = new Model("Model Z", 2018, Arrays.asList(car4, car5));  // Model with even year

    // Instantiate manufacturers
    Manufacturer manufacturer1 = new Manufacturer("Manufacturer One", 1915, Arrays.asList(model1));  // Odd year
    Manufacturer manufacturer2 = new Manufacturer("Manufacturer Two", 1920, Arrays.asList(model2, model3));  // Even year
    Manufacturer manufacturer3 = new Manufacturer("Manufacturer Three", 1890, Arrays.asList(model3));  // Even year

    var manufacturers = Arrays.asList(manufacturer1, manufacturer2, manufacturer3);

    List<Model> allModels = manufacturers.stream()
        .flatMap(manufacturer -> manufacturer.models.stream())
        .collect(Collectors.toList());
    System.out.println("All Models: " + allModels);
  }
}
