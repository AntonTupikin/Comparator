import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxCool;

    public PersonComparator(int maxCool) {
        this.maxCool = maxCool;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int oneCoolRating = o1.getSurname().split(" ").length;
        int twoCoolRating = o2.getSurname().split(" ").length;
        if (oneCoolRating == twoCoolRating || (twoCoolRating >= maxCool & twoCoolRating >= maxCool)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else
            return Integer.compare(oneCoolRating, twoCoolRating);
    }
}
