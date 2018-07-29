/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Zun
 */
public class ClickListener implements ActionListener{
    private Calculator calc;
    private JLabel calcLabel;

    public ClickListener(Calculator calc, JLabel calcLabel) {
        this.calc = calc;
        this.calcLabel = calcLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        this.calcLabel.setText(Integer.toString(this.calc.giveValue()));
    }
    
}
