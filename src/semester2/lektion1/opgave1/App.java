package semester2.lektion1.opgave1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Mekaniker> mekanikere = new ArrayList<>();
        Mekaniker m1 = new Mekaniker("Jens Hansen", "Vejen 3", "2014", 240);
        Mekaniker m2 = new Mekaniker("Philip Larsen", "Overblikket 37", "2009", 280);
        Værkfører v1 = new Værkfører("Jonas Hansen", "Søndergade 21", "2008", 300, "2014", 500);
        Værkfører v2 = new Værkfører("Laura Jensen", "Vestergade 33", "2010", 290, "2016", 400);
        Synsmand s1 = new Synsmand("Carsten Jørgensen", "Østergade 72", "2006", 285, 25);


        mekanikere.add(m1);
        mekanikere.add(m2);
        mekanikere.add(v1);
        mekanikere.add(v2);
        mekanikere.add(s1);


        System.out.println(samletLoen(mekanikere));

        System.out.println(v2.beregnLoen());

        System.out.println(s1.beregnLoen());
    }

    private ArrayList<Mekaniker> mekanikere = new ArrayList<>();

    public static double samletLoen(ArrayList<Mekaniker> list) {
        int sum = 0;
        for (Mekaniker mekaniker : list) {
            sum = sum + mekaniker.beregnLoen();
        }
        return sum;
    }
}
