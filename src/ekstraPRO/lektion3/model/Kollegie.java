package ekstraPRO.lektion3.model;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;

    public Kollegie(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //-----------------------------------------------------

    private ArrayList<Bolig> boliger = new ArrayList<>();

    public ArrayList<Bolig> getBoliger() {
        return new ArrayList<>(boliger);
    }

    public void addBolig(Bolig bolig) {
        if (!this.boliger.contains(bolig)) {
            boliger.add(bolig);
        }

    }

    public void removeBolig(Bolig bolig) {
        if (this.boliger.contains(bolig)) {
            boliger.remove(bolig);
        }
    }

    // Create-metoder skal returnere det, de creater
    public Bolig createBolig(int kvm, String adresse, int prisPrMåned) {
        Bolig bolig = new Bolig(kvm, adresse, prisPrMåned);
        boliger.add(bolig);
        return bolig;
    }

    public int getAntalLejeaftaler() {
        int antalLejeaftaler = 0;
        for (Bolig bolig : boliger) {
            antalLejeaftaler += bolig.getLejeaftaler().size();
        }

        return antalLejeaftaler;
    }

    public double gennemsnitligAntalDage() {
        int antalDageUdlejet = 0;
        int antalAfsluttedeUdlejninger = 0;

        for (Bolig bolig : boliger) {
            for (Lejeaftale lejeaftale : bolig.getLejeaftaler()) {
                if (lejeaftale.getTilDato() != null) {
                    antalAfsluttedeUdlejninger ++;
                    antalDageUdlejet += (int) lejeaftale.getFraDato().until(lejeaftale.getTilDato(), ChronoUnit.DAYS);
                }
            }
        }
        return 1.0 * antalDageUdlejet / antalAfsluttedeUdlejninger;
    }
    // dato1.until(dato2, ChromeUnit.DAYS);

}

// Aggregering:
// - add
// - remove
// - get
// - create

// Komposition
// - create
// - remove (sjældent)
// - get

// Associereing:
// - add
// - remove
// - get
