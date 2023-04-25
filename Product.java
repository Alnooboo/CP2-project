/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2vize;

import java.util.ArrayList;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private int originalQuantity;   
    private String description;
    private int cartquantity;

 public Product(String name) {
    this.name = name;
    this.price = price;
    this.cartquantity = 0;
    this.quantity = quantity;
    this.originalQuantity = getQuantity();
        
    
}

    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCartquantity() {
        return cartquantity;
    }

    public void setCartquantity(int cartquantity) {
        this.cartquantity = cartquantity;
    }
    public int getOriginalQuantity() {
        return originalQuantity;
    }
    
    public int getCartQuantity() {
        return cartquantity;
    }
    
    public void setCartQuantity(int cartQuantity) {
        this.cartquantity = cartQuantity;
    }
    
    // override equals method to check if two products are equal based on their name
    @Override
    public boolean equals(Object obj) {
    //to check if the other object is null
    if (obj == null) {
        return false;
    }
    //to check if the other object is not an instance of the Product class
    if (getClass() != obj.getClass()) {
        return false;
    }
    //to cast the other object to a Product and compare their names
    final Product other = (Product) obj;
    if (!Objects.equals(this.name, other.name)) {
        return false;
    }
    return true;
}

}

