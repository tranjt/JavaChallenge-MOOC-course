
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> items = new ArrayList<ToBeStored>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item) {
        if (weight()+ item.weight() <= maxWeight) {
         this.items.add(item);
        }
    }
    
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight+= item.weight();
        }
        return totalWeight;
    }
    
    

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " things, total weight " + weight() + " kg";
    }
    
    
    
}
