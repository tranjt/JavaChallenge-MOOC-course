/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Airplane {

    private String id, capacity;
    

    public Airplane(String id, String capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return this.id;
    }

    public String getCapacity() {
        return this.capacity;
    }
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
}
