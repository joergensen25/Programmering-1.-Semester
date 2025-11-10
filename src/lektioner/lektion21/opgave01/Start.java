package lektioner.lektion21.opgave01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        try {
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Indtast venligst et heltal.");
        } catch (IllegalStateException e) {
            System.out.println("Scanneren er lukket.");
        }
    }
}
