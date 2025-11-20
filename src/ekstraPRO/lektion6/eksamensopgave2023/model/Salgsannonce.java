package ekstraPRO.lektion6.eksamensopgave2023.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salgsannonce {
    private static int antalAnnoncer = 0; // Statisk felt (er udenfor objekterne)
    private int annonceNummer;
    private boolean aktiv;
    private LocalDate udløbsdato;

    // komposition SalgsAnnonce (del) --> 1 Sælger (helhed)
    private Sælger sælger;

    // associering SalgsAnnonce --> 0..* Vare
    private final ArrayList<Vare> varer = new ArrayList<>();

    Salgsannonce(Sælger sælger) { // OBS: package visible (Er ikke public = Kan kun bruges i model-package)
        antalAnnoncer++;
        this.annonceNummer = antalAnnoncer;
        this.aktiv = true;
        this.udløbsdato = LocalDate.now().plusMonths(1);
        this.sælger = sælger; // Salgsannonce --> Sælger
    }

    public static int getAntalAnnoncer() {
        return antalAnnoncer;
    }

    public int getAnnonceNummer() {
        return annonceNummer;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public LocalDate getUdløbsdato() {
        return udløbsdato;
    }

    //-----------------------------------------------------

    // getSælger() metode
    public Sælger getSælger() {
        return sælger;
    }


    // ingen setSælger() metode,
    // da en salgsannonce ikke kan flyttes til en anden sælger (komposition)

    //-----------------------------------------------------

    // getVarer() metode
    public ArrayList<Vare> getVarer() {
        return new ArrayList<>(varer);
    }


    // addVare() metode
    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare); // Salgsannonce --> Vare
            vare.setSalgsannonce(this);// Vare --> Salgsannonce
        }
    }

    // removeVare() metode
    public void removeVare(Vare vare) {
        if (varer.contains(vare)) {
            varer.remove(vare); // Salgsannonce -/-> Vare
            vare.setSalgsannonce(null);// Vare -/-> Salgsannonce
        }
    }

    //-----------------------------------------------------

    // S2
    public int samletAnnonceUdbud() {
        // TODO
        return 0;
    }
}
