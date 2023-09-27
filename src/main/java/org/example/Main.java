package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","330",2018,5);
        Vehicle car2 = new Vehicle("Toyota","Corolla",2014);

        System.out.println(car1);
        System.out.println(car2);
    }
}