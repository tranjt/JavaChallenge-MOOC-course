/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author Zun
 */
public class Worm {

    private Direction wormDirection;
    private List<Piece> wormPieces = new ArrayList<Piece>();
    private boolean grown = false;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        wormDirection = originalDirection;
        wormPieces.add(new Piece(originalX, originalY));
    }

    public Direction getDirection() {
        return wormDirection;
    }

    public void setDirection(Direction direction) {
        wormDirection = direction;
    }

    public int getLength() {
        return wormPieces.size();
    }

    public List<Piece> getPieces() {
        return wormPieces;
    }

    public void move() {
        int wormHeadX = wormPieces.get(wormPieces.size() - 1).getX();
        int wormHeadY = wormPieces.get(wormPieces.size() - 1).getY();
        
        if (wormDirection == Direction.DOWN) {
            wormPieces.add(new Piece(wormHeadX, wormHeadY + 1));
        }
        if (wormDirection == Direction.UP) {
            wormPieces.add(new Piece(wormHeadX, wormHeadY - 1));
        }
        if (wormDirection == Direction.LEFT) {
            wormPieces.add(new Piece(wormHeadX - 1, wormHeadY));
        }
        if (wormDirection == Direction.RIGHT) {
            wormPieces.add(new Piece(wormHeadX + 1, wormHeadY));
        }
        if (wormPieces.size() > 3 ) {
            if(!grown){
                wormPieces.remove(0);           
            }            
        } 
        grown = false;

    }

    public void grow() {
        grown = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : wormPieces) {
            if (wormPiece.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < wormPieces.size(); i++) {
            for (int y = i + 1; y < wormPieces.size(); y++) {
                if (y == wormPieces.size() - 1) {
                    break;
                }
                if (wormPieces.get(i).runsInto(wormPieces.get(y + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

}
