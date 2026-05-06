package main.java.semester1.lektion2.opgave2;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {

        double conversionFactor = 1.6;

        // Opretter et Scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Beder brugeren indtaste antal mil:
        System.out.println("Indtast antal mil: ");
        double mil = scanner.nextDouble();

        // Udskriv resultat
        double km = conversionFactor * mil;
        System.out.printf(mil + " mil er %.1f", km);
        System.out.println(" km.");

    }
}
