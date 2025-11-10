package lektioner.lektion21.opgave04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File outfile = new File("resources/oddnumbers.txt");

        try {
            outfile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(outfile);
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        for (int number = 1; number < 100; number+= 2) {
            writer.write(number + "\n");
        }
        writer.close();

    }
}
