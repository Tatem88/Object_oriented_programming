package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class GroupofStudents implements Iterable<Student> {


    private String groupName;
    private List<Student> studentList;

    public GroupofStudents(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = new ArrayList<>();
    }

    public int getSize() {
        return studentList.size();
    }

    public Student getIndex(int index) {
        return studentList.get(index);
    }

    public String getGroupofStudents() {
        return groupName;
    }

    public void setGroupofStudents(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName= '" + groupName + '\'' +
                ", studentList= " + studentList +
                '}';
    }

    @Override
    public UserIterator iterator() {
        return new UserIterator(studentList);
    }

}
