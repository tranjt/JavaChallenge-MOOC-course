
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Addition implements ActionListener {

    private JTextField calcInputField;
    private JTextField calcResultField;
    private JButton zButton;

    public Addition(JTextField calcInputField, JTextField calcResultField, JButton zButton) {
        this.calcInputField = calcInputField;
        this.calcResultField = calcResultField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int newResult = Integer.parseInt(this.calcResultField.getText()) + Integer.parseInt(this.calcInputField.getText());
            if (newResult == 0) {
                this.zButton.setEnabled(false);
            } else {
                this.zButton.setEnabled(true);
            }
            this.calcInputField.setText("");
            this.calcResultField.setText(Integer.toString(newResult));
        } catch (Exception ex) {
            this.calcInputField.setText("");
        }

    }

}
