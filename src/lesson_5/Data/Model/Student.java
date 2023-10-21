package lesson_5.Data.Model;

public class Student extends User {
    int studentId;

    public Student(String name, String group, int age, int studentId) {
        super(name, group, age);
        this.studentId = studentId;
    }

    public Student(int studentId, String name) {
        super(studentId);
        this.name= name;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }

    public void getInfoStudent(String name, String group, int age, int studentId) {
        System.out.println("Student:" + name + group + age + studentId);
    }
}
