/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Purchase {

    private String product;
    private int amount, unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.amount;
    }

    public void increaseAmount() {
        this.amount++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }

}
