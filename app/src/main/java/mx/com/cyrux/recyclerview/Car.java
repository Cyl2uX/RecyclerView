package mx.com.cyrux.recyclerview;

import java.util.ArrayList;

public class Car {
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public static ArrayList<Car> getCarsList() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Focus", "Ford", 2018));
        cars.add(new Car("Figo", "Ford", 2020));
        cars.add(new Car("TT Coupe", "Audi", 2003));
        cars.add(new Car("S40", "Volvo", 2010));
        cars.add(new Car("XE", "Jaguar", 2020));
        cars.add(new Car("Quattroporte", "Maserati", 2020));
        cars.add(new Car("Huracan EVO", "Lamborghini", 2020));
        cars.add(new Car("CTS", "Cadillac", 2020));
        cars.add(new Car("Vanquish", "Aston Martin", 2019));
        cars.add(new Car("Mazda3", "Mazda", 2020));

        return cars;
    }
}
