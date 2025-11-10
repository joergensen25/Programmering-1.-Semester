package lektioner.lektion21.opgave05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("resources/inputNumbers.txt");

            System.out.println("Indtast positive heltal, afslut med -1");

            try {
                while (true) {

                    int number = scanner.nextInt();

                    if (number == -1) {
                        break;
                    }

                    if (number > 0) {
                        writer.write(number + "\n");
                    } else {
                        System.out.println("Kun positive tal tilladt");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ugyldigt input. Indtast et positivt heltal");
                scanner.nextLine();

            }

            writer.close();
            System.out.println("Tallene er skrevet til filen");


        } catch (IOException e) {
            System.out.println("Der opstod en fejl.");
            e.printStackTrace();

        }


    }
}
