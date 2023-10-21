package lesson_5.Data.View;

import lesson_5.Data.Controller.StudentController;


public class StudentView {
    StudentController controllerStudent = new StudentController();

    public StudentView() {
        this.controllerStudent = controllerStudent;
    }

    public void saveStudent(String name, String group, int age, int studentId) {
        controllerStudent.addStudent(name, group, age, studentId);
    }

    public void getStudent(String name) {
        controllerStudent.getStudent(name);
    }


}
