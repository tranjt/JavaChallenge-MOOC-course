/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Zun
 */
public class Farm implements Alive{
    
    private Collection<Cow> cows = new ArrayList<Cow>();
    private String name;
    private Barn barn;
    
    public Farm(String name, Barn barn ){
        this.name = name;
        this.barn = barn;
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }

    @Override
    public void liveHour() {
        if(!this.cows.isEmpty()){
            for(Cow cow : this.cows){
                cow.liveHour();
            }
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void installMilkingRobot(MilkingRobot milkrobotRobot) {
        this.barn.installMilkingRobot(milkrobotRobot);
    }
    
    public String toString(){
        String cowInBarn = "";
        for(Cow cow : this.cows){
            cowInBarn += cow.toString() + "\n";
        }
        
        return "Farm owner: " + this.name +"\n" +
                "Barn bulk tank: " + this.barn.getBulkTank() + 
                "Animals: \n" + cowInBarn;
    }
    
}
