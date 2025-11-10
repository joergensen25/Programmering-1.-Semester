package lektioner.lektion2.opgave3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast vægt i kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Indtast højde i m: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI er: %.1f", bmi);
    }
}
