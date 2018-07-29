/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Zun
 */
public class Cow implements Milkable, Alive {

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private Random ran = new Random();
    private String name;
    private double udderCapcity = 15 + ran.nextInt(26);
    private double amount = 0;

    public Cow() {
        this.name = this.NAMES[ran.nextInt(this.NAMES.length)];
    }

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapcity;
    }

    public double getAmount() {
        return this.amount;
    }

    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapcity);
    }

    @Override
    public double milk() {
        double milkedAmount = this.amount;
        this.amount = 0;
        return milkedAmount;
    }

    @Override
    public void liveHour() {
        this.amount += 0.7 + (2 - 0.7) * ran.nextDouble();
        if (this.amount > this.udderCapcity) {
            this.amount = this.udderCapcity;
        }
    }

}
