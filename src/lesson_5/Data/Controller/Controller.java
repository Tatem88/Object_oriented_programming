package lesson_5.Data.Controller;

import lesson_5.Data.Model.Student;
import lesson_5.Data.Model.StudyGroup;
import lesson_5.Data.Model.StudyGroupService;
import lesson_5.Data.Model.Teacher;

import java.util.List;;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }
    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}


