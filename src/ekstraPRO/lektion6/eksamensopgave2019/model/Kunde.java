package ekstraPRO.lektion6.eksamensopgave2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    @Override
    public String toString() {
        return navn + " " + mobil;
    }

    //-----------------------------------------------------
    // associering Kunde --> 0..* Bestilling

    // Denne kunde kan have mange bestillinger,
    // derfor er linket af typen ArrayList<Bestilling>
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    // getBestillinger() metode
    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }


    // Da forbindelsen er dobbeltrettet, skal addBestilling() metoden
    // sætte linket begge veje.
    public void addBestilling(Bestilling bestilling) {
        if (!bestillinger.contains(bestilling)) {
            bestillinger.add(bestilling); // Kunde --> Bestilling
             bestilling.setKunde(this);// Bestilling --> Kunde
        }
    }

    // Da forbindelsen er dobbeltrettet, skal removeBestilling() metoden
    // fjerne linket begge veje.
    public void removeBestilling(Bestilling bestilling) {
        if (bestillinger.contains(bestilling)) {
            bestillinger.remove(bestilling);
            bestilling.setKunde(null);
        }
    }

    //-----------------------------------------------------
    // S5

    // løb kundes bestillinger igennem
    // og husk bestillingens pladser for de bestillinger
    // som er til den givne forestilling på den givne dag
    // returner en Arraylist med de adderede pladser

    // ArrayList<Plads> bestiltePladser = new ArrayList<>();
    // for hver af kundens bestillinger
    //     hvis bestillingen har den givne forestilling og den givne dato
    //          adder alle bestillingens pladser til bestiltePladser
    // returner bestiltePladser

    // S5

    public ArrayList<Plads> bestiltePladserTilForestillingPåDag(Forestilling forestilling, LocalDate dato) {
        ArrayList<Plads> bestiltePladser = new ArrayList<>();

        for (Bestilling bestilling : bestillinger) {
            if (bestilling.getForestilling().equals(forestilling) && bestilling.getDato().equals(dato)) {
                bestiltePladser.addAll(bestilling.getPladser());
            }
        }
        return bestiltePladser;
    }
}
