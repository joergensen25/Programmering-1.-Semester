package semester1.lektion2.opgave1;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        double moms = 1.25;
        // Opretter et Scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Beder brugeren indstate et beløb
        System.out.println("Indtast beløb i hele kroner: ");
        int beloeb = scanner.nextInt();

        // Udskriv resultat
        System.out.println("Momsbeløbet er: " + beloeb * moms);



    }
}
