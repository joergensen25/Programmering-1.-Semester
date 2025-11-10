package lektioner.lektion4.opgave4;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(2,31));
    }
    public static long power(int pow1, int pow2) {
        long result = 1;
        int i = 0;

        while (i < pow2) {
            result = result * pow1;
            i++;
        }
        return result;
    }

}
