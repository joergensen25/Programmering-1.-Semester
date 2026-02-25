package semester2.lektion3.opgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Customer c1 = new Customer("Rasmus", "Jørgensen", 26);
        Customer c2 = new Customer("Esben", "Hansen", 42);
        Customer c3 = new Customer("Lars", "Hansen", 38);
        Customer c4 = new Customer("Donald", "Trump", 78);
        Customer c5 = new Customer("Kim", "Jong Un", 42);
        Customer c6 = new Customer("Vladimir", "Putin", 72);
        Customer c7 = new Customer("Abraham", "Jong Un", 42);
        Customer c8 = new Customer("Donald", "Trump", 42);
        Customer c9 = new Customer("Donald", "Trump", 18);



        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        customers.add(c7);
        customers.add(c8);
        customers.add(c9);


        System.out.println(customers);

        Collections.sort(customers);


        System.out.println(customers);

    }

    public static Customer lastCustomer(Customer[] customers) {
        List<Customer> customersSorted = Arrays.asList(customers);
        Collections.sort(customersSorted);

        return customersSorted.getLast();
    }



    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {


        return null;
    }

}
