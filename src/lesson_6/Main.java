package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student_1 = new Student("Iva", "Zolotova", 18, 23);
        Student student_2 = new Student("Alexa", "Rich", 19, 22);

        students.add(student_1);
        students.add(student_2);


        List<BaseTeacher> teachers = new ArrayList<>();
        BaseTeacher programmingTeacher = new BaseTeacher("Alla", 22);
        BaseTeacher musicTeacher = new BaseTeacher("Igor", 23);

        teachers.add(programmingTeacher);
        teachers.add(musicTeacher);

        for (BaseTeacher teacher : teachers) {
            if (teacher.getGroup() == 23) {
                System.out.println("Teacher leading in 23 group: " + teacher.getName());

            }  else{
                System.out.println(teacher.getGroup() == 22);
            }

         for (Student student : students) {
             if (student.getGroup() == 23) {
                        System.out.println("Student from group in 23 group: " + student.getName());
               } else{
                   System.out.println(student.getGroup() == 22);
                    }
                }

            }
        }
    }








