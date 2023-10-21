package lesson_5.Data.Model;

public class User {
    protected String name;
    protected String group;
    protected int age;

    public User(String name, String group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
    }

    public User(int studentId) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }
}
