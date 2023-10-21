package lesson_5.Data.Model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String group, int age, int teacherId) {
        super(name, group, age);
        this.teacherId = teacherId;
    }



    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId= " + getTeacherId() + " " + '\''  + "Name: " + name +
                '}';
    }
}