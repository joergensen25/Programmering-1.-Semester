package lektioner.lektion21.opgave03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            File file = new File("resources/numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.add(number);
            }
            scanner.close();

            System.out.println("Tallene i omvendt rækkefølge er: ");
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.println(numbers.get(i));
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
