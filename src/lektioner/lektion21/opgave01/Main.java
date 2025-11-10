package lektioner.lektion21.opgave01;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Hvilket nr. primtal skal vises?: ");
                int n = scanner.nextInt();
                System.out.println("Primtal nr. " + n + " er "
                        + primes[n - 1] + "\n");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indtast venligst et nummer fra 1-10.");
        }catch (InputMismatchException e) {
            System.out.println("Indtast venligst et heltal.");
        }
    }
}
