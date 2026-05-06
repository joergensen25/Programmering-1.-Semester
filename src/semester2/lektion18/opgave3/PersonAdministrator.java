package semester2.lektion18.opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {

    private static PersonAdministrator instance;

    private Set<Person> personer;

    private PersonAdministrator() {
        personer = new HashSet<>();
    }

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    public void add(Person person) {
        personer.add(person);
    }

    public Set<Person> getPersoner() {
        return new HashSet<>(personer);
    }

    public void remove(Person person) {
        personer.remove(person);
    }
}
