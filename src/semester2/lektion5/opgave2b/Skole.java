package semester2.lektion5.opgave2b;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studerendeSet;


    public Skole(String navn) {
        this.navn = navn;
        this.studerendeSet = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeSet.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeSet.remove(studerende);
    }


    public double gennemsnit() {
        int sum = 0;
        int count = 0;

        for (Studerende s : studerendeSet) {
            for (int k : s.getKarakterer()) {
                sum+= k;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) sum/count;
    }

    public Studerende findStuderende(int studienr) {
        for (Studerende s : studerendeSet) {
            if (studienr == s.getStudienr()) {
                return s;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole: " + navn + " (antal studerende: " + studerendeSet.toArray().length + ")";
    }
}
