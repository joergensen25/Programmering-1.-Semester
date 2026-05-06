package main.java.semester1.lektion3.opgave04;

import java.util.Scanner;
import java.util.Random;

public class Opgave04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Velkommen til Sten, Saks, Papir.");
        System.out.println("================================");
        System.out.print("Tast 0 for sten, 1 for saks, 2 for papir: ");
        int playerChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3);
        if (playerChoice == 0) {
            System.out.println("Du valgte sten.");
        } else if (playerChoice == 1) {
            System.out.println("Du valgte saks.");
        } else if (playerChoice == 2) {
            System.out.println("Du valgte papir.");
        } else {
            System.out.println("Fejl. Tast 0, 1 eller 2.");
            return;
        }
        System.out.print("Computeren valgte...");
        if (computerChoice == 0) {
            System.out.println(" Sten!");
        } else if (computerChoice == 1) {
            System.out.println(" Saks!");
        } else {
            System.out.println(" Papir!");
        }

        if (computerChoice == playerChoice) {
            System.out.println("Uafgjort!");
        } else if ((playerChoice == 0 && computerChoice == 1) ||
                (playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 0)) {
            System.out.println("Du vinder!");
        }
        else {
            System.out.println("Computeren vinder :(");
        }
    }
}
