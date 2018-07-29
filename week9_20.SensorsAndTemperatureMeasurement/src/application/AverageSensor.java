/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zun
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> tempReadings = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int total = 0;

        if (this.sensors.isEmpty()) {
            throw new IllegalStateException("Sensors are not all on, or empty");
        } else {
            for (Sensor sensor : this.sensors) {
                total += sensor.measure();
            }
            this.tempReadings.add(total / this.sensors.size());
            return total / this.sensors.size();
        }
    }

    public List<Integer> readings() {
        return this.tempReadings;
    }

}
