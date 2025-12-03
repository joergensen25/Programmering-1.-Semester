package lektioner.lektion30.opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie extends Television {
    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return getTitle() + " (" + numberOfSeasons + " seasons)." +
                " Genres: " + Arrays.toString(getGenres()) +
                ". Cast: " + getCast();
    }
}