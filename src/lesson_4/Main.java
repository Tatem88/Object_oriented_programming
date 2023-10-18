package lesson_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> students = new ArrayList<>();
        User user_1 = new User("A", "B");
        User user_2 = new User("Iva", "Zolotova");
        User user_3 = new User("Romans", "Chekhov");
        User user_4 = new User("Alexa", "Rich");
        User user_5 = new User("Mira", "Karp");
        User user_6 = new User("Vladimir", "Lipov");

        students.add(user_1);
        students.add(user_2);
        students.add(user_3);
        students.add(user_4);
        students.add(user_5);
        students.add(user_6);

        students.sort(new UserComporator<>());
        System.out.println(students);


        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher_1 = new Teacher("Alla", "Dostoevskaya", 25);
        Teacher teacher_2= new Teacher("Elina", "Mozart",  30);
        Teacher teacher_3= new Teacher("Eva", "Mitnik",  39);

        teachers.add(teacher_1);
        teachers.add(teacher_2);
        teachers.add(teacher_3);

        teachers.sort(new TeacherComporator<>());
        System.out.println(teachers);

        for (Teacher teacher : teachers) {

            System.out.println(teacher.getName());



            }
        }
    }







