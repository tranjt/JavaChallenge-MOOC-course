/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class CD implements ToBeStored {
    private String artis;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artis, String title, int publishingYear) {
        this.artis = artis;
        this.title = title;
        this.publishingYear = publishingYear;
    }
     public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artis + ": " + this.title + " (" + this.publishingYear + ")";
    }


    
    
}
