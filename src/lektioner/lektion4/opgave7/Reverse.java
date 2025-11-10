package lektioner.lektion4.opgave7;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(345));
    }

    public static int reverse (int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }
}
