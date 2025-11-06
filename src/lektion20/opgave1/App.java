package lektion20.opgave1;

import lektion20.opgave1.model.Car;
import lektion20.opgave1.model.Rental;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("AI 27 839", 350, 2006);
        Car car2 = new Car("BC 96 824", 650, 2012);
        Car car3 = new Car("LK 28 532", 900, 2018);

        Rental rental1 = new Rental(1, 5, "20/11-2025");
        Rental rental2 = new Rental(2, 3, "07/11-2025");
        Rental rental3 = new Rental(3, 10, "02/12-2025");

        // Tilføjer biler til rental 1 (tester addCar)
        rental1.addCar(car1);
        rental1.addCar(car2);

        // Tilføjer biler til rental2 (tester addRental)
        car2.addRental(rental2);
        car3.addRental(rental2);

        // Tilfjer car1 til rental3
        car1.addRental(rental3);

        // Tjek om rental har gemt car.
        System.out.println("Har rental1 gemt car1? " + rental1.getCars().contains(car1));
        System.out.println("Biler tilføjet til rental1: " + rental1.getCars());
        System.out.println();
        System.out.println("Har rental2 gemt car2? " + rental2.getCars().contains(car2));
        System.out.println("Biler tilføjet til rental2: " + rental2.getCars());
        System.out.println();

        // Tjek om car har gemt rental.
        System.out.println("Har car1 gemt rental1? " + car1.getRentals().contains(rental1));
        System.out.println("Rentals tilføjet til car1: " + car1.getRentals());

        System.out.println();
        System.out.println("Har car3 gemt rental2? " + car3.getRentals().contains(rental2));
        System.out.println();


        // Tester getMaxDaysRented metoden
        System.out.println("Car1 har højest været udlejet i " +
                car1.getMaxDaysRented() + " dage.");

    }
}
