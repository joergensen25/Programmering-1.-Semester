package ekstraPRO.lektion6.eksamensopgave2019.storage;

import ekstraPRO.lektion6.eksamensopgave2019.model.Forestilling;
import ekstraPRO.lektion6.eksamensopgave2019.model.Kunde;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Forestilling> forestillinger = new ArrayList<>(); // Er et felt, derfor private
    private static ArrayList<Kunde> kunder = new ArrayList<>(); // Statiske metoder kan kaldes på klasser.
                                                                // Ikke-statiske metoder kan kun kaldes på objekter

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public static void addForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static void addKunde(Kunde kunde) {
        kunder.add(kunde);
    }



}
