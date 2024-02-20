package utils.student;

import models.Student;
import utils.UniversalComparator;

public class StudentCurrentCourseNumberComparator implements UniversalComparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCurrentCourseNumber(), s2.getCurrentCourseNumber());
    }
}

