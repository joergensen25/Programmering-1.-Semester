package semester2.lektion5.opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> karakterAntal = new HashMap<>();
        Map<String, Integer> karakterSum = new HashMap<>();

        File file = new File("C:/Java/Programmering1Semester/resources/Film");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String filmTitel = scanner.nextLine();
            System.out.println(scanner.nextLine());
        }
    }
}
