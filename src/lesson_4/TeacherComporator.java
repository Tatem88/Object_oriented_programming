package lesson_4;

import java.util.Comparator;

public class TeacherComporator <T extends Teacher>  implements Comparator<T>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getName().length() - o2.getName().length();
    }
}


