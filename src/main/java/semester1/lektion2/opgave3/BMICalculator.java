package main.java.semester1.lektion2.opgave3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        // Opretter et Scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Beder brugeren indtaste vægt
        System.out.print("Indtast vægt i kg: ");
        double weight = scanner.nextDouble();

        // Beder brugeren indtaste højde
        System.out.print("Indtast højde i m: ");
        double height = scanner.nextDouble();

        // Udregner og printer resultat
        double bmi = weight / (height * height);
        System.out.printf("BMI er: %.1f", bmi);
    }
}
