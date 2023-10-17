package Lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> numberoFGroup = new ArrayList<>();
            System.out.println("iterating:");
            Iterator<Student> iterator = numberoFGroup.iterator();
            while (iterator.hasNext()) {
                Student person = iterator.next();
                System.out.println("Name: " + person.getName());
                System.out.println("Surname: " + person.getSurname());
                System.out.println("Age: " + person.getAge());
                System.out.println("Name of group: " + person.getNameofGroup());
            }

            Comparator<Student> studentComp = new StudentComporator()
                    .thenComparing(new StudentComporator.StudentAgeComparator());
            TreeSet<Student> checkStudents = new TreeSet<>(studentComp);
            checkStudents.add(new Student("Ivan", "Zolotov", 17, "5555"));
            checkStudents.add(new Student("Roman", "Chekhov", 18, "7777"));
            checkStudents.add(new Student("Alex", "Rich", 17, "7777"));
            checkStudents.add(new Student("Mira", "Karp", 19, "8888"));
            checkStudents.add(new Student("Vlad", "Lipov", 19, "9999"));
            for (Student std : checkStudents) {
                System.out.println(std.getName() + " " + std.getSurname() + ", " + std.getAge() + " years old, "
                        + "group number" + " " + std.getNameofGroup());
            }
        }
    }


