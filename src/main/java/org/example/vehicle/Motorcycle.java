package org.example.vehicle;

public class Motorcycle extends Vehicle {
    private int numberOfWheels;
    private String typeOfMotorcycle;

    public Motorcycle(String manufacturer, String model, int constructionYear, int numberOfWheels, String typeOfMotorcycle) {
        super(manufacturer, model, constructionYear);
        this.numberOfWheels = numberOfWheels;
        this.typeOfMotorcycle = typeOfMotorcycle;
    }
}
