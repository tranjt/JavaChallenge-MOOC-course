/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Zun
 */
public class TextCopier implements ActionListener{
    
    private JLabel textLabel;
    private JTextField textField;

    public TextCopier(JLabel textLabel, JTextField textArea) {
        this.textLabel = textLabel;
        this.textField = textArea;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.textLabel.setText(this.textField.getText());
        this.textField.setText("");
    }
    
}
