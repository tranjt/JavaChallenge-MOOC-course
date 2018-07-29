/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Zun
 */
public class BulkTank {

    private double capacity, volume = 0;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        this.volume += amount;
        if (this.volume > this.capacity) {
            this.volume = this.capacity;
        }
    }

    public double getFromTank(double amount) {        
        if (this.volume < amount) {
            double takenAmount;
            takenAmount = this.volume;
            this.volume = 0;
            return takenAmount;
        }else{
            this.volume -= amount;
            return amount;
        }
    }
    
    public String toString(){
        return Math.ceil(this.volume )+ "/" + Math.ceil(this.capacity);
    }

}
