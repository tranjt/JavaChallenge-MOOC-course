/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Counter {

    boolean check;
    int value;

    public Counter() {
        this(0, false);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.value = startingValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }

    }

    public void decrease() {
        if ((this.value == 0 && !this.check) || this.value > 0) {
            this.value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if ((this.value - decreaseAmount < 0 && this.check)) {
                this.value = 0;
            } else {
                this.value -= decreaseAmount;
            }

        }
    }

}
