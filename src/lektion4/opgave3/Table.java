package lektion4.opgave3;

public class Table {
    public static void main(String[] args) {
        smallTable(9);
        largeTable();

    }
    public static void smallTable(int num) {

        int i = 1;
        while (i <= 10) {
            int number = num * i;
            System.out.printf("%4d", number);
            i++;
        }
        System.out.println();
    }

    public static void largeTable() {
        int n = 1;
        while (n <= 10) {
            smallTable(n);
            n++;
        }
    }

}
