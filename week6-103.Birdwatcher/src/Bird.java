/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Bird {

    String name, latinName;
    int observationCount = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getType() {
        return this.name;
    }

    public int getObservationCount() {
        return this.observationCount;
    }

    public void inObservationCount() {
        this.observationCount++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + ") " + this.observationCount + " observations";
    }

}
