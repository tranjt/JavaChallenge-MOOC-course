package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(100, 200));
        createCompoenent(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void createCompoenent(Container container) {
        JLabel question1, question2;
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        JCheckBox checkBoxYes = new JCheckBox("Yes!");
        JCheckBox checkBoxNo = new JCheckBox("No!");

        container.add(checkBoxYes);
        container.add(checkBoxNo);

        container.add(new JLabel("Why?"));
        JRadioButton radioButton1 = new JRadioButton("No reason.");
        JRadioButton radioButton2 = new JRadioButton("Because it is fun!");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        container.add(radioButton1);
        container.add(radioButton2);
        
        JButton doneButton = new JButton("Done!");
       container.add(doneButton);

    }
}
