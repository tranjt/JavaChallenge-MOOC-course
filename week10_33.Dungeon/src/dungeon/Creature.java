/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Zun
 */
public class Creature {
    private String name;
    private Coordinate position;    
    
    public Creature(Coordinate position, String name) {
        this.position = position;
        this.name = name;        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void move(int x, int y) {
        this.position.setX(x);
        this.position.setY(y);
    }
    
    public void move(Coordinate coordinate) {
        this.position = coordinate;
    }
    
    public String toString(){
        return this.name + this.position.toString();
    }
    
    public Coordinate getCoordinate(){
        return this.position;
    }
    
}
