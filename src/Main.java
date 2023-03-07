import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Альбус", "Стольной носок", 150));
        people.add(new Person("Пеппи", "Большой длинный носок", 110));
        people.add(new Person("Глория", "Сильно старые джинсы", 102));
        people.add(new Person("Александ", "Повелитель урожая плодородия всея савхоза колхоза и заноза", 55));
        people.add(new Person("Володимир", "Князь всея Руси и ближайших земель наших и не совсем", 58));

        people.sort((Person o1, Person o2) -> {
            int maxCool = 5;
            int oneCoolRating = o1.getSurname().split(" ").length;
            int twoCoolRating = o2.getSurname().split(" ").length;
            if (oneCoolRating == twoCoolRating || (twoCoolRating >= maxCool & twoCoolRating >= maxCool)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else
                return Integer.compare(oneCoolRating, twoCoolRating);
        });

        System.out.println(people);
    }
}