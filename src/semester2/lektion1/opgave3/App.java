package semester2.lektion1.opgave3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rasmus Jørgensen", LocalDate.of(2000, 1, 7));
        Customer c2 = new Customer("Lars Larsen", LocalDate.of(1966, 5, 11));

        Product p1 = new Product(31, "Bakketomater 500g", 12);
        Product p2 = new Product(51, "Iceberg Salat", 4);
        Product p3 = new Product(72, "Blomkål", 6);
        Product p4 = new Product(81, "Cherrytomater", 15);
        Product p5 = new Product(126, "Agurk", 5);

        Order o1 = new Order(1);
        o1.createOrderLine(24, p1);
        o1.createOrderLine(80, p5);

        Order o2 = new Order(2);
        o2.createOrderLine(30, p2);
        o2.createOrderLine(25, p4);

        Order o3 = new Order(3);
        o3.createOrderLine(50, p3);
        o3.createOrderLine(120, p2);

        Order o4 = new Order(4);
        o4.createOrderLine(30, p3);
        o4.createOrderLine(25, p1);

        c1.addOrder(o1);
        c1.addOrder(o2);
        c1.addOrder(o3);
        c1.addOrder(o4);

        c2.addOrder(o1);
        c2.addOrder(o4);

        c1.setDiscount(new PercentDiscount(15));
        c2.setDiscount(new FixedDiscount(250, 1000));

        System.out.println("Kunde 1 har handlet for: " + c1.totalBuy() + " kr. (med rabat: " + c1.totalBuyWithDiscount() + ").");

        System.out.println("\nKunde 2 har handlet for: " + c2.totalBuy() + " kr. (med rabat: " + c2.totalBuyWithDiscount() + ").");

    }
}
