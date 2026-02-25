package semester2.lektion3.opgave2;

public class Customer implements Comparable<Customer>{
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String fornavn, String efternavn, int alder) {
        this.firstName = fornavn;
        this.lastName = efternavn;
        this.age = alder;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

//    public int compareTo(Customer other) {
//
//        int cmp = this.lastName.compareTo(other.lastName);
//        if (cmp != 0) return cmp;
//
//        cmp = this.firstName.compareTo(other.firstName);
//        if (cmp != 0) return cmp;
//
//        return Integer.compare(this.age, other.age);
//    }

    public int compareTo(Customer o) {

       int compare = this.lastName.compareTo(o.lastName);

       if (compare == 0) {
           compare = this.firstName.compareTo(o.firstName);
       }

       if (compare == 0) {
           compare = this.age - o.age;
       }
       return compare;

    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " (" + age + ")";
    }
}


