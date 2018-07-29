
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate) {
        if (this.owners.get(plate) != null) {
            return this.owners.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) != null) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<String>();
        String ownerName;
        for (RegistrationPlate plate : this.owners.keySet()) {
            ownerName = this.owners.get(plate);
            if(!uniqueOwners.contains(ownerName)) {
                uniqueOwners.add(ownerName);
                System.out.println(ownerName);
            }
            
        }
    }
    
}
