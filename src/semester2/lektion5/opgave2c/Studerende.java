package semester2.lektion5.opgave2c;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private int studienr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studienr, String navn, List<Integer> karakterer) {
        this.studienr = studienr;
        this.navn = navn;
        this.karakterer = new ArrayList<>();
    }

    public int getStudienr() {
        return studienr;
    }

    public String getNavn() {
        return navn;
    }

    public void addKarakter(int karakter) {
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer() {
        return karakterer;
    }

    @Override
    public String toString() {
        return "Studerende: " + navn + " (studienr: " + studienr + ") med karakterer: " + karakterer;
    }

}
