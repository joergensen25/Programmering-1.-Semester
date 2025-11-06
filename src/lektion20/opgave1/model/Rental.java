package lektion20.opgave1.model;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars;

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
        this.cars = new ArrayList<>();
    }

    public int getDays() {
        return days;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
            car.addRental(this);
        }

    }

    public void removeCar(Car car) {

    }

    @Override
    public String toString() {
        return "Rental{" +
                "number=" + number +
                ", days=" + days +
                ", date='" + date + '\'' +
                '}';
    }


}
