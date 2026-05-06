package semester1.lektion2.opgave4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Opretter et Scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Beder brugeren indtaste indkomst
        System.out.print("Indtast månedlig indkomst ");
        int income = scanner.nextInt();
        int tax = calculateTax(income);
        System.out.println("Årlig skat er " + tax);
    }

    public static int calculateTax(int monthlyIncome) {
        final int BASE_DECUTION = 48_000;
        final int HIGHTAX_MIN = 568_900;
        int yearlyIncome = (monthlyIncome * 12) - BASE_DECUTION;
        if (yearlyIncome <= BASE_DECUTION) {
            return 0;
        }

        int yearlyTax = yearlyIncome * 37 / 100;

        if (yearlyIncome > HIGHTAX_MIN) {
            int highTax = (yearlyIncome - HIGHTAX_MIN) * 15 / 100;
            return (highTax + yearlyTax);
        } else {
            return yearlyTax;
        }
    }
}