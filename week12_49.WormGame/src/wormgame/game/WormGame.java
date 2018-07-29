package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        apple = createApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            setApple(createApple());
        }
        if(worm.runsIntoItself()){
            continues = false;
        }
        if(wormHitBorder()){
            continues = false;
        }
        
        updatable.update();
        setDelay(1000 / worm.getLength()); 
        if (!continues) {
            return;
        }

    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Apple createApple() {
        Random random = new Random();
        Apple tempApple = new Apple(random.nextInt(width), random.nextInt(height));
        while (worm.runsInto(tempApple)) {
            tempApple = new Apple(random.nextInt(width), random.nextInt(height));
        }
        return tempApple;
    }
    
    public boolean wormHitBorder(){
        for (Piece piece : worm.getPieces()){
            if(piece.getX() <= 0 || piece.getX() >= width ||
                    piece.getY() <= 0 || piece.getY() >= height){
               return true;
            }
        }
        return false;
    }

}
