
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class ShoppingBasket {
    private Map<String, Purchase> purchaseList = new HashMap<String, Purchase>();
    
    public void add(String product, int price) {
        if (this.purchaseList.get(product) == null ) {
            this.purchaseList.put(product, new Purchase(product, 1, price));
        } else {
            this.purchaseList.get(product).increaseAmount();
        }
    }
    
    public  int price() {
        int total= 0;
        for(String product : this.purchaseList.keySet()) {
            total += this.purchaseList.get(product).price();
        }
        return total;
    }
    
    public void print() {
        for( String product : this.purchaseList.keySet()) {
            System.out.println(this.purchaseList.get(product));
        }
    }
}
