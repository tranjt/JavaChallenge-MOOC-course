/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Zun
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> thingsInBox = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (this.currentWeight() + thing.getWeight() > this.maxWeight) {
            return;
        }
        this.thingsInBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thingsInBox.contains(thing);
    }

    private int currentWeight() {
        int currentWeight = 0;
        for (Thing thing : this.thingsInBox) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

}
