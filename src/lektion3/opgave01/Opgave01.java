package lektion3.opgave01;

import java.util.Scanner;

public class Opgave01 {

    public static final int MINIMUM_AGE = 16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast alder: ");
        int alder = scanner.nextInt();
        System.out.print("Indtast alkoholprocent: ");
        double alkoholProcent = scanner.nextDouble();

        if (alder >= 18)
            System.out.println("En person på " + alder + " må gerne købe alkohol med en alkoholprocent på " + alkoholProcent + "%");
        else if (alder >= 16 && alkoholProcent >= 16.5)
            System.out.println("En person på " + alder + " må ikke købe alkohol med en alkoholprocent på " + alkoholProcent + "%");
        else if (alder >= 16 && alkoholProcent < 16.5)
            System.out.println("En person på " + alder + " må gerne købe alkohol med en alkoholprocent på " + alkoholProcent + "%");
        else if (alder < 16 && alkoholProcent > 1.2)
            System.out.println("En person på " + alder + " må ikke købe alkohol med en alkoholprocent på " + alkoholProcent + "%");
        else
            System.out.println("En person på " + alder + " må gerne købe alkohol med en alkoholprocent på " + alkoholProcent + "%");
    }
}
