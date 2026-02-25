package semester2.lektion5.opgave2c;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Skole sk1 = new Skole("Aarhus Universitet");

        Studerende st1 = new Studerende(1234, "Rasmus", new ArrayList<>(2));
        st1.addKarakter(7);
        st1.addKarakter(10);

        sk1.tilføjStuderende(st1);

        System.out.println(sk1.findStuderende(1234));

        System.out.println(sk1.findStuderende(2345));
    }
}
