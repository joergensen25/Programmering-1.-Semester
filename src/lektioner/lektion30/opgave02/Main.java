package lektioner.lektion30.opgave02;

import lektioner.lektion30.opgave02.models.*;
import lektioner.lektion30.opgave02.storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage storage = initStorage();


        storage.printMovies();

        storage.printSeries();

        ArrayList<Movie> spielbergMovies = storage.findMoviesByDirector("Steven Spielberg");

        System.out.println("\nSteven Spielberg movies:");
        for (Movie m : spielbergMovies) {
            System.out.println(" - " + m);
        }

        System.out.println("\nComedy Television:");
        ArrayList<Television> foundByGenre = storage.findTelevisionByGenre(Genre.COMEDY);
        for (Television t : foundByGenre) {
            System.out.println(" - " + t);
        }



        ArrayList<Genre> wantedGenres = new ArrayList<>();
        wantedGenres.add(Genre.ADVENTURE);
        wantedGenres.add(Genre.COMEDY);

        System.out.println("\nTelevision that are either Adventure or Comedy:");
        ArrayList<Television> foundByGenres = storage.findTelevisionByGenres(wantedGenres);

        for (Television t : foundByGenres) {
            System.out.println(" - " + t);
        }

    }

    private static Storage initStorage() {
        Storage storage = new Storage();
        Director georgeLukas = new Director("George Walton Lucas Jr.", LocalDate.of(1944, 5, 14));
        Director spielberg = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18));
        Actor ford = new Actor("Harrison Ford", LocalDate.of(1942, 7, 13));
        storage.addActor(ford);
        Actor hamill = new Actor("Mark Hamill", LocalDate.of(1951, 9, 25));
        storage.addActor(hamill);
        Actor fisher = new Actor("Carrie Fisher", LocalDate.of(1965, 10, 21));
        storage.addActor(fisher);
        Actor allan = new Actor("Karen Allen", LocalDate.of(1951, 10, 5));
        storage.addActor(allan);
        Actor aniston = new Actor("Jennifer Aniston", LocalDate.of(1969, 2, 11));
        storage.addActor(aniston);
        Actor cox = new Actor("Courteney Cox", LocalDate.of(1964, 6, 15));
        storage.addActor(cox);
        Actor kudrow = new Actor("Lisa Kudrow", LocalDate.of(1963, 7, 30));
        storage.addActor(kudrow);
        Actor leBlanc = new Actor("Matt LeBlanc", LocalDate.of(1967, 7, 25));
        storage.addActor(leBlanc);
        Actor perry = new Actor("Matthew Perry", LocalDate.of(1969, 8, 19));
        storage.addActor(perry);
        Actor schwimmer = new Actor("David Schwimmer", LocalDate.of(1966, 11, 2));
        storage.addActor(schwimmer);
        Actor cranston = new Actor("Bryan Cranston", LocalDate.of(1956, 3, 7));
        storage.addActor(cranston);
        Actor paul = new Actor("Aaron Paul", LocalDate.of(1979, 8, 27));
        storage.addActor(paul);
        Actor gunn = new Actor("Anna Gunn", LocalDate.of(1968, 8, 11));
        storage.addActor(gunn);
        Actor fischer = new Actor("Jenna Fischer", LocalDate.of(1974, 3, 7));
        storage.addActor(fischer);
        Actor krasinski = new Actor("John Krasinski", LocalDate.of(1979, 10, 20));
        storage.addActor(krasinski);
        Actor carell = new Actor("Steve Carell", LocalDate.of(1962, 8, 16));
        storage.addActor(carell);

        Movie starWars = new Movie("Star Wars", 1977, georgeLukas,
                new Genre[]{Genre.ACTION, Genre.FANTACY, Genre.ADVENTURE}, 8.6,
                new ArrayList<>(List.of(ford, hamill, fisher)));
        Movie indy = new Movie("Raiders of the Lost Ark", 1981, spielberg,
                new Genre[]{Genre.ACTION, Genre.ADVENTURE}, 8.4,
                new ArrayList<>(List.of(ford, allan)));
        TVSerie friends = new TVSerie("Friends", 11,
                new Genre[]{Genre.COMEDY, Genre.ROMANCE},
                new ArrayList<>(List.of(aniston, cox, kudrow, leBlanc, perry, schwimmer)));

        TVSerie breakingBad = new TVSerie("Breaking Bad", 5,
                new Genre[]{Genre.ACTION, Genre.ADVENTURE}, new ArrayList<>(List.of(cranston, paul, gunn)));
        TVSerie theOffice = new TVSerie("The Office", 9,
                new Genre[]{Genre.COMEDY, Genre.ROMANCE}, new ArrayList<>(List.of(fischer, krasinski, carell)));

        storage.addMovie(starWars);
        storage.addMovie(indy);
        storage.addTVSerie(friends);
        storage.addTVSerie(breakingBad);
        storage.addTVSerie(theOffice);
        return storage;
    }
}