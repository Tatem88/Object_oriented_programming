package lesson_5.Data;

import lesson_5.Data.Controller.Controller;
import lesson_5.Data.Model.Student;
import lesson_5.Data.Model.StudyGroup;
import lesson_5.Data.Model.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher teacher = new Teacher("Mari", "22", 45, 1 );
        Teacher teacher2 = new Teacher("Inga", "23", 40, 2 );

        Student student1 = new Student(1, "Eva");
        Student student2 = new Student(2, "Alexa");
        Student student3 = new Student(3, "Alla");
        List<Student> students = List.of(student1, student2, student3);

        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacher, students);

        System.out.println("Teacher id: " + teacher.toString());
        System.out.println("Student IDs: " + 1 + " " + "Name: " + " " + student1.getName());
        System.out.println("Student IDs: " + 2 + " " + "Name: " + " " + student2.getName());
    /*    for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getStudentId());
        }
        */

    }
}


