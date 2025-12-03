package lektioner.lektion30.opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie extends Television {
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }


    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return getTitle() +
                " (" + productionYear +
                "). " + director +
                ". Genres: " + Arrays.toString(getGenres()) +
                ". Rating: " + rating +
                ". Cast: " + getCast();
    }
}