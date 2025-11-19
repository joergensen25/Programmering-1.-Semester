package ekstraPRO.lektion6.eksamensopgave2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    @Override
    public String toString() {
        return navn + ", " + startDato + ", " + slutDato;
        // return String.format("%s, %s, %s", navn, startDato, slutDato);
    }

    //-----------------------------------------------------
    // composition Forestilling --> 0..* Bestilling

    // Denne forestilling kan have mange bestillinger,
    // derfor er linket af typen ArrayList<Bestilling>.
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    // getBestillinger() metode
   public ArrayList<Bestilling> getBestillinger() {
       return new ArrayList<>(bestillinger);
   }
    // Helheden (Forestilling) i en komposition skal skabe delen (Bestilling),
    // derfor en opretBestilling() metode.
    public Bestilling opretBestilling(LocalDate dato, Kunde kunde) {
        Bestilling bestilling = new Bestilling(dato, this, kunde);
        // linjen herover: Bestilling --> Forestilling og Bestilling --- Kunde dobbeltrettet
        bestillinger.add(bestilling); // Forestilling --> Bestilling
        return bestilling;
    }

    // Delen (Bestilling) i en komposition kan ikke flyttes til en anden helhed (Forestilling),
    // derfor ingen addBestilling() eller removeBestilling() metode.
    // (Dog kan removeBestilling() være nødvendig, hvis en bestilling kan slettes.)

    //-----------------------------------------------------
    // Opgave S3

    // løb forestillingens bestillinger igennem
    // og adder bestillingens antal pladser for de bestillinger som har den givne dato
    // returner det samlede antal pladser

    // int antalBestiltePladser = 0
    // for hver af forestillingens bestillinger
    //     hvis bestillingen har den givne dao
    //         adder bestillingens antal pladser til antalBestiltePladser
    // return antalBestiltePladser

    // S3
    // TODO

    //-----------------------------------------------------
    // Opgave S4

    // løb datoerne fra startDato til og med slutdato igennem
    // og husk undervejs det største antal bestilte pladser og den tilhørende dato
    // returner den huskede dato

    // LocalDate succesDato = null
    // int maxAntalBestiltePladser = 0
    // for hver dato fra startDato til og med slutDato
    //     hvis antal bestilte pladser på datoen > maxAntalBestiltePladser
    //         maxAntalBestiltePladser = antal bestilte pladser på datoen
    //         succesDato = dato
    // return succesDato

    // S4
    // TODO

}
