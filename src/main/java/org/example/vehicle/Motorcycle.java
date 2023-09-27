package org.example.vehicle;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private int numberOfWheels;
    private String typeOfMotorcycle;

    public Motorcycle(String manufacturer, String model, int constructionYear, int numberOfWheels, String typeOfMotorcycle) {
        super(manufacturer, model, constructionYear);
        this.numberOfWheels = numberOfWheels;
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return numberOfWheels == that.numberOfWheels && Objects.equals(typeOfMotorcycle, that.typeOfMotorcycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels, typeOfMotorcycle);
    }

    @Override
    public String toString() {
        return "Motorcycle: " +
                "| Manufacturer = " + super.getManufacturer() +
                "| Model = " + super.getModel() +
                "| Construction year = " + super.getConstructionYear() +
                "| Type of motorcycle = " + typeOfMotorcycle +
                "| Number of wheels = " + numberOfWheels;
    }
}
