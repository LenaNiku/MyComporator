import java.util.Comparator;

public class MyComporator implements Comparator<Person> {

    @Override
    public int compare (Person one, Person two) {
        int lenght1 = one.getSurname().split("-").length;
        int lenght2 = two.getSurname().split("-").length;
        if (lenght1 != lenght2) {
            return Integer.compare(lenght1,lenght2);
        }

        return Integer.compare(one.getAge(), two.getAge());
    }
}


