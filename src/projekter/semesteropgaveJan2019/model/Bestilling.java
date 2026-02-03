package projekter.semesteropgaveJan2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;


    // links
    private Forestilling forestilling; // 1
    private Kunde kunde; // 1
    private ArrayList<Plads> pladser; // 0..*

    public Bestilling(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }


    public void addPlads(Plads plads) {
        pladser.add(plads);
    }

    public void addPladser(ArrayList<Plads> pladser) {
        this.pladser.addAll(pladser);
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setForestilling(Forestilling forestilling) {
        this.forestilling = forestilling;
    }

}
