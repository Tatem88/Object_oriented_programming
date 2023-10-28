package lesson_6;

public class Student {
    String name;
    String surname;
    Integer age;
    Integer group;

    public Student(String firstName, String lastName, int age, int group) {
        this.name = firstName;
        this.surname = lastName;
        this.age = age;
        this.group = group;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.age = group;
    }


    @Override
    public String toString() {
        return "Student: {" +
                "firstName= '" + name + '\'' +
                ", lastName= '" + surname + '\'' +
                ", age= " + age + "group = " + group +
                 "\n";
    }
}
