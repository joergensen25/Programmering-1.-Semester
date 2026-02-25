package semester2.lektion5.opgave1;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(34);
        hs.add(12);
        hs.add(23);
        hs.add(45);
        hs.add(67);
        hs.add(34);
        hs.add(98);
        System.out.println(hs);

        hs.add(23);

        System.out.println(hs);
        hs.remove(67);
        System.out.println(hs);
    }
}
