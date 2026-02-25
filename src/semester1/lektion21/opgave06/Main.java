package semester1.lektion21.opgave06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources/opgave06/data.txt");
        int max = maximum(file);
        System.out.println("Det største tal i filen er: " + max);
    }

    public static int maximum(File file) {
        int max = Integer.MIN_VALUE;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextInt()) {
                try {
                    int number = scanner.nextInt();
                    if (number > max) {
                        max = number;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ugyldigt input i filen");
                    scanner.next();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen " + file.getName() + " blev ikke fundet.");
        } catch (Exception e) {
            System.out.println("Der opstod en fejl: " + e.getMessage());
        }

        return max;
    }
}





