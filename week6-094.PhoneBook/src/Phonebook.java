
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Phonebook {

    private ArrayList<Person> phoneList = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        phoneList.add(person);
    }

    public void printAll() {
        for (Person person : phoneList) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {

        for (Person person : phoneList) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }

        return "number not known";
    }

}
