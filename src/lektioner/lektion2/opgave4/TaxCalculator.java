package lektioner.lektion2.opgave4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast månedlig indkomst: ");
        int income = scanner.nextInt();
        double tax = calculateTax(income);
        System.out.printf("Månedlig skat er: %.2f kr.%n", tax);
    }

    public static double calculateTax(int monthlyIncome) {
        final int BASE_DEDUCTION = 48_000;
        final int HIGH_TAX_THRESHOLD = 568_900;

        int yearlyIncome = monthlyIncome * 12;
        int taxIncome = yearlyIncome - BASE_DEDUCTION;

        if (taxIncome <= 0) {
            return 0;
        }

        double yearlyTax = taxIncome * 0.37;
        double monthlyTax = yearlyTax / 12;

        if (taxIncome > HIGH_TAX_THRESHOLD) {
            double highTaxIncome = taxIncome - HIGH_TAX_THRESHOLD;
            double yearlyHighTax = highTaxIncome * 15 / 100;
            double monthlyHighTax = yearlyHighTax / 12;

            return monthlyTax + monthlyHighTax;
        }
        return monthlyTax;
    }
}
