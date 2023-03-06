import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Альбус", "Стольной носок", 150));
        people.add(new Person("Пеппи", "Большой длинный носок", 110));
        people.add(new Person("Глория", "Сильно старые джинсы", 102));
        people.add(new Person("Александ", "Повелитель урожая плодородия всея савхоза колхоза и заноза", 55));
        people.add(new Person("Володимир", "Князь всея Руси и ближайших земель наших и не совсем", 52));

        Collections.sort(people, new PersonComparator(5));
        System.out.println(people);
    }
}