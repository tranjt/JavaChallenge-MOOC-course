/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Zun
 */
public class Thermometer implements Sensor {

    private Random random = new Random();
    private boolean isOn;

    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn) {
            return random.nextInt(30 + 30) - 30;
        } else {
            throw new IllegalStateException("Thermometer is not on!");
        }
    }

}
