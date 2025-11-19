package ekstraPRO.lektion6.eksamensopgave2023.model;

import java.util.ArrayList;

public class Salg {
    private String købersNavn;
    private int aftaltSamletPris;

    // associering Salg --> 0..* Vare
    // TODO

    public Salg(String købersNavn, int aftaltSamletPris, ArrayList<Vare> varer) {
        this.købersNavn = købersNavn;
        this.aftaltSamletPris = aftaltSamletPris;
        // TODO varer

    }

    public String getKøbersNavn() {
        return købersNavn;
    }

    public int getAftaltSamletPris() {
        return aftaltSamletPris;
    }

    //-----------------------------------------------------

    // getVarer() metode
    // TODO

    // ingen addVare() og ingen removeVarer(),
    // da salgets varer er sat i constructor og ikke kan ændres
}
