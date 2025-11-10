package lektioner.lektion20.opgave2;

import lektioner.lektion20.opgave2.model.Gift;
import lektioner.lektion20.opgave2.model.Person;

public class App {
    public static void main(String[] args) {

        // Opretter nogle personer
        Person hanne = new Person("Hanne", 46);
        Person frank = new Person("Frank", 36);
        Person emil = new Person("Emil", 25);

        // Opretter nogle gaver
        Gift gift1 = new Gift("Skateboard", 399);
        Gift gift2 = new Gift("Computer", 4999);
        Gift gift3 = new Gift("Sengetøj", 150);

        // Giver Hanne to gaver
        hanne.addGift(gift1);
        hanne.addGift(gift2);


        // Finder værdien af gaverne Hanne har fået
        System.out.println("Værdien af alle gaver Hanne har fået er: "
                + hanne.getValueOfAllGifts());
    }
}
