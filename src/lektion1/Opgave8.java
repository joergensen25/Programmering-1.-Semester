package lektion1;

public class Opgave8 {
    public static void main(String[] args) {
        System.out.println("I dette program vil jeg bestemme gennemsnitshastigheden for en løber, " +
                "der løber 15 kilometer på 50 minutter og 30 sekunder. Svaret skal angives i mil per time.");
        System.out.println("Først bestemmer jeg omregner jeg 15 kilometer til mil:");
        System.out.print("Da 1 mil er 1,6 kilometer, er 15 km: 15 / 1.6 = ");
        System.out.print(15/1.6);
        System.out.println(" mil");
        System.out.println();
        System.out.println("Hastigheden bestemmes som: Hastighed = Distance * 60 / tid i min");
        System.out.println("Dvs. hastigheden i mil per time bliver: ");
        System.out.print("9.375 * 60 / 50.5 = ");
        System.out.print(9.375*60/50.5);
        System.out.println(" mil per time");
    }
}
