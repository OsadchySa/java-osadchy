package lesson5.task3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Owner owner1 = new Owner("John Doe", 45, 20);
        Owner owner2 = new Owner("Jane Smith", 35, 12);
        Owner owner3 = new Owner("Robert Brown", 40, 18);
        Owner owner4 = new Owner("Alice Johnson", 30, 8);
        Owner owner5 = new Owner("Michael White", 50, 25);
        Owner owner6 = new Owner("Emily Davis", 28, 4);
        Owner owner7 = new Owner("David Green", 33, 10);
        Owner owner8 = new Owner("Sarah Wilson", 38, 14);
        Owner owner9 = new Owner("James Harris", 48, 22);
        Owner owner10 = new Owner("Sophia Clark", 32, 3);

        Car car1 = new Car("Audi", 250.5, owner1, 35000, 2018);
        Car car2 = new Car("BMW", 300.0, owner2, 45000, 2019);
        Car car3 = new Car("Mercedes", 270.2, owner3, 50000, 2020);
        Car car4 = new Car("Tesla", 450.0, owner4, 60000, 2021);
        cars.add(new Car("Ford", 200.1, owner5, 30000, 2017));
        cars.add(new Car("Toyota", 180.5, owner6, 28000, 2016));
        cars.add(new Car("Nissan", 190.7, owner7, 29000, 2018));
        cars.add(new Car("Chevrolet", 220.3, owner8, 32000, 2019));
        cars.add(new Car("Lexus", 330.8, owner9, 55000, 2020));
        Car car10 = new Car("Porsche", 400.4, owner10, 75000, 2021);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car10);

        for (Car car : cars) {
            System.out.println(car);
        }

        car1.upgradeEngine();
        car2.upgradeEngine();
        car3.upgradeEngine();
        car4.upgradeEngine();
        car10.upgradeEngine();

        System.out.println("After upgrade:");
        for (Car car : cars) {
            System.out.println(car);
        }

        cars.stream()
                .map(Car::getOwner)
                .filter(owner -> owner.getDrivingExperience() < 5 && owner.getAge() > 25)
                .forEach(Owner::increasingExperience);
        for (Car car: cars) {
            System.out.println(car.getOwner());
        }

        double totalCost = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println(totalCost);
    }
}
