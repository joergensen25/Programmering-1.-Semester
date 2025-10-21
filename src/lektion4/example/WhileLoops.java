package lektion4.example;

public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("Nedtælling");
        countDown();
        doubleUp();
    }

    public static void countDown() {
        int counter = 10;
        while(counter > 0) {
            System.out.println(counter);
            counter = counter - 1;
        }
    }

    public static void doubleUp() {
        int number = 1;
        while (number < 100) {
            System.out.println("Tallet er nu: " + number);
            number = number * 2;
        }
    }
}
