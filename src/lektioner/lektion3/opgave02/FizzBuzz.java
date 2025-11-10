package lektioner.lektion3.opgave02;

public class FizzBuzz {
    public static void main(String[] args) {
        int currentNumber = 1;
        while (currentNumber <= 40) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                System.out.print("FizzBuzz");
            }
            else if (currentNumber % 5 == 0)
                System.out.print("Buzz");
            else if (currentNumber % 3 == 0)
                System.out.print("Fizz");
            else
                System.out.print(currentNumber);

            if (currentNumber < 40)
                System.out.print(", ");


            currentNumber++;

        }
    }
}
