package lektioner.lektion30.opgave02.storage;

import lektioner.lektion30.opgave02.models.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<Television> television = new ArrayList<>();

    public void addMovie(Movie movie) {
        television.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        television.add(serie);
    }

    public void printMovies() {
        System.out.println("\n---- Movies ----");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public void printSeries() {
        System.out.println("\n---- Series ----");
        for (TVSerie s : series) {
            System.out.println(s);
        }
    }

    public ArrayList<Movie> findMoviesByDirector(String directorName) {
        ArrayList<Movie> result = new ArrayList<>();

        for (Movie m : movies) {
            if (m.getDirector().getName().equalsIgnoreCase(directorName)) {
                result.add(m);
            }
        }
        return result;
    }

    public ArrayList<Television> findTelevisionByGenre(Genre genre) {
        ArrayList<Television> result = new ArrayList<>();

        for (Television t : television) {
            for (Genre g : t.getGenres()) {
                if (g == genre) {
                    result.add(t);
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Television> findTelevisionByGenres(ArrayList<Genre> searchGenres) {
        ArrayList<Television> result = new ArrayList<>();

        for (Television t : television) {
            for (Genre g : t.getGenres()) {
                if (searchGenres.contains(g)) {
                    result.add(t);
                    break;
                }
            }
        }
        return result;
    }
}
