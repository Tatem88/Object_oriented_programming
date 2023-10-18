package lesson_4;

import java.util.Comparator;

public class UserComporator<T extends User>  implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.name.length() - o2.name.length();
    }
}
