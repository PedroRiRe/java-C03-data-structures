package com.example.companyexample;

public class App {
    /*
    Company lista de empleados
    Employee lista de coches

    A partir de la compañia extraer los coches asociados
     */
    public static void main(String[] args) {

        Employee empl1 = new Employee("empl1", "33333333A", 333333333);
        Employee empl2 = new Employee("empl2", "44444444A", 444444444);
        Employee empl3 = new Employee("empl3", "55555555A", 555555555);
        Employee empl4 = new Employee("empl4", "66666666A", 666666666);
        Employee empl5 = new Employee("empl5", "77777777A", 777777777);

        empl1.insertCar(new Car("car1", "0000A", 50000.959, Manufacturer.MERCEDES));
        empl1.insertCar(new Car("car2", "4000D", 43599.59, Manufacturer.VOLVO));
        empl2.insertCar(new Car("car3", "0022A", 48800.00, Manufacturer.MERCEDES));
        empl2.insertCar(new Car("car4", "3936D", 40999.99, Manufacturer.VOLVO));
        empl3.insertCar(new Car("car5", "9090L", 326003.23, Manufacturer.PEUGEOT));
        empl3.insertCar(new Car("car6", "2222E", 28757.32, Manufacturer.PEUGEOT));
        empl4.insertCar(new Car("car7", "3221H", 26412.321, Manufacturer.PEUGEOT));
        empl4.insertCar(new Car("car8", "6776O", 21569.25, Manufacturer.SEAT));
        empl5.insertCar(new Car("car9", "9878P", 21666.55, Manufacturer.PEUGEOT));
        empl5.insertCar(new Car("car10", "3456K", 19687.58, Manufacturer.SEAT));


        Company Petercom = new Company("Petercom", "69696969F");
        Petercom.insertEmployee(empl1);
        Petercom.insertEmployee(empl2);
        Petercom.insertEmployee(empl3);
        Petercom.insertEmployee(empl4);
        Petercom.insertEmployee(empl5);

        Petercom.listEmployeeCars();

    }


}
