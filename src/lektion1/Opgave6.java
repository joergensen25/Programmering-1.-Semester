package lektion1;

public class Opgave6 {
    public static void main(String[] args) {
        System.out.println("Jeg laver her et program, der beregner disse to ligninger:");
        System.out.println();
        System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) og 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13):");
        System.out.println();
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ");
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println("og:");
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = ");
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }
}
