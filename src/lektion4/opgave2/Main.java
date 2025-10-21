package lektion4.opgave2;

public class Main {
    public static void main(String[] args) {
        System.out.println(evenNumbers(0));
        System.out.println(qubicNumbers(1000));
    }
   public static int evenNumbers(int limit) {
        int sum = 0;
        int i = 2;

        while (i <= limit) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    public static int qubicNumbers(int limit) {
        int sum = 0;
        int i = 1;
        while (i * i < limit) {
            sum += i * i;
            i++;
        }
        return sum;
    }
}
