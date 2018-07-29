
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 150));

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {        
        container.setLayout(new GridLayout(3, 1));
        JTextField calcResultField = new JTextField("0");
        calcResultField.setEnabled(false);
        
        JTextField calcInputField = new JTextField("0");
        
        
        
        container.add(calcResultField);
        container.add(calcInputField);
        
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton zButton = new JButton("Z");
        zButton.setEnabled(false);
        container.add(createCalcButtons(plusButton, minusButton, zButton));
        
        plusButton.addActionListener(new Addition(calcInputField, calcResultField, zButton));
        minusButton.addActionListener(new Subtraction(calcInputField, calcResultField, zButton));
        zButton.addActionListener(new ResetFields(calcInputField, calcResultField, zButton));

    }

    public JFrame getFrame() {
        return frame;
    }

    private JPanel createCalcButtons(JButton plusButton, JButton minusButton, JButton zButton) {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(zButton);
        return panel;
    }


    
}
