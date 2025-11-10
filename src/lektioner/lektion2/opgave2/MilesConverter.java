package lektioner.lektion2.opgave2;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        double convert = 1.6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal mil: ");
        double mil = scanner.nextDouble();
        double km = convert * mil;
        System.out.printf(mil + " mil er %.1f", km);
        System.out.println(" km.");

    }
}
