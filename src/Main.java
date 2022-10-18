import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyComporator myComporator = new MyComporator();

        Person person1 = new Person("Andrey", "Petrov", 34);
        Person person2 = new Person("Arseniy", "Vyskov-Tupson", 21);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        Collections.sort(persons, myComporator);
        System.out.println(persons.get(persons.toArray().length - 1));
    }
}
