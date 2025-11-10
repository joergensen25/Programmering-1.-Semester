package lektioner.lektion20.opgave1.model;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals;

    public Car(String license, double pricePerDay, int purchaseYear) {
        this.license = license;
        this.pricePerDay = pricePerDay;
        this.purchaseYear = purchaseYear;
        this.rentals = new ArrayList<>();
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public ArrayList<Rental> getRentals() {
        return new ArrayList<>(rentals);
    }


    public void addRental(Rental rental) {
        if (!rentals.contains(rental)) {
            rentals.add(rental);
            rental.addCar(this);
        }

    }

    public void removeRental(Rental rental) {

    }

    public int getMaxDaysRented() {
        int maxDays = 0;
        for (Rental rental: rentals) {
            if(rental.getDays() > maxDays) {
                maxDays = rental.getDays();
            }
        }
        return maxDays;
    }



    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", purchaseYear=" + purchaseYear +
                '}';
    }
}
