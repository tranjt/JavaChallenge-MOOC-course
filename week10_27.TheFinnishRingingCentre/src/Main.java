/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class Main {

    public static void main(String[] args) {
        Object b1 = new Bird("Varis", "Corvus corone cornix", 1952);
        Object b2 = new Bird("Varis", "Corvus corone cornix", 1952);     
        System.out.println(b1.equals(b2));
        
    }

}
