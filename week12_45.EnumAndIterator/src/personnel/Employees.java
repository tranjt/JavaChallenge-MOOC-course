/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Zun
 */
public class Employees {

    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public void add(List<Person> persons) {
        this.persons.addAll(persons);
    }

    public void print() {
        Iterator<Person> iterable = this.persons.iterator();
        Person person;
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterable = this.persons.iterator();
        Person person;
        while (iterable.hasNext()) {
            person = iterable.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterable = this.persons.iterator();    
        while (iterable.hasNext()) {           
            if ( iterable.next().getEducation() == education) {
                iterable.remove();
            }
        }
    }

}
