package main.java.semester2.lektion16.opgave1;

import java.util.ArrayList;

import static main.java.semester2.lektion16.eksempler.HelperMethods.ligeTalHelper;

public class AntalLigeTal {

    public static int ligeTal(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

        int count = 0;
        if (list.get(0) % 2 == 0) {
            count = 1;
        }

        ArrayList<Integer> rest = new ArrayList<>(list);
        rest.remove(0);

        return count + ligeTal(rest);
    }

    public static int ligeTal2(ArrayList<Integer> list) {
        return ligeTalHelper(list, 0);
    }



    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(4);
        liste.add(26);
        liste.add(27);

        System.out.println(ligeTal(liste));

        System.out.println(ligeTal2(liste));
    }
}
