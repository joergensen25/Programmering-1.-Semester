package semester2.lektion5.opgave2a;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studerendeList;


    public Skole(String navn) {
        this.navn = navn;
        this.studerendeList = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeList.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeList.remove(studerende);
    }


    public double gennemsnit() {
        int sum = 0;
        int count = 0;

        for (Studerende s : studerendeList) {
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
        for (Studerende s : studerendeList) {
            if (studienr == s.getStudienr()) {
                return s;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole: " + navn + " (antal studerende: " + studerendeList.toArray().length + ")";
    }
}
