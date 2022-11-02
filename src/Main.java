import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //MyComporator myComporator = new MyComporator();

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrey", "Petrov", 34));
        persons.add(new Person("Arseniy", "Vyskov-Tupson", 21));
        persons.add(new Person("Ivan", "Ivanov", 15));
        persons.add(new Person("Alex", "Alex", 16));

        //System.out.println(persons);

        persons.sort(
                (one, two) -> {
                    int length1 = one.getSurname().split("-").length;
                    int length2 = two.getSurname().split("-").length;
                    if (length1 != length2) {
                        return Integer.compare(length1, length2);
                    }

                    return Integer.compare(one.getAge(), two.getAge()); }
        );

        System.out.println(persons.get(persons.toArray().length - 1));

        persons.removeIf(
                (person -> {
                    return person.getAge() < 18;
                })
        );

        //System.out.println(persons);

    }
}
