package semester2.lektion4.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Sanne", 32),
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		System.out.println("a) Første person med alderen 44:\n" +
				findFirst(persons, p -> p.getAge() == 44) + "\n");

		System.out.println("b) Første person med navn der starter med S:\n" +
				findFirst(persons, p -> p.getName().startsWith("S")) + "\n");

		System.out.println("c) Første person hvis navn der har mere end et 'i':\n" +
				findFirst(persons, p -> p.getName().split("i", 3).length >= 3) + "\n");

		System.out.println("d) Første person med en alder der er lig længden af navnet:\n" +
				findFirst(persons, p -> p.getName().length() == p.getAge()) + "\n");

		System.out.println("e) Alle personer under 30:\n" +
				findAll(persons, p -> p.getAge() < 30) + "\n");

		System.out.println("f) Alle personer hvis navn indeholder et 'i':\n" +
				findAll(persons, p -> p.getName().contains("i")) + "\n");

		System.out.println("g) Alle personer hvis navn starter med 'S':\n" +
				findAll(persons, p -> p.getName().startsWith("S")) + "\n");

		System.out.println("h) Alle personer hvis navn har en længde på 5:\n" +
				findAll(persons, p -> p.getName().length() == 5) + "\n");

		System.out.println("i) Alle personer hvis navn har en længde på mindst 6 og alder under 40:\n" +
				findAll(persons, p -> p.getName().length() >= 6 && p.getAge() < 40));


//		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
		List<Person> personList = new ArrayList<>();
		for (Person p : list) {
			if (filter.test(p))
				personList.add(p);

		}
		return personList;
	}
}
