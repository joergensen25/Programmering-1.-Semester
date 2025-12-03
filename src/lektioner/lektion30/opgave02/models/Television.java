package lektioner.lektion30.opgave02.models;

import java.util.ArrayList;

public class Television {
    private String title;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public Television(String title, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.genres = genres;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }
}
