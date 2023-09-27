package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.Motorcycle;
import org.example.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","330",2018,5);
        Vehicle car2 = new Vehicle("Toyota","Corolla",2014);

        Motorcycle motorcycle1 = new Motorcycle(
                "Kawasaki",
                "Ninja",
                2020,
                2,
                "Supersport"
        );

        Car car3 = new Car("Mercedes", "C200", 2018,5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(motorcycle1);
    }
}