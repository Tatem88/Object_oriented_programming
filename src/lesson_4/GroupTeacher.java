package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class GroupTeacher <T extends Teacher>{
    private List<T> teachers;


    public GroupTeacher() {
        teachers= new ArrayList<>();
    }

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(T teacher) {
        teachers.remove(teacher);
    }

    public List<T> getTeachers() {
        return teachers;
    }
}