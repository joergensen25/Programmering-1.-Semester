package lektioner.lektion29.opgave03;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave03Main {
    public static void main(String[] args) {
        int[] intArray1 = {2, 4, 6, 8, 10, 12, 14};
        int[] intArray2 = {1, 2, 4, 5, 6, 9, 12, 17};

        int[] fælles = sharedNumbers(intArray1, intArray2);

        System.out.println(Arrays.toString(fælles));

        int[] nonShared = nonSharedNumbers(intArray1, intArray2);

        System.out.println(Arrays.toString(nonShared));

    }

    public static int[] sharedNumbers(int[] a1, int[] a2) {

        ArrayList<Integer> list = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] < a2[i2]) {
                i1++;
            } else if (a1[i1] > a2[i2]) {
                i2++;
            } else {
                list.add(a1[i1]);
                i1++;
                i2++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static int[] nonSharedNumbers(int[] a1, int[] a2) {

        ArrayList<Integer> list = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] < a2[i2]) {
                list.add(a1[i1]);
                i1++;

            } else if (a1[i1] > a2[i2]) {
                list.add(a2[i2]);
                i2++;
            } else {
                i1++;
                i2++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
