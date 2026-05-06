package semester2.lektion19.opgave1;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    private String navn;

    List<BogTitel> bogtitler;

    public Kunde(String navn) {
        this.navn = navn;
        this.bogtitler = new ArrayList<>();

    }

    public String getNavn() {
        return navn;
    }



    public List<BogTitel> getBogtitler() {
        return new ArrayList<>(bogtitler);
    }

    public void addBogTitel(BogTitel bogTitel) {
        bogtitler.add(bogTitel);
    }

    public void removeBogTitel(BogTitel bogTitel) {
        bogtitler.remove(bogTitel);
    }

    @Override
    public String toString() {
        return navn;
    }
}
