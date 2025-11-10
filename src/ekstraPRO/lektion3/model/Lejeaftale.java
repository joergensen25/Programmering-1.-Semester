package ekstraPRO.lektion3.model;

import java.time.LocalDate;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato; // nullable

    public Lejeaftale(LocalDate fraDato) {
        this.fraDato = fraDato;
        this.tilDato = null;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public void setFraDato(LocalDate fraDato) {
        this.fraDato = fraDato;
    }

    public void setTilDato(LocalDate tilDato) {
        this.tilDato = tilDato;
    }

    //-----------------------------------------------------

    private Lejer lejer1;
    private Lejer lejer2;

    // Alternativt:

    // private Lejer[] lejere = new Lejer[2];


    public Lejer getLejer1() {
        return lejer1;
    }

    public Lejer getLejer2() {
        return lejer2;
    }

    // Bruges både til at indsætte en lejer og fjerne en lejer
    // Parameteren 'lejer' kan være null
    public void setLejer1(Lejer lejer) {
        this.lejer1 = lejer;
    }

    // Parameteren 'lejer' kan være null
    public void setLejer2(Lejer lejer) {
        this.lejer2 = lejer;
    }
 }