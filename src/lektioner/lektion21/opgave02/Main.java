package lektioner.lektion21.opgave02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources/numbers.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt()* 2);
        }
        scanner.close();

    }
}
