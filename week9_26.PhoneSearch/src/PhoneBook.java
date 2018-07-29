
import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class PhoneBook {

    private Map<String, Person> persons = new HashMap<String, Person>();
    private Map<String, String> phoneNumbers = new HashMap<String, String>();

    public void addNumber(String name, String number) {
        if (this.persons.containsKey(name)) {
            this.persons.get(name).addPhoneNumber(number);
            phoneNumbers.put(number, name);
        } else {
            Person newPerson = new Person(name);
            newPerson.addPhoneNumber(number);
            this.persons.put(name, newPerson);
            this.phoneNumbers.put(number, name);
        }
    }

    public String searchPhoneNumberByName(String name) {
        if (this.persons.containsKey(name)) {
            return this.persons.get(name).numberToString();
        }
        return "not found";
    }

    public String searchPersonByPhoneNumber(String number) {
        if (this.phoneNumbers.containsKey(number)) {
            return this.phoneNumbers.get(number);
        }
        return "not found";
    }

    public void addAdress(String name, String street, String city) {
        if (this.persons.containsKey(name)) {
            this.persons.get(name).addAdress(new Address(street, city));
        } else {
            Person newPerson = new Person(name);
            newPerson.addAdress(new Address(street, city));
            this.persons.put(name, newPerson);
        }
    }

    public String searchAddress(String name) {
        if (this.persons.containsKey(name)) {
            return this.persons.get(name).getAddress();
        }
        return "address unknown";
    }

    public String searchPersonalInfo(String name) {
        String info = "", numbers;
        Person person;
        if (this.persons.containsKey(name)) {
            person = this.persons.get(name);
            info += "  address: " + person.getAddress() + "\n";
            numbers = person.numberToString();
            if (numbers != "") {
                info += "  phone numbers:\n";
                info += numbers;
            } else {
                info += "  phone number not found\n";
            }
            return info;
        }
        return "not found";
    }

    public void deletePersonByName(String name) {
        Person person = this.persons.get(name);
        if (person != null) {
            for (String number : person.getPhoneNumber()) {
                this.phoneNumbers.remove(number);
            }
        }
        this.persons.remove(name);
    }

    public String filteredSearch(String searchWord) {        
        ArrayList<Person> filteredSearch = new ArrayList<Person>();
        for (String person : this.persons.keySet()) {
            if (person.contains(searchWord) || this.persons.get(person).getAddress().contains(searchWord)) {
                filteredSearch.add(this.persons.get(person));
            }
        }
        if(filteredSearch.isEmpty()){
            return "not found";
        }
        Collections.sort(filteredSearch);
        return listPersonToString(filteredSearch);
    }

    public String listPersonToString(ArrayList<Person> nameList) {
        String list = "";
        for (Person person : nameList) {
            System.out.println("");
            list += person.getName() + "\n";
            list += "address: " + person.getAddress() + "\n";
            list += "phone numbers:\n";
            list += person.numberToString() + "\n";
        }
        return list;
    }
}
