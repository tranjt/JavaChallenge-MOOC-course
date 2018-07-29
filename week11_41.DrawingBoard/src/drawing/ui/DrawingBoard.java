package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        //fillRect(int x, int y, int width, int height)
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 50, 200, 50);

        graphics.setColor(Color.WHITE);
        graphics.fillRect(150, 50, 100, 50);

        graphics.setColor(Color.BLACK);
        graphics.fillRect(50, 200, 300, 50);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(100, 200, 200, 50);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 250, 200, 50);

    }
}
