/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zun
 */
public class Group implements Movable {

    private List<Movable> moveableList = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        this.moveableList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.moveableList) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String group = "";
        for (Movable movable : this.moveableList) {
            group += movable.toString() + "\n";
        }
        return group;
    }

}
