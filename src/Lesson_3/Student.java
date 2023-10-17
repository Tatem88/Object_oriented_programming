package Lesson_3;

public class Student implements Comparable<Student> {
    private String Name;
    private String Surname;
    private int Age;
    private String NameOfGroup;

    public String getNameofGroup() {
        return NameOfGroup;
    }

    public Student(String name, String surname, int age, String NameOfGroup) {
        Name = name;
        Surname = surname;
        Age = age;
        this.NameOfGroup = NameOfGroup;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }




    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", NameofGroup='" + NameOfGroup + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.Name.length() - otherStudent.getName().length();

    }
}
