package semester2.lektion5.opgave2b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Skole sk = new Skole("Erhversakademi Aarhus");

        Studerende st1 = new Studerende(1234, "Rasmus", new ArrayList<>(5));
        Studerende st2 = new Studerende(2345, "Jens", new ArrayList<>(5));
        Studerende st3 = new Studerende(3456, "Carsten", new ArrayList<>(5));
        st1.addKarakter(7);
        st1.addKarakter(10);
        st1.addKarakter(12);
        st1.addKarakter(10);
        st1.addKarakter(10);

        st2.addKarakter(7);
        st2.addKarakter(4);
        st2.addKarakter(10);
        st2.addKarakter(4);
        st2.addKarakter(7);

        st3.addKarakter(2);
        st3.addKarakter(4);
        st3.addKarakter(0);
        st3.addKarakter(2);
        st3.addKarakter(7);

        sk.addStuderende(st1);
        sk.addStuderende(st2);
        sk.addStuderende(st3);
        sk.addStuderende(st3); // Tilføjes ikke til HashSet af studerende, da det er en duplikat.

        System.out.println(sk.gennemsnit());

        System.out.println(sk.findStuderende(1234));

        System.out.println(sk);
    }
}
