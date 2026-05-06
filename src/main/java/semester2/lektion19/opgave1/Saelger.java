package main.java.semester2.lektion19.opgave1;

import java.util.ArrayList;
import java.util.List;

public class Saelger implements Observer {

    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {

        if (s instanceof BogTitel aktuelBog) {
            List<String> andreTitler = new ArrayList<>();

            for (Kunde k : aktuelBog.getKunder()) {
                for (BogTitel b : k.getBogtitler()) {
                    if (!b.getTitel().equals(aktuelBog.getTitel())) {
                        andreTitler.add(b.getTitel());
                    }
                }
            }

            System.out.println(navn + ": Kunder der har købt: \"" + aktuelBog.getTitel()
                    + "\" har også købt:");

            if (andreTitler.isEmpty()) {
                System.out.println(" Ingen andre bøger fundet.");
            } else {
                for (String titel : andreTitler) {
                    System.out.println(" - \"" + titel + "\"");
                }
            }
        }
    }
}
