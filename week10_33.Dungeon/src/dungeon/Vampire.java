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
public class Vampire extends Creature {

    private int id;

    public Vampire(Coordinate position, int id) {
        super(position, "v");
        this.id = id;
    }


}
