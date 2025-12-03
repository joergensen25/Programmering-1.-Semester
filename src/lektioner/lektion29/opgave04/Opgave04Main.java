package lektioner.lektion29.opgave04;

import lektioner.lektion29.opgave04.models.Person;
import lektioner.lektion29.opgave04.testdata.TestDataGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave04Main {

    public static void main(String[] args) {
        ArrayList<Person> people1 = TestDataGenerator.generatePeople();
        System.out.println(people1);
        ArrayList<Person> people2 = TestDataGenerator.generatePeople();
        System.out.println(people2);

        System.out.println(merge(people1, people2));

        ArrayList<Person> merged = merge(people1, people2);

        for (Person p : merged) {
            System.out.println(p);
        }
    }

    public static ArrayList<Person> merge(ArrayList<Person> people1, ArrayList<Person> people2) {

        ArrayList<Person> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < people1.size() && i2 < people2.size()) {

            Person p1 = people1.get(i1);
            Person p2 = people2.get(i2);

            if (p1.compareTo(p2) <= 0) {
                result.add(p1);
                i1++;
            } else {
                result.add(p2);
                i2++;
            }
        }

        while (i1 < people1.size()) {
            result.add(people1.get(i1++));
        }

        while (i2 < people2.size()) {
            result.add(people2.get(i2++));
        }
        return result;
        //Implementer denne metode
    }
}
