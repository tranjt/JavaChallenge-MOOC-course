/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class MilitaryService implements NationalService{
        private int daysLeft;
    
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    public int getDaysLeft() {
        return this.daysLeft;
    }
    
    public void work() {
        this.daysLeft--;
        if(this.daysLeft <= 0) {
            this.daysLeft = 0;
        }
    }
}
