package ekstraPRO.lektion6.eksamensopgave2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;

    // RÅD (REGEL):
    // Hvis en klasse har en tvungen forbindelse fra klassen til en anden klasse
    // (dvs. forbindelsen ender i 1 ved den anden klasse),
    // så skal klassens konstruktor have den anden klasse som parameter.

    // Bestilling har en tvungen forbindelse til både Forestilling og Kunde,
    // derfor tilføjes Forestilling og Kunde som parametre i konstruktoren for Bestilling.
    // Og så skal konstruktoren sætte linkene til Forestilling og Kunde.
    Bestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling; // Bestilling --> Forestilling
        this.kunde = kunde; // Bestilling --> Kunde
        kunde.addBestilling(this); // Kunde --> Bestilling
    }

    public LocalDate getDato() {
        return dato;
    }

    //-----------------------------------------------------
    // associering Bestilling --> 0..* Plads

    // Denne bestilling kan have mange pladser,
    // derfor er linket af typen ArrayList<Bestilling>.
    private ArrayList<Plads> pladser = new ArrayList<>();

    // getPladser() metode
    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    // addPlads() metode
    public void addPlads(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads); // Bestilling --> Plads
        }
    }

    // removePlads() metode
    public void removePlads(Plads plads) {
        if (pladser.contains(plads)) {
            pladser.remove(plads);
        }
    }

    //-----------------------------------------------------
    // composition Bestilling --> 1 Forestilling

    // Denne bestilling er forbundet til præcis en forestilling,
    // derfor er linket af typen Forestilling.
    private Forestilling forestilling;

    // getForestilling() metode
    public Forestilling getForestilling() {
        return forestilling;
    }

    // Delen (denne bestilling) kan ikke ændre helhed (Forestilling),
    // derfor ingen setForestilling() metode.

    //-----------------------------------------------------
    // associering Bestilling --> 1 Kunde

    // Denne bestilling er forbundet til præcis en kunde,
    // derfor er linket af typen Kunde.
    private Kunde kunde;

    // getKunde() metode
    public Kunde getKunde() {
        return kunde;
    }

    // Denne bestilling kan skifte kunde,
    // derfor er en setKunde() metode nødvendig.
    // Da forbindelsen er dobbeltrettet, skal metoden sætte linket begge veje.
    // Bemærk, at setKunde() metoden fjerner linket til den gamle kunde,
    // før der linkes til den nye kunde.
    public void setKunde(Kunde kunde) {
        if (this.kunde != kunde) {
            Kunde oldKunde = this.kunde;
            if (oldKunde != null) {
                oldKunde.removeBestilling(this);
            }
            this.kunde = kunde;
            if (kunde != null) {
                kunde.addBestilling(this);
            }
        }
    }

    //-----------------------------------------------------
    // S2

    // løb bestillingens pladser igennem
    // og adder pladsernes pris
    // returner den samlede pris

    // int samletPris = 0
    // for hver af bestillingens pladser
    //     adder pladsens pris til samletPris
    // return samletPris

    // S2
    // TODO

}
