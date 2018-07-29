/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Zun
 */
public class Item implements Thing, Comparable<Item>{

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public int compareTo(Item otherTItem) {
        return this.volume - otherTItem.getVolume();
    }
    
    

}
