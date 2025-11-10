package lektioner.lektion3.opgave04;

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

        if (computerChoice == playerChoice) {
            System.out.println("Uafgjort");
        } else if ((playerChoice == 0 && computerChoice == 1) ||
                (playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 0)) {
            System.out.println("Du vinder");
        }
        else {
            System.out.println("Computeren vinder");
        }
    }
}
