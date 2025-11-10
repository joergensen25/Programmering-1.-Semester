package lektioner.lektion3.example;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        boolean continueRolls = true;
        Scanner scanner = new Scanner(System.in);
        while (continueRolls) {
            int dice = random.nextInt(6) + 1; //nextInt(6) returnerer et heltal imellem 0 og 5;
            System.out.println("Du rullede " + dice);
            System.out.print("Ønsker du at fortsætte? (ja/nej)");
            String answer = scanner.next();
            if (!answer.toLowerCase().equals("ja")) {
                return;
            }
        }
    }
}
