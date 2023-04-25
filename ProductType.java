/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2vize;

import java.util.ArrayList;

/**
 *
 * @author habee
 */
public class ProductType {
    private ArrayList<Product> products;

    public ProductType() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity, String description) {
        products.add(new Product(name, price, quantity, description));
    }
    

    public ArrayList<Product> getProducts() {
        return products;
    }
}
