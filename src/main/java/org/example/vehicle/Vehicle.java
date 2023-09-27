package org.example.vehicle;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int constructionYear;

    public Vehicle(String manufacturer, String model, int constructionYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.constructionYear = constructionYear;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return constructionYear == vehicle.constructionYear && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, constructionYear);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", constructionYear=" + constructionYear +
                '}';
    }
}
