# Functional

enum CarType {
COUPE, CABRIO, SEDAN, HATCHBACK
}

class Car {
public String name;
public String description;
public CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }
}

class Model {
public String name;
public int productionStartYear;
List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }
}

class Manufacturer {
public String name;
public int yearOfCreation;
List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}


Using functional programming mechanisms based on the given structure, display:
1. a list of all Models,
2. a list of all cars,
3. list of all manufacturer names,
4. list of all manufacturers' establishment years,
5. list of all model names,
6. list of all years of starting production of models,
7. list of all car names,
8. list of all car descriptions,
9. only models with an even year of production start,
10. only cars from manufacturers with an even year of foundation,
11. only cars with an even year of starting production of the model and an odd year of establishing the
    manufacturer,
12. only CABRIO cars with an odd year of starting model production and an even year of establishing the
    manufacturer,
13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than
    1919

public class CarDataProcessor {
public static void main(String[] args) {
// Assume `manufacturers` is a populated list of Manufacturer objects
List<Manufacturer> manufacturers = new ArrayList<>();

        // 1. List of all Models
        List<Model> allModels = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .collect(Collectors.toList());
        System.out.println("All Models: " + allModels);

        // 2. List of all Cars
        List<Car> allCars = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .flatMap(model -> model.cars.stream())
            .collect(Collectors.toList());
        System.out.println("All Cars: " + allCars);

        // 3. List of all Manufacturer Names
        List<String> manufacturerNames = manufacturers.stream()
            .map(manufacturer -> manufacturer.name)
            .collect(Collectors.toList());
        System.out.println("Manufacturer Names: " + manufacturerNames);

        // 4. List of all Manufacturers' Establishment Years
        List<Integer> manufacturerYears = manufacturers.stream()
            .map(manufacturer -> manufacturer.yearOfCreation)
            .collect(Collectors.toList());
        System.out.println("Manufacturer Years: " + manufacturerYears);

        // 5. List of all Model Names
        List<String> modelNames = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .map(model -> model.name)
            .collect(Collectors.toList());
        System.out.println("Model Names: " + modelNames);

        // 6. List of all Years of Starting Production of Models
        List<Integer> productionStartYears = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .map(model -> model.productionStartYear)
            .collect(Collectors.toList());
        System.out.println("Production Start Years: " + productionStartYears);

        // 7. List of all Car Names
        List<String> carNames = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .flatMap(model -> model.cars.stream())
            .map(car -> car.name)
            .collect(Collectors.toList());
        System.out.println("Car Names: " + carNames);

        // 8. List of all Car Descriptions
        List<String> carDescriptions = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .flatMap(model -> model.cars.stream())
            .map(car -> car.description)
            .collect(Collectors.toList());
        System.out.println("Car Descriptions: " + carDescriptions);

        // 9. Models with Even Year of Production Start
        List<Model> modelsWithEvenStartYear = manufacturers.stream()
            .flatMap(manufacturer -> manufacturer.models.stream())
            .filter(model -> model.productionStartYear % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Models with Even Start Year: " + modelsWithEvenStartYear);

        // 10. Cars from Manufacturers with Even Year of Foundation
        List<Car> carsFromEvenFoundationYearManufacturers = manufacturers.stream()
            .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
            .flatMap(manufacturer -> manufacturer.models.stream())
            .flatMap(model -> model.cars.stream())
            .collect(Collectors.toList());
        System.out.println("Cars from Even Foundation Year Manufacturers: " + carsFromEvenFoundationYearManufacturers);

        // 11. Cars with Even Year of Starting Production of the Model and Odd Year of Establishing the Manufacturer
        List<Car> carsWithEvenModelStartYearAndOddManufacturerYear = manufacturers.stream()
            .filter(manufacturer -> manufacturer.yearOfCreation % 2 != 0)
            .flatMap(manufacturer -> manufacturer.models.stream())
            .filter(model -> model.productionStartYear % 2 == 0)
            .flatMap(model -> model.cars.stream())
            .collect(Collectors.toList());
        System.out.println("Cars with Even Model Start Year and Odd Manufacturer Year: " + carsWithEvenModelStartYearAndOddManufacturerYear);

        // 12. CABRIO Cars with Odd Year of Starting Model Production and Even Year of Establishing the Manufacturer
        List<Car> cabrioCarsWithOddModelStartYearAndEvenManufacturerYear = manufacturers.stream()
            .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
            .flatMap(manufacturer -> manufacturer.models.stream())
            .filter(model -> model.productionStartYear % 2 != 0)
            .flatMap(model -> model.cars.stream())
            .filter(car -> car.carType == CarType.CABRIO)
            .collect(Collectors.toList());
        System.out.println("CABRIO Cars with Odd Model Start Year and Even Manufacturer Year: " + cabrioCarsWithOddModelStartYearAndEvenManufacturerYear);

        // 13. SEDAN Cars from Models Newer Than 2019 and Manufacturer's Founding Year Less Than 1919
        List<Car> sedanCarsFromRecentModelsAndOldManufacturers = manufacturers.stream()
            .filter(manufacturer -> manufacturer.yearOfCreation < 1919)
            .flatMap(manufacturer -> manufacturer.models.stream())
            .filter(model -> model.productionStartYear > 2019)
            .flatMap(model -> model.cars.stream())
            .filter(car -> car.carType == CarType.SEDAN)
            .collect(Collectors.toList());
        System.out.println("SEDAN Cars from Recent Models and Old Manufacturers: " + sedanCarsFromRecentModelsAndOldManufacturers);
    }
}
