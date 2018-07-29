/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Zun
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return ratingSum(this.ratings.get(o2)) - ratingSum(this.ratings.get(o1));
    }

    private int ratingSum(List<Rating> filmRatings) {
        int ratingSum = 0;
        for (Rating rating : filmRatings) {
            ratingSum += rating.getValue();
        }
        return ratingSum;
    }

}
