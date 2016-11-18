package denis_prokopjuk.webinar7_8.comparator;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge()-o2.getAge();
    }
}