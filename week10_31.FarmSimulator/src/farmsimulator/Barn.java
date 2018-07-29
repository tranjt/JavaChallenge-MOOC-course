/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Zun
 */
public class Barn {

    private BulkTank tank;
    private MilkingRobot milkRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkRobot = milkingRobot;
        this.milkRobot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {
        if (this.milkRobot == null) {
            throw new IllegalStateException("No milkingrobot installed");
        } else {
            this.milkRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (this.milkRobot == null) {
            throw new IllegalStateException("No milkingrobot installed");
        } else {
            for (Cow cow : cows) {
                this.milkRobot.milk(cow);
            }
        }
    }
    
    public String toString() {
        return "Barn: " + this.tank.toString();
    }
    
    

}
