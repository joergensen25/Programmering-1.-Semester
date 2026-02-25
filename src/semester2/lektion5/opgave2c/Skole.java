package semester2.lektion5.opgave2c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class Skole {
    private String navn;
    private Map<Integer, Studerende> studerendeMap;


    public Skole(String navn) {
        this.navn = navn;
        this.studerendeMap = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void tilføjStuderende(Studerende studerende) {
        studerendeMap.put(studerende.getStudienr(), studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeMap.remove(studerende.getStudienr(), studerende);
    }


    public double gennemsnit() {
        AtomicInteger sum = new AtomicInteger();
        int count = 0;

        studerendeMap.forEach((k, studerende) -> {
            sum.addAndGet(k);
        });

        return 0;
    }

    public Studerende findStuderende(int studienr) {
        if (studerendeMap.containsKey(studienr)) {
            return studerendeMap.get(studienr);
        }
        return null;
    }

}
