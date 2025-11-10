package ekstraPRO.lektion3.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMåned;

    public Bolig(int kvm, String adresse, int prisPrMåned) {
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMåned = prisPrMåned;
    }

    public int getKvm() {
        return kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getPrisPrMåned() {
        return prisPrMåned;
    }

    public void setKvm(int kvm) {
        this.kvm = kvm;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPrisPrMåned(int prisPrMåned) {
        this.prisPrMåned = prisPrMåned;
    }

    @Override
    public String toString() {
        return adresse;
    }

    //-----------------------------------------------------

    private ArrayList<Lejeaftale> lejeaftaler = new ArrayList<>();

    public Lejeaftale createLejeaftale(LocalDate fraDato) {
        Lejeaftale lejeaftale = new Lejeaftale(fraDato);
        lejeaftaler.add(lejeaftale);
        return lejeaftale;
    }

    public ArrayList<Lejeaftale> getLejeaftaler() {
        return new ArrayList<>(lejeaftaler);
    }
}
