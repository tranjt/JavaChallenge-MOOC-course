package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Text copy");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField textField = new JTextField();
        JLabel textLabel = new JLabel();
        JButton copyButton = new JButton("Copy!");
        
        TextCopier textCopy = new TextCopier(textLabel, textField);
        copyButton.addActionListener(textCopy);
        
        container.add(textField);
        container.add(copyButton);
        container.add(textLabel);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
