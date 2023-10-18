package lesson_4;

public class Teacher {
    private String name;
    private String surname;
    private int age;


    public Teacher(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return getSurname();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Teacher{" +
                "name = " + name + " "+ " surname = " + surname + " age = " + age;}

    }
