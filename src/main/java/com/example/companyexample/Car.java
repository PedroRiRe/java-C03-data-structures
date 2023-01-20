package com.example.companyexample;

public class Car {
    private String name;
    private String license;
    private Double value;
    private Manufacturer manufacturer;


    public Car() {
    }

    public Car(String name, String license, Double value, Manufacturer manufacturer) {
        this.name = name;
        this.license = license;
        this.value = value;
        this.manufacturer = manufacturer;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", value=" + value +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
