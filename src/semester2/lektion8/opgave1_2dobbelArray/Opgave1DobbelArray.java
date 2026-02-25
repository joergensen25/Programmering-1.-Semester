package semester2.lektion8.opgave1_2dobbelArray;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0,4,3,9,6}, {1,3,5,2,2}, {3,3,1,0,1}, {0,0,9,7,1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives:");
        da.udskrivArray(values);
        System.out.println();

        //TODO Tilføj kode der afprøver metoderne du programmerer i klassen DobbelArray til opgave 1
        // ------------------------------------------------------------------------------------------
        // Opgave 1.1:
        System.out.println("Opgave 1.1: Returnerer værdien på en plads i arrayet.");
        System.out.println("Værdien på række 1, kolonne 3 er: " + da.getValueAt(values, 1, 3) + "\n");

        // ------------------------------------------------------------------------------------------
        // Opgave 1.2:
        System.out.println("Opgave 1.2: Sætter værdien på en plads i arrayet.");
        da.setValueAt(values, 0, 0, 2);
        da.udskrivArray(values);
        System.out.println();

        // ------------------------------------------------------------------------------------------
        // Opgave 1.3:
        System.out.println("Opgave 1.3: Returnerer summen af en række i arrayet.");
        System.out.println("Summen af række 0 er: " + da.sumRow(values, 0) + "\n");

        // ------------------------------------------------------------------------------------------
        // Opgave 1.4:
        System.out.println("Opgave 1.4: Returnerer summen af en kolonne i arrayet.");
        System.out.println("Summen af kolonne 1 er: " + da.sumCol(values, 1) + "\n");

        // ------------------------------------------------------------------------------------------
        // Opgave 1.5:
        System.out.println("Opgave 1.5: Returnerer summen af alle tallene i arrayet.");
        System.out.println("Summen af tallene i arrayet er: " + da.sum(values));
    }




}
