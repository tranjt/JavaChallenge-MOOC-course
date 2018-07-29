
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
public class ResetFields implements ActionListener {

    private JTextField calcInputField;
    private JTextField calcResultField;
    private JButton zButton;

    public ResetFields(JTextField calcInputField, JTextField calcResultField, JButton zButton) {
        this.calcInputField = calcInputField;
        this.calcResultField = calcResultField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calcResultField.setText("0");
        this.calcInputField.setText("");
         this.zButton.setEnabled(false);
        
    }
}