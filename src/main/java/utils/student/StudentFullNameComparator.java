package utils.student;
import models.Student;
import org.apache.commons.lang3.StringUtils;
import utils.UniversalComparator;

public class StudentFullNameComparator implements UniversalComparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getFullName(), s2.getFullName());
    }
}

