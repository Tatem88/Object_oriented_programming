package lesson_4;

public class Student {
    String name;
    String surname;
    Integer age;

    public Student(String firstName, String lastName, int age) {
        this.name = firstName;
        this.surname = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "firstName= '" + name + '\'' +
                ", lastName= '" + surname + '\'' +
                ", age= " + age +
                '}' + "\n";
    }
}
