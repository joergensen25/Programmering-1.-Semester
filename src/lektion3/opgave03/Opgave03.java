package lektion3.opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et tal mellem 0-6, hvor 0 repræsenterer mandag: ");
        int today = scanner.nextInt();
        if (today < 0 || today > 6) {
            System.out.println("Fejl: Tallet skal være mellem 0 og 6.");
            return;
        }

        System.out.print("Indtast antal dage efter i dag: ");
        int daysAhead = scanner.nextInt();
        int futureDay = today + daysAhead % 7;


        if (futureDay == 0) {
            System.out.println("Den fremtidige ugedag er en mandag.");
        }
        else if (futureDay == 1) {
            System.out.println("Den fremtidige ugedag er en tirsdag");
        }
        else if (futureDay == 2) {
            System.out.println("Den fremtidige ugedag er en onsdag");
        }
        else if (futureDay == 3) {
            System.out.println("Den fremtidige ugedag er en torsdag");
        }
        else if (futureDay == 4) {
            System.out.println("Den fremtidige ugedag er en fredag");
        }
        else if (futureDay == 5) {
            System.out.println("Den fremtidige ugedag er en lørdag");
        }
        else if (futureDay == 6) {
            System.out.println("Den fremtidige ugedag er en søndag");
        }
    }
}
