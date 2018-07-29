
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
public class SkiJumper implements Comparable<SkiJumper>{

    private String name;
    private int points;
    private ArrayList<Integer> jumpLengths = new ArrayList<Integer>();

    public SkiJumper(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public String jumpLengthsToString() {
        String jumpLengthsString = "jump lengths: ";
        for (int i = 0; i < this.jumpLengths.size(); i++) {
            jumpLengthsString += this.jumpLengths.get(i) + " m";
            if (i != this.jumpLengths.size() - 1) {
                jumpLengthsString += ", ";
            }
        }
        return jumpLengthsString;
    }

    public void addPoint(int points) {
        this.points += points;
    }

    public void addJumpLength(int jump) {
        this.jumpLengths.add(jump);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    
    public int compareTo(SkiJumper otherJumper) {        
        return this.points - otherJumper.getPoints();
    }

}
