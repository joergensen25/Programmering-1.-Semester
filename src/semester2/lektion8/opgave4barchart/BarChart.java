package semester2.lektion8.opgave4barchart;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal.  " + "Indtast et negativt tal for at afslutte: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0) {
            list.add(n);
            n = in.nextInt();
        }
        return list;
    }

    /**
     * Finds and returns the max value in the list.
     *
     * @param list
     *            the list with values.
     * @return the max value found.
     */
    public int findMax(ArrayList<Integer> list) {

        int max = 0;
        for (Integer integer : list) {
            if (max < integer) {
                max = integer;
            }
        }
        // TODO: find max in list
        return max;
    }

    /**
     * Prints out a BarChart of the values using the System.out.println method.
     */
    public void printBarChart() {
        int max = findMax(this.list);

        for (int value : list) {
            int stars = (int) Math.round((double) value / max * 40);

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // TODO: print out bar chart
    }
}
