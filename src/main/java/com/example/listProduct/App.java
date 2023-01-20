package com.example.listProduct;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Product prod1 = new Product("prod1", 32.32, 10);
        Product prod2 = new Product("prod2", 32.32, 10);
        Product prod3 = new Product("prod3", 32.32, 10);

        products.add(prod1);
        products.add(prod2);
        products.add(prod3);

        System.out.println(products);

        for (Product product : products) {  //con este for imprimimos de linea en linea cada producto
            System.out.println(product);
        }

        // Update
        products.get(0).setName("nombre cambiado");
        System.out.println(products);

        // Delete / Remove
        products.remove(prod2);
        System.out.println(products);

    }
}
