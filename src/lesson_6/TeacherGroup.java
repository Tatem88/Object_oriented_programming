package lesson_6;
import java.util.ArrayList;

class TeacherGroup<T extends Teacher> {
    private String groupName;
    private ArrayList<T> teachers;

    public TeacherGroup(String groupName) {
        this.groupName = groupName;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(T teacher) {
        teachers.remove(teacher);
    }

    public void teachStudents() {
        for (T teacher : teachers) {
            teacher.teach();
        }
    }
}
