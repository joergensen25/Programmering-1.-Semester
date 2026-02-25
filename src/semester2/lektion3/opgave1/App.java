package semester2.lektion3.opgave1;

import java.lang.reflect.Array;

public class App {

    public static void main(String[] args) {

        Chili[] chilies = {
                new Chili("Carolina Reaper", 5_300_000),
                new Chili("Pimento", 300),
                new Chili("Seranno", 16_500),
                new Chili("Tabasco", 40_000)
        };

        double avgStyrke = avg(chilies);
        Measurable strongest = max(chilies);

        System.out.println("Gennemsnitlig styrke: " + avgStyrke + " Scoville.");
        System.out.println("Højeste styrke: " + strongest.getMeasure() + " Scoville.");
    }

    public static Measurable max(Measurable[] objects) {
        Measurable currentMax = objects[0];

        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > currentMax.getMeasure()) {
                currentMax = objects[i];
            }
        }
        return currentMax;
    }

    public static double avg(Measurable[] objects) {

        double sum = 0.0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasure();
        }
        return sum / objects.length;
    }
}
