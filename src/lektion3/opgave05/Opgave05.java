package lektion3.opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast nypris: ");
        double price = input.nextDouble();
        double registrationFee = calculateFee(price);
        System.out.println("En bil der koster " + price + " uden registreringsafgift, skal man betale " +
                registrationFee + " i registreringsafgift.");
        input.close();
    }

    public static double calculateFee(double price) {
        double fee = 0;
        if (price <= 67800) {
            fee = price * 0.25;
        } else if (price <= 210600) {
            double lowRegistrationFee = 67800 * 0.25;
            double mediumPrice = price - 67800;
            fee = mediumPrice * 0.85 + lowRegistrationFee;
        } else {
            double highPrice = price - 210600;
            double mediumPrice = price - highPrice - 67800;
            fee = (highPrice*1.5) + (mediumPrice*0.85) + (67800*0.25);
        }
        return fee;
    }
}
