/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Zun
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        ArrayList<Film> filmList = new ArrayList<Film>(this.ratingRegister.filmRatings().keySet());
        FilmComparator filmComparator = new FilmComparator(this.ratingRegister.filmRatings());

        if (!this.ratingRegister.reviewers().contains(person)) {
            Collections.sort(filmList, filmComparator);
            return filmList.get(0);
        }

        List<Film> filmList2 = getHighestRatingNotSeenFilms(person);

        if (!filmList2.isEmpty()) {
            Collections.sort(filmList2, filmComparator);
            return filmList2.get(0);
        }

        return null;
    }

    private List<Film> getHighestRatingNotSeenFilms(Person person) {

        Map<Film, Rating> personFilms = this.ratingRegister.getPersonalRatings(person);
        Map<Film, Rating> preferedPersonFilms = this.ratingRegister.getPersonalRatings(getPersonWithSameFilmPreferences(person));

        List<Film> perferedFilmsList = new ArrayList<Film>(preferedPersonFilms.keySet());
        List<Film> personFilmsList = new ArrayList<Film>(personFilms.keySet());
        perferedFilmsList.removeAll(personFilmsList);
        return perferedFilmsList;
    }

    private Person getPersonWithSameFilmPreferences(Person person) {
        List<Person> persons = this.ratingRegister.reviewers();
        Map<Person, Integer> reviewersSimilarityScoreMap = new HashMap<Person, Integer>();

        for (Person otherReviewer : persons) {
            if (!otherReviewer.equals(person)) {
                reviewersSimilarityScoreMap.put(otherReviewer, calculateFilmSimilarityScore(person, otherReviewer));
            }
        }

        Person highestScorePerson = reviewersSimilarityScoreMap.keySet().iterator().next();
        int highestScore = reviewersSimilarityScoreMap.get(highestScorePerson);

        for (Person tempPerson : reviewersSimilarityScoreMap.keySet()) {
            if (highestScore < reviewersSimilarityScoreMap.get(tempPerson)) {
                highestScorePerson = tempPerson;
                highestScore = reviewersSimilarityScoreMap.get(highestScorePerson);
            }
        }

        return highestScorePerson;
    }

    private int calculateFilmSimilarityScore(Person person1, Person person2) {
        int similarityScore = 0;
        Map<Film, Rating> person1Films = this.ratingRegister.getPersonalRatings(person1);
        Map<Film, Rating> person2Films = this.ratingRegister.getPersonalRatings(person2);

        for (Film film : new ArrayList<Film>(person1Films.keySet())) {
            if (person2Films.containsKey(film)) {
                similarityScore += person1Films.get(film).getValue() * person2Films.get(film).getValue();
            }
        }
        System.out.println(similarityScore);
        return similarityScore;

    }

}
