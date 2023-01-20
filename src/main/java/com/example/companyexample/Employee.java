package com.example.companyexample;

import java.util.ArrayList;

public class Employee {

    private String name;
    private String DNI;
    private Integer phone;

    private ArrayList<Car> cars = new ArrayList<>();


    public Employee() {
    }

    public Employee(String name, String DNI, Integer phone) {
        this.name = name;
        this.DNI = DNI;
        this.phone = phone;
        this.cars = new ArrayList<>();
    }


    // Método para agregar coches
    public void insertCar(Car ins) {
        this.cars.add(ins);
    }

    // Método para sacar listado de coches
    public void listCars(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                ", phone=" + phone +
                ", cars=" + cars +
                '}';
    }
}
