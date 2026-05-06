package semester2.lektion18.opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {

        PersonAdministrator admin = PersonAdministrator.getInstance();

        Person p1 = new Person("Phil", 35);
        Person p2 = new Person("Hannah", 25);

        admin.add(p1);
        admin.add(p2);

        System.out.println("Personer:");
        for (Person p : admin.getPersoner()) {
            System.out.println(p);
        }

        admin.remove(p1);


        System.out.println("\nEfter fjernelse:");
        for (Person p : admin.getPersoner()) {
            System.out.println(p);
        }
    }
}
