package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private PersonalCalculator personalCalculator;

    public UserInterface(PersonalCalculator personalCalculator) {
        this.personalCalculator = personalCalculator;
    }

    public UserInterface() {

    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel calJLabel = new JLabel("0");
        JButton calButton = new JButton("Click!");

        ClickListener clickListener = new ClickListener(personalCalculator, calJLabel);
        calButton.addActionListener(clickListener);

        container.add(calJLabel, BorderLayout.CENTER);
        container.add(calButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
