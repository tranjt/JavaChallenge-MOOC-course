
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Person implements Comparable<Person>{

    private String name;
    private List<String> phoneNumbers;
    private Address address;

    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
    }

    public void addPhoneNumber(String number) {
        this.phoneNumbers.add(number);
    }

    public void addAdress(Address address) {
        this.address = address;
    }

    public List<String>  getPhoneNumber() {
        return this.phoneNumbers;
    }

    public String getAddress() {
        if (address != null) {
            return this.address.toString();
        }
        return "address unknown";

    }

    public String numberToString() {
        if (this.phoneNumbers.isEmpty()) {
            return "";
        }

        String numbers = "";
        for (String number : this.phoneNumbers) {
            numbers += " " + number + "\n";
        }
        return numbers;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {

        return "  " + this.address + "\n"
                + "  " + this.phoneNumbers;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.toLowerCase().compareTo(o.getName().toLowerCase());
    }

}
