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
public class Coordinate {

    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }

    public boolean equals(int x, int y) {
        return this.x == x && this.y == y;
    }

    public String toString() {
        return " " + this.x + " " + this.y;
    }
}
