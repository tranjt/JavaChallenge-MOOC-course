
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
public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {

        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int totWeight = 0;
        for (Thing thing : this.things) {
            totWeight += thing.getWeight();
        }
        return totWeight;
    }

    @Override
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        }
        if (this.things.size() == 1) {
            return this.things.size() + " thing " + " (" + this.totalWeight() + " kg)";
        }
        return this.things.size() + " things " + " (" + this.totalWeight() + " kg)";
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing.getName() + " ( " + thing.getWeight() + " kg)");
        }
    }

    public Thing heaviestThing() {
        Thing heavest;
        if (this.things.isEmpty()) {
            return null;
        }
        heavest = this.things.get(0);
        for (Thing thing : this.things) {
            if (heavest.getWeight() < thing.getWeight()) {
                heavest = thing;
            }
        }
        return heavest;
    }
}
