/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Zun
 */
public class CompoundFigure extends Figure{
    private ArrayList<Figure> figures = new ArrayList<Figure>();
    
    public CompoundFigure() {
        super(0, 0);
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }
    
    
    @Override
    public void draw(Graphics graphics) {
        for(Figure figure : this.figures){
            figure.draw(graphics);
        }
    
    }
    @Override
    public void move(int x, int y){
         for(Figure figure : this.figures){
           figure.move(x, y);
        }
    }
    
}
