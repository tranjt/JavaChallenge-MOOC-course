/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Address {
    private String street, city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    
    
    public void setStreet(String street) {
        this.street = street;
    }
    
      public void setcity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "address: " + this.street + " " + this.city;
    }
      
      
}
