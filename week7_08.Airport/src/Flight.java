/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Flight {

    private Airplane plane;
    private String destinationCode;
    private String departureCode;

    public Flight(Airplane plane, String destinationCode, String departureCode) {
        this.plane = plane;
        this.destinationCode = destinationCode;
        this.departureCode = departureCode;
    }

 

    @Override
    public String toString() {
        return this.plane + " (" + destinationCode + "-" + departureCode + ")";
    }

}
