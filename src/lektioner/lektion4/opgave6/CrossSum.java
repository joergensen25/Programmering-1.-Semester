package lektioner.lektion4.opgave6;

public class CrossSum {
    public static void main(String[] args) {

        System.out.println(crossSum(999));

    }
    public static int crossSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        return sum;

    }

}
