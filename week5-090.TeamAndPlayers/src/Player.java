/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int goal) {
        this.name = name;
        this.goals = goal;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goals;
    }

    @Override
    public String toString() {
        return "Player: " + this.name + ", goals " + this.goals + '}';
    }
    
    
    
    
    
}
