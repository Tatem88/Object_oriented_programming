package lesson_4;

public class User {
    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "User{" +
                "name = " + name + " "+ "surname = " + " "+ surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

