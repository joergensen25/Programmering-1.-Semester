package lektion20.opgave2.model;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> gifts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gifts = new ArrayList<>();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Gift> getGifts() {
        return new ArrayList<>(gifts);
    }

    public void addGift (Gift gift) {
        gifts.add(gift);
    }

    public double getValueOfAllGifts() {
        double valueOfGifts = 0;
        if (gifts == null) {
            return 0;
        } else {
            for (Gift gift  : gifts)
                valueOfGifts += gift.getPrice();

        } return valueOfGifts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
