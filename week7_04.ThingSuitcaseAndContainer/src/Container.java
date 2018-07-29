
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
public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {

        int totWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totWeight += suitcase.totalWeight();
        }
        return totWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases " + " (" + this.totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }

}
