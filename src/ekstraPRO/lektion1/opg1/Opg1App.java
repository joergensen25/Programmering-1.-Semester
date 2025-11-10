package ekstraPRO.lektion1.opg1;

import java.util.Arrays;

public class Opg1App {
    public static void main(String[] args) {

        // Assignment ( .. = .. )
        // int[] numbers = new int[10]; // Variabel på venstresiden opdateres
        // numbers[0] = 45 + "Per".length();// Først udregnes højresiden, så opdateres variablen
        // numbers[1] = 27; // på venstresiden
        // etc

        int[] numbers = {45, 27, -12, 15, -8, -4, 0, 0 ,0 ,0}; // Godt hvis man i forvejen kender tallene
        for (int i = 5; i >= 2 ; i--) {
            numbers[i+1] = numbers[i];

        }
        numbers[2] = 17;
        System.out.println("numbers = " + Arrays.toString(numbers));

        for (int i = 1; i <= 6; i++) {
            numbers[i] = numbers[i+1];
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        
        add(numbers, 30);
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("count = " + negativeCount(numbers));
        System.out.println("positive array = " + positiveValues(numbers));

    }
    
    public static void add(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = value;
                return;
            }

            
        }
    }
    public static int negativeCount(int[] arr) {
     int countN = 0;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] < 0 ) {
             countN++;
         }
     }
     return countN;
    }

    public static int positiveCount(int[] arr) {
        int countP = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 ) {
                countP++;
            }
        }
        return countP;
    }

    public static int[] positiveValues(int[] arr) {
    int countPositives = positiveCount(arr);
    int j = 0;
    int[] positives = new int[countPositives];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives[j] = arr[i];
                j++;
            }
        }
        return positives;
    }
}

