package com.example.list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1- CREAR ARRAYLIST (no admite tipos primitivos)
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Boolean> activeUsers = new ArrayList<>();


        // Añadir elementos. Se pueden añadir más elementos en cualquier momento
        names.add("Name1");  // admite datos duplicados
        names.add("Name1");
        names.add("Name1");

        numbers.add(100.9);
        numbers.add(1050.32);

        System.out.println(names);

        // Obtener un elemento: se extrae basándonos en el índice, que empieza en 0
        String name1 = names.get(0);
        String name2 = names.get(1);

        // Añadir un elemento, especificando desde el índice del arrayList
        String name = names.get(0);
        name = name + "añadir el primero a la lista";
        names.add(0, name);

        System.out.println(names);

        // Cambiar un elemento de la lista o actualizarlo
        names.set(1, "Pedro");

        // Borrar un elemento
        names.remove(0);  // no quedan huecos en la memoria, se reestructura el ArrayList

        System.out.println(names);

        // Obtener tamaño del arrayList
        System.out.println(names.size());

        // Comprobar si el arrayList está vacío
        System.out.println(names.isEmpty()); // si está lleno devuelve false, si está vacio devuelve true

        // Iterar sobre el arrayList
        for (String nam1 : names) {
            System.out.println(nam1);
        }

        // Comprobar si una lista contiene un elemento
        if (names.contains("Pedro"))
            System.out.println("Pedro está presente !!");




        // Borrar o vaciar  el arrayList
        names.clear();
        System.out.println("ArrayList limpiado " + names);
    }

}
