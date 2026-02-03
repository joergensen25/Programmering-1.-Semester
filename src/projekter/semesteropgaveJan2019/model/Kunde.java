package projekter.semesteropgaveJan2019.model;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    public ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
        this.bestillinger = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }

    public void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
        bestilling.setKunde(this);

    }
}
