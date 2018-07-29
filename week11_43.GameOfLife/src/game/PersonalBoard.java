/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Zun
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                getBoard()[x][y] = Math.random() < probabilityForEachCell;
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (getWidth() > x && x >= 0 && getHeight() > y && y >= 0) {
            return getBoard()[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (getWidth() > x && x >= 0 && getHeight() > y && y >= 0) {
            getBoard()[x][y] = true;;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (getWidth() > x && x >= 0 && getHeight() > y && y >= 0) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int aliveCount = 0;

        if (isAlive(-1 + x, -1 + y)) {
            aliveCount++;
        }
        if (isAlive(0 + x, -1 + y)) {
            aliveCount++;
        }
        if (isAlive(1 + x, -1 + y)) {
            aliveCount++;
        }
        if (isAlive(-1 + x, 0 + y)) {
            aliveCount++;
        }
        if (isAlive(1 + x, 0 + y)) {
            aliveCount++;
        }
        if (isAlive(-1 + x, 1 + y)) {
            aliveCount++;
        }
        if (isAlive(0 + x, 1 + y)) {
            aliveCount++;
        }
        if (isAlive(1 + x, 1 + y)) {
            aliveCount++;
        }
        return aliveCount;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {

        if (getBoard()[x][y]) {
            if (livingNeighbours < 2) {
                turnToDead(x, y);            
            }
            if (livingNeighbours == 2 || livingNeighbours == 3) {
                turnToLiving(x, y);                
            }
            if (livingNeighbours > 3) {
                turnToDead(x, y);                
            }
        }        
        if (!getBoard()[x][y]) {
               if ( livingNeighbours == 3) {
                turnToLiving(x, y);             
            }
        }
    }

}
