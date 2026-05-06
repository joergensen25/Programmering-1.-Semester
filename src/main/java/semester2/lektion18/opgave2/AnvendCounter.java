package main.java.semester2.lektion18.opgave2;

public class AnvendCounter {

    public static void main(String[] args) {

        Counter counter = Counter.getInstance();


        counter.count();
        counter.count();
        counter.times2();


        System.out.println("Value: " + counter.getValue());


        counter.zero();
        System.out.println("After reset: " + counter.getValue());

    }
}
