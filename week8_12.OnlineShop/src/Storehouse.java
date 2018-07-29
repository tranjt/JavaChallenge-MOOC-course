
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Storehouse {

    private Map<String, Integer> products = new HashMap<String, Integer>();
    private Map<String, Integer> prices = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, stock);
        this.prices.put(product, price);
    }

    public int price(String product) {
        if (this.products.get(product) == null || this.products.get(product) <= 0) {
            return -99;
        }
        return this.prices.get(product);
    }

    public int stock(String product) {
        if (this.products.get(product) != null) {
            return this.products.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.products.get(product) != null && this.products.get(product) > 0) {
            this.products.put(product, this.products.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }

}
