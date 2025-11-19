package ekstraPRO.lektion6.eksamensopgave2023.model;

import java.util.ArrayList;

public class Sælger {
    private String navn;
    private int studiekortNummer;
    private String mobil;

    // komposition Sælger --> 0..* SalgsAnnonce
    private final ArrayList<Salgsannonce> salgsannoncer = new ArrayList<>(); // linkattribut


    public Sælger(String navn, int studiekortNummer, String mobil) {
        this.navn = navn;
        this.studiekortNummer = studiekortNummer;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public int getStudiekortNummer() {
        return studiekortNummer;
    }

    public String getMobil() {
        return mobil;
    }

    @Override
    public String toString() {
        return navn + "(" + studiekortNummer + ") " + mobil;
    }

    //-----------------------------------------------------

    // getSalgsannoncer() metode
    public ArrayList<Salgsannonce> getSalgsannoncer() {
        return new ArrayList<>(salgsannoncer);
    }


    // createSalgsannonce() metode
    public Salgsannonce createSalgsannonce() {
        Salgsannonce salgsannonce = new Salgsannonce(this); // Salgsannonce --> Sælger
        salgsannoncer.add(salgsannonce); // Sælger --> Salgsannonce
        return salgsannonce;
    }

    // ingen addSalgsannonce() og ingen removeSalgsannonce(),
    // da en salgsannonce ikke kan flyttes til en anden sælger (komposition)

    //-----------------------------------------------------

    // S3
    public ArrayList<Vare> alleIkkeSolgteVarerIKategori(Varekategori varekategori) {
        // TODO
        return null;
    }
}

