/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zun
 */
public class Dungeon {

    private int length, height, moves;
    private boolean vampiresMove;
    private List<Creature> creatures;
    private Random random;
    private Player player;
    private int vampires;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.creatures = new ArrayList<Creature>();
        this.random = new Random();
        this.player = new Player();
        this.creatures.add(this.player);
        this.vampires = vampires;
        fillDungeonWithCreatures(vampires);
        this.reader = new Scanner(System.in);
    }

    public void run() {
        String commands = "";
        while (this.moves > 0) {
            printDungeonsStatus();
            drawDungeon();
            
            //take user input
            commands = reader.nextLine();
            //generate player move            
            generatePlayerMove(commands);
            //check colltion
            vampireKillCheck();
            //generate vampire moves
            if (this.vampiresMove) {
                generateVampiresMoves();
            }
            //check collition
            vampireKillCheck();
            //check if won    
            if (this.vampires == 0) {
                break;
            }
            this.moves--;
        }
        //annouce win depending on turn left
        if (this.moves > 0) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }

    }

    public void fillDungeonWithCreatures(int vampires) {
        Coordinate tempPosition;
        for (int i = 0; i < vampires; i++) {
            while (true) {
                tempPosition = generateCoordinate();
                if (!positionOccupied(tempPosition)) {
                    this.creatures.add(new Vampire(tempPosition, i));
                    break;
                }
            }
        }
    }

    public boolean positionOccupied(Coordinate coordinate) {
        for (Creature creature : this.creatures) {
            if (creature.getCoordinate().equals(coordinate)) {
                return true;
            }
        }
        return false;
    }

    public boolean positionOccupied(int x, int y) {
        for (Creature creature : this.creatures) {
            if (creature.getCoordinate().equals(x, y)) {
                return true;
            }
        }
        return false;
    }

    public boolean positionOccupiedByVampire(Coordinate coordinate) {
        for (Creature creature : this.creatures) {
            if (creature.getCoordinate().equals(coordinate) && creature instanceof Vampire) {
                return true;
            }
        }
        return false;
    }

    public String getCreatureAtPosition(int x, int y) {
        for (Creature creature : this.creatures) {
            if (creature.getCoordinate().equals(x, y)) {
                return creature.getName();
            }
        }
        return ".";
    }

    public Coordinate generateCoordinate() {
        return new Coordinate(random.nextInt(this.length), random.nextInt(this.height));
    }    

    public void generatePlayerMove(String moves) {
        int x = this.player.getCoordinate().getX();
        int y = this.player.getCoordinate().getY();
        
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'w') {
                y--;
            } else if (moves.charAt(i) == 's') {
                y++;
            } else if (moves.charAt(i) == 'a') {
                x--;
            } else if (moves.charAt(i) == 'd') {
                x++;
            }
        }

        if (x > this.length - 1) {
            x = this.length - 1;
        }
        if (x < 0) {
            x = 0;
        }
        if (y > this.height - 1) {
            y = this.height - 1;
        }
        if (y < 0) {
            y = 0;
        }

        this.player.move(x, y);
        
    }

    public void generateVampireMove(Vampire vampire) {
        Coordinate newCoordinate = generateCoordinate();
        if (!positionOccupiedByVampire(newCoordinate)) {
            vampire.move(newCoordinate);
        }
    }

    public void generateVampiresMoves() {
        for (Creature creature : this.creatures) {
            if (creature instanceof Vampire) {
                generateVampireMove((Vampire) creature);
            }
        }
    }

    public void vampireKillCheck() {
        for (int i = 0; i < this.creatures.size(); i++) {
            if (this.creatures.get(i).getCoordinate().equals(this.player.getCoordinate().getX(), this.player.getCoordinate().getY())) {
                if (this.creatures.get(i) instanceof Vampire) {
                    this.creatures.remove(i);
                    this.vampires--;
                }
            }
        }
    }

    public void drawDungeon() {
        for (int y = 0; y < this.length; y++) {
            for (int x = 0; x < this.height; x++) {
                if (positionOccupied(x, y)) {
                    System.out.print(getCreatureAtPosition(x, y));
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void printDungeonsStatus() {
        System.out.println(this.moves + "\n");
        for (Creature creature : this.creatures) {
            System.out.println(creature);
        }
        System.out.println("");
    }
    
}
