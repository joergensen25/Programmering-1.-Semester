package lektioner.lektion29.opgave01.models;

public class Character implements Comparable<Character> {
    private String name;
    private House house;

    public Character() {
    }

    public House getHouse() {
        return house;
    }

    @Override
    public int compareTo(Character other) {
        return name.compareTo(other.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
