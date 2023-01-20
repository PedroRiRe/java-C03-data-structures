package com.example.companyexample;

import java.util.ArrayList;

public class Company {
    private String name;
    private String CIF;


    private ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name, String CIF) {
        this.name = name;
        this.CIF = CIF;
        this.employees = new ArrayList<>();
    }

    //Método para agregar empleado
    public void insertEmployee(Employee empl) {
        this.employees.add(empl);
    }

    // Método para listado de los coches de los empleados
    public void listEmployeeCars() {
        for (Employee employee: employees) {
            employee.listCars();
        }
    }

    // getter y setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", CIF='" + CIF + '\'' +
                ", employees=" + employees +
                '}';
    }
}
