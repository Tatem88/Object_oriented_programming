package lesson_5.Data.Controller;

import lesson_5.Data.Model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentController {
    private List<Student> student;

    public StudentController() {
        this.student = new ArrayList<>();
    }

    public void addStudent(String name, String group, int age, int studentId) {
        student.add(new Student(name, group, age, studentId));
    }

    public Student getStudent(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equals(name)) {
                System.out.println("Student found!");
                System.out.println(student.get(i));


            } else {
                System.out.println("No student");
            }

        }
        return null;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "student=" + student +
                '}';
    }
}
