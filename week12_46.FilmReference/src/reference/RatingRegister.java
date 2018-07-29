/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Zun
 */
public class RatingRegister {

    private Map<Film, List<Rating>> films;
    private Map<Person, HashMap<Film, Rating>> persons;

    public RatingRegister() {
        this.films = new HashMap<Film, List<Rating>>();
        this.persons = new HashMap<Person, HashMap<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {
        if (!this.films.containsKey(film)) {
            this.films.put(film, new ArrayList<Rating>());
        }
        this.films.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        if (this.films.containsKey(film)) {
            return this.films.get(film);
        }
        return null;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.films;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.persons.containsKey(person)) {
            this.persons.put(person, new HashMap<Film, Rating>());
        }

        this.persons.get(person).put(film, rating);
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (this.persons.containsKey(person)) {
            if (this.persons.get(person).containsKey(film)) {
                return this.persons.get(person).get(film);
            }
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (this.persons.get(person) == null){
            return new HashMap<Film, Rating>();
        }
        return this.persons.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(this.persons.keySet());
    }

}
