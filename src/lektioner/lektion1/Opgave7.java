package lektioner.lektion1;

public class Opgave7 {
    public static void main(String[] args) {
        System.out.println("I dette program vil jeg bestemme areal og omkreds for en cirkel med en radius på 6,5");
        System.out.println("Først bestemmes arealet:");
        System.out.print("Areal = 2 * radius * π = ");
        System.out.println(2*6.5*Math.PI);
        System.out.println();
        System.out.println("Nu bestemmes omkredsen:");
        System.out.print("Omkreds = radius^2 * π = ");
        System.out.println(Math.pow(6.5, 2)*Math.PI);
    }
}
