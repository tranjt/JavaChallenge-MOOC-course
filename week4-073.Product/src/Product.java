/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Product {
    private double price;
    private int amount;
    private String name;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.name = nameAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price  +  ", amount "+ this.amount);
    }
    
}
