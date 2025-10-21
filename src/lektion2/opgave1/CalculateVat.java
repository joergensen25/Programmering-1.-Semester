package lektion2.opgave1;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moms = 1.25;
        System.out.println("Indtast beløb i hele kroner: ");
        int i = scanner.nextInt();
        System.out.println("Momsbeløbet er: " + i * moms);
    }
}
