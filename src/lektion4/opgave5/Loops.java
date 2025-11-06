package lektion4.opgave5;

public class Loops {
    public static void main(String[] args) {
        patternA();
        System.out.println();
        patternB();
        System.out.println();
        patternC();
        System.out.println();
        patternD();
        System.out.println();
        printPattern(false, false);
    }

    public static void patternA() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternB() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void patternC() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternD() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern(boolean growsDown, boolean rightAligned) {
        int lines = 5;

        for (int i = 1; i <= lines; i++) {

            int stars = 0;
            int spaces = lines - stars;
            if (growsDown) {
                stars = i;
            } else {
                stars = lines - i +1;
            }
            
            if (rightAligned) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
